package com.taotao.portal.pojo;

import com.taotao.pojo.TbItem;

/**
 * Created by FantasticPan on 2018/8/3.
 */
public class ItemInfo extends TbItem {

    public String[] getImages() {
        String image = getImage();
        if (image != null) {
            return image.split(",");
        }
        return null;
    }
}
