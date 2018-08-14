package com.taotao.portal.interceptor;

import com.taotao.common.util.CookieUtil;
import com.taotao.pojo.TbUser;
import com.taotao.portal.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by FantasticPan on 2018/8/14.
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //在handler之前处理
        //判断用户是否登录
        String token = CookieUtil.getCookieValue(request, "TT_TOKEN");
        //从cookie中获取用户信息，调用sso的借口
        TbUser user = userService.getUserByToken(token);
        //取不到用户信息
        if (null == user) {
            //跳转到登陆页面，把用户请求的url作为参数传递给登陆页面,登陆之后回到原来的页面
            response.sendRedirect(userService.SSO_BASE_URL
                    + userService.SSO_PAGE_LOGIN
                    + "?redirect="
                    + request.getRequestURL());
            //返回false
            return false;
        }
        //取到用户信息，执行
        //返回值决定handler是否执行，true：执行，false：不执行
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //handler之后执行，返回ModelAndView之前
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //返回ModelAndView之后
        //响应用户之后
    }
}
