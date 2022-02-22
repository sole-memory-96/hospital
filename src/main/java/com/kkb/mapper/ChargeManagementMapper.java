package com.kkb.mapper;

import com.kkb.pojo.ChargeManagement;
import com.kkb.pojo.ChargeManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeManagementMapper {
    long countByExample(ChargeManagementExample example);

    int deleteByExample(ChargeManagementExample example);

    int deleteByPrimaryKey(Integer chaP_id);

    int insert(ChargeManagement record);

    int insertSelective(ChargeManagement record);

    List<ChargeManagement> selectByExample(ChargeManagementExample example);

    ChargeManagement selectByPrimaryKey(Integer chaP_id);

    int updateByExampleSelective(@Param("record") ChargeManagement record, @Param("example") ChargeManagementExample example);

    int updateByExample(@Param("record") ChargeManagement record, @Param("example") ChargeManagementExample example);

    int updateByPrimaryKeySelective(ChargeManagement record);

    int updateByPrimaryKey(ChargeManagement record);
}