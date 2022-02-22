package com.kkb.controller;

import com.kkb.pojo.User;
import com.kkb.service.LoginService;
import com.kkb.vo.QueryUserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("")
@ResponseBody
public class LoginController {

    @Resource
    public LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public void login(QueryUserVO vo, HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<User> login = loginService.login(vo);
        response.setContentType("text/html;charset=utf-8");
        if (login.size() > 0 && login != null){
            HttpSession session = request.getSession();
            session.setAttribute("userName",vo.getUserName());
            response.getWriter().println("<script>window.location.href='/index.html';alert('登录成功');</script>'");
        }
        response.getWriter().println("'<script>window.location.href='/login.html';alert('登录失败');</script>'");
    }

    @RequestMapping("out")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("<script>top.location.href='/login.html';alert('退出成功');</script>'");
    }
}
