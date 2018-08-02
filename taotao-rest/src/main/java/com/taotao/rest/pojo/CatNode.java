package com.taotao.rest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by FantasticPan on 2018/7/20.
 */
@Data
public class CatNode {

    //转换成json数据时使用u作为key
    @JsonProperty("n")
    private String name;
    @JsonProperty("u")
    private String url;
    @JsonProperty("i")
    private List<?> item;
}
