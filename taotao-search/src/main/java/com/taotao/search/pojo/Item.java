package com.taotao.search.pojo;

import lombok.Data;

/**
 * Created by FantasticPan on 2018/7/28.
 */
@Data
public class Item {

    private String id;
    private String title;
    private String sell_point;
    private Long price;
    private String image;
    private String category_name;
    private String item_des;
}