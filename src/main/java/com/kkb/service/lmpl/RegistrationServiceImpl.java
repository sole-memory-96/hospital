package com.kkb.service.lmpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.mapper.HosregisterMapper;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.DoctorExample;
import com.kkb.pojo.Hosregister;
import com.kkb.pojo.HosregisterExample;
import com.kkb.service.RegistrationService;
import com.kkb.vo.QueryRegistrationVO;
import com.kkb.vo.QueryVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Resource
    public HosregisterMapper hosregisterMapper;
    @Resource
    public DoctorMapper doctorMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Hosregister> queryByPage(Integer pageNum, Integer pageSize, QueryRegistrationVO vo) {
        //多条件
        HosregisterExample example = new HosregisterExample();
        //创建条件的容器
        HosregisterExample.Criteria criteria = example.createCriteria();
        if(vo!=null){
            if(vo.getId()!=null &&!"".equals(vo.getId())){
                criteria.andHos_idEqualTo(vo.getId());
            }
            if(vo.getDoctorId()!=null &&!"".equals(vo.getDepartmentId())){
                criteria.andD_idEqualTo(vo.getDoctorId());
            }
            if(vo.getBeginDate()!=null){
                criteria.andHos_dateGreaterThan(vo.getBeginDate());
            }
            if(vo.getEndDate()!=null){
                criteria.andHos_dateLessThan(vo.getEndDate());
            }

        }
        PageHelper.startPage(pageNum, pageSize);
        List<Hosregister> list = hosregisterMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public Integer insert(Hosregister hosregister) {
        return hosregisterMapper.insert(hosregister);
    }
}
