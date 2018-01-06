package com.flower.dao;

import com.flower.pojo.po.TbAddr;
import com.flower.pojo.po.TbAddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAddrMapper {
    int countByExample(TbAddrExample example);

    int deleteByExample(TbAddrExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbAddr record);

    int insertSelective(TbAddr record);

    List<TbAddr> selectByExample(TbAddrExample example);

    TbAddr selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbAddr record, @Param("example") TbAddrExample example);

    int updateByExample(@Param("record") TbAddr record, @Param("example") TbAddrExample example);

    int updateByPrimaryKeySelective(TbAddr record);

    int updateByPrimaryKey(TbAddr record);
}