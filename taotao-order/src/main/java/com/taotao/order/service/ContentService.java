package com.taotao.order.service;

import com.taotao.pojo.TbContent;

import java.util.List;

/**
 * Created by FantasticPan on 2018/7/24.
 */
public interface ContentService {

    List<TbContent> getContentList(long contentCid);
}
