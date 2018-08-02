package com.taotao.portal.service.impl;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.util.HttpClientUtil;
import com.taotao.pojo.TbItemDesc;
import com.taotao.portal.pojo.ItemInfo;
import com.taotao.portal.service.ItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by FantasticPan on 2018/8/2.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;
    @Value("${ITEM_INFO_URL}")
    private String ITEM_INFO_URL;
    @Value("${ITEM_DESC_URL}")
    private String ITEM_DESC_URL;

    @Override
    public ItemInfo getItemById(Long itemId) {
        try {
            //调用rest的服务查询商品基本信息
            String json = HttpClientUtil.doGet(REST_BASE_URL + ITEM_INFO_URL + itemId);
            if (!StringUtils.isBlank(json)) {
                TaotaoResult taotaoResult = TaotaoResult.formatToPojo(json, ItemInfo.class);
                if (taotaoResult.getStatus() == 200) {
                    return (ItemInfo) taotaoResult.getData();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getItemDescById(Long itemId) {
        try {
            //查询商品描述
            String json = HttpClientUtil.doGet(REST_BASE_URL + ITEM_DESC_URL + itemId);
            //转换成java对象
            TaotaoResult taotaoResult = TaotaoResult.formatToPojo(json, TbItemDesc.class);
            if (taotaoResult.getStatus() == 200) {
                TbItemDesc itemDesc = (TbItemDesc) taotaoResult.getData();
                //取商品描述信息
                return itemDesc.getItemDesc();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
