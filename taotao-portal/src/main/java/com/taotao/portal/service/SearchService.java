package com.taotao.portal.service;

import com.taotao.portal.pojo.SearchResult;

/**
 * Created by FantasticPan on 2018/7/31.
 */
public interface SearchService {

    SearchResult search(String queryString, int page);
}
