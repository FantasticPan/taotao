package com.taotao.order.service;

import com.taotao.common.pojo.TaotaoResult;

/**
 * Created by FantasticPan on 2018/8/2.
 */
public interface ItemService {

    TaotaoResult getItemBaseInfo(long itemId);

    TaotaoResult getItemDesc(long itemId);

    TaotaoResult getItemParam(long itemId);
}
