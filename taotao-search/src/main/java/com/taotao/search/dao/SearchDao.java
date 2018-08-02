package com.taotao.search.dao;

import com.taotao.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;

/**
 * Created by FantasticPan on 2018/7/28.
 */
public interface SearchDao {

    SearchResult search(SolrQuery query) throws SolrServerException;
}
