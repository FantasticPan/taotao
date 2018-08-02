package com.taotao.rest.controller;

import com.taotao.rest.pojo.ItemCatResult;
import com.taotao.rest.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品分类列表
 * Created by FantasticPan on 2018/7/20.
 */
@Controller
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    //方法1
    //@RequestMapping(value = "/itemcat/list", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    //@ResponseBody
    //public String getItemCatList(String callback) {
    //    ItemCatResult catResult = itemCatService.getItemCatList();
    //    //把pojo转换成字符串
    //    String json = JsonUtils.objectToJson(catResult);
    //    //拼装返回值
    //    return callback + "(" + json + ");";
    //}

    //方法2
    @RequestMapping("/itemcat/list")
    @ResponseBody
    public Object getItemCatList(String callback) {
        ItemCatResult catResult = itemCatService.getItemCatList();
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
        mappingJacksonValue.setJsonpFunction(callback);
        return mappingJacksonValue;
    }
}
