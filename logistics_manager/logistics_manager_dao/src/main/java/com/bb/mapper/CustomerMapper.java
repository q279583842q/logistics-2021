package com.bb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bb.dto.CustomerDto;
import com.bb.pojo.Customer;
import com.bb.pojo.CustomerExample;

public interface CustomerMapper {
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<CustomerDto> selectByExample(CustomerExample example);

    CustomerDto selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

	int hashOrder(Integer id);
}