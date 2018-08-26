package com.taotao.order.service;

import com.taotao.common.pojo.TaotaoResult;

/**
 * Created by FantasticPan on 2018/7/27.
 */
public interface RedisService {

    TaotaoResult syncContent(long contentCid);
}
