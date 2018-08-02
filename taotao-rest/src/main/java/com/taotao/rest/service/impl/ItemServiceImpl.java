package com.taotao.rest.service.impl;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.rest.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by FantasticPan on 2018/8/2.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TaotaoResult getItemBaseInfo(long itemId) {
        //根据商品id查询商品信息
        TbItem item = itemMapper.selectByPrimaryKey(itemId);
        //使用TaotaoResult包装一下
        return TaotaoResult.ok(item);
    }
}
