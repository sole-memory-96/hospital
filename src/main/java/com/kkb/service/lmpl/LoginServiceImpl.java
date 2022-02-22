package com.kkb.service.lmpl;

import com.kkb.mapper.UserMapper;
import com.kkb.pojo.User;
import com.kkb.pojo.UserExample;
import com.kkb.service.LoginService;
import com.kkb.vo.QueryUserVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    public UserMapper UserMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<User> login(QueryUserVO vo) {
        System.out.println(vo);
        ResultVO<Object> resultVO = new ResultVO<>();
        UserExample UserExample = new UserExample();
        UserExample.Criteria criteria = UserExample.createCriteria();
        if (vo!=null){
            if (vo.getUserName()!=null &&! "".equals(vo.getUserName())){
                criteria.andU_loginNameEqualTo(vo.getUserName());
                criteria.andU_passWordEqualTo(vo.getPassword());
                List<User> login = UserMapper.selectByExample(UserExample);
                return login;
            }
        }
        return null;
    }
}
