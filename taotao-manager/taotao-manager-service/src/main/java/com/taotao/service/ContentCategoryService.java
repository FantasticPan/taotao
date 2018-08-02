package com.taotao.service;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.common.pojo.TaotaoResult;

import java.util.List;

/**
 * Created by FantasticPan on 2018/7/22.
 */
public interface ContentCategoryService {

    List<EUTreeNode> getCategoryList(long parentId);

    TaotaoResult insertContentCategory(long parentId, String name);
}
