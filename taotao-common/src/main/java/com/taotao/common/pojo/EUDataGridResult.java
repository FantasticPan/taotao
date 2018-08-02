package com.taotao.common.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by FantasticPan on 2018/7/10.
 */
@Getter
@Setter
public class EUDataGridResult {

    private long total;
    private List<?> rows;//?，任意类型
}

