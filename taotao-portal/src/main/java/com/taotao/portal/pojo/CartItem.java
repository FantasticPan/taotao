package com.taotao.portal.pojo;

import lombok.Data;

/**
 * Created by FantasticPan on 2018/8/26.
 */
@Data
public class CartItem {

    private Long id;
    private String title;
    private Integer num;
    private Long price;
    private String image;
}
