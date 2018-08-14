package com.taotao.sso.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by FantasticPan on 2018/8/5.
 */
public interface UserService {

    TaotaoResult checkData(String content, Integer type);

    TaotaoResult createUser(TbUser user);

    TaotaoResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);

    TaotaoResult getUserByToken(String token);
}
