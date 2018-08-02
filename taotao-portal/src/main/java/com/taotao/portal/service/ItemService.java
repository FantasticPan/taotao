package com.taotao.portal.service;

import com.taotao.portal.pojo.ItemInfo;

/**
 * Created by FantasticPan on 2018/8/2.
 */
public interface ItemService {

    ItemInfo getItemById(Long itemId);

    String getItemDescById(Long itemId);
}
