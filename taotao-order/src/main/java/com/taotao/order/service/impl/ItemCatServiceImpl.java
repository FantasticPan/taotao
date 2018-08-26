package com.taotao.order.service.impl;

import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.order.pojo.CatNode;
import com.taotao.order.pojo.ItemCatResult;
import com.taotao.order.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FantasticPan on 2018/7/20.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public ItemCatResult getItemCatList() {
        ItemCatResult catResult = new ItemCatResult();
        //查询分类列表
        catResult.setData(getCatList(0));
        return catResult;
    }

    /**
     * 查询分类列表方法
     */
    private List<?> getCatList(long parentId) {
        //创建查询条件
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        //返回值list
        List resultList = new ArrayList<>();
        //向list中添加结点
        int count = 0;
        for (TbItemCat tbItemCat : list) {
            //判断是否为父节点
            if (tbItemCat.getIsParent()) {
                CatNode catNode = new CatNode();
                if (parentId == 0) {
                    catNode.setName("<a href='/products/" + tbItemCat.getId() + ".html'>" + tbItemCat.getName() + "</a>");
                } else {
                    catNode.setName(tbItemCat.getName());
                }
                catNode.setUrl("/products/" + tbItemCat.getId() + ".html");
                catNode.setItem(getCatList(tbItemCat.getId()));
                resultList.add(catNode);
                count++;
                //第一层只取14条记录
                if (parentId == 0 && count >= 14) {
                    break;
                }
                //如果是叶子节点
            } else {
                resultList.add("/products/" + tbItemCat.getId() + ".html|" + tbItemCat.getName());
            }
        }
        return resultList;
    }
}
