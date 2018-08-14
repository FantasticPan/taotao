package com.taotao.portal.service;

import com.taotao.pojo.TbUser;

/**
 * Created by FantasticPan on 2018/8/14.
 */
public interface UserService {

    TbUser getUserByToken(String token);
}
