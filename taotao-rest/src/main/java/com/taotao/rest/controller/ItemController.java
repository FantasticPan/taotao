package com.taotao.rest.controller;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.rest.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品信息Controller
 * Created by FantasticPan on 2018/8/2.
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/info/{itemId}")
    @ResponseBody
    public TaotaoResult getItemBaseInfo(@PathVariable Long itemId) {
        return itemService.getItemBaseInfo(itemId);
    }

    @RequestMapping("/desc/{itemId}")
    @ResponseBody
    public TaotaoResult getItemDesc(@PathVariable Long itemId) {
        return itemService.getItemDesc(itemId);
    }

    @RequestMapping("/param/{itemId}")
    @ResponseBody
    public TaotaoResult getItemParam(@PathVariable Long itemId) {
        return itemService.getItemParam(itemId);
    }
}
