package com.taotao.order.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbOrder;
import com.taotao.pojo.TbOrderItem;
import com.taotao.pojo.TbOrderShipping;

import java.util.List;

/**
 * Created by FantasticPan on 2018/8/27.
 */
public interface OrderService {

    TaotaoResult createOrder(TbOrder order, List<TbOrderItem> itemList, TbOrderShipping orderShipping);
}
