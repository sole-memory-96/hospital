package com.kkb.service;

import com.kkb.pojo.User;
import com.kkb.vo.QueryUserVO;

import java.util.List;

public interface LoginService {

    public List<User> login(QueryUserVO vo);
}
