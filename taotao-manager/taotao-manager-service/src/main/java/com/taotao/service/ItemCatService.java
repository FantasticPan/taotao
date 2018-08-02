package com.taotao.service;

import com.taotao.common.pojo.EUTreeNode;

import java.util.List;

/**
 * Created by FantasticPan on 2018/7/11.
 */
public interface ItemCatService {

    List<EUTreeNode> getCatList(long parentId);
}
