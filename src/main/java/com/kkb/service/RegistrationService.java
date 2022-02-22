package com.kkb.service;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Hosregister;
import com.kkb.vo.QueryRegistrationVO;
import org.springframework.stereotype.Service;

public interface RegistrationService {

    public PageInfo<Hosregister> queryByPage(Integer pageNum, Integer pageSize, QueryRegistrationVO vo);

    public Integer insert(Hosregister hosregister);
}
