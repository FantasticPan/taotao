package com.taotao.search.solrj;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

/**
 * Created by FantasticPan on 2018/7/28.
 */
public class SolrTest {

    @Test
    public void queryDocument() throws Exception {
        SolrServer solrServer = new HttpSolrServer("http://192.168.231.110:8080/solr");
        //创建一个查询对象
        SolrQuery query = new SolrQuery();
        //设置查询条件
        query.setQuery("*:*");
        query.setStart(20);
        query.setRows(50);
        //执行查询
        QueryResponse response = solrServer.query(query);
        //取查询结果
        SolrDocumentList solrDocumentList = response.getResults();
        System.out.println("共查询到记录：" + solrDocumentList.getNumFound());
        for (SolrDocument solrDocument : solrDocumentList) {
            System.out.println(solrDocument.get("id"));
            System.out.println(solrDocument.get("item_title"));
            System.out.println(solrDocument.get("item_price"));
            System.out.println(solrDocument.get("item_image"));
        }
    }
}
