package com.taotao.search.service;

import com.taotao.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrServerException;

/**
 * Created by FantasticPan on 2018/7/28.
 */
public interface SearchService {

    SearchResult search(String queryString, int page, int rows) throws SolrServerException;
}
