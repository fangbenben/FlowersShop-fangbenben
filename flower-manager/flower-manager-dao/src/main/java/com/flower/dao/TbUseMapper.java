package com.flower.dao;

import com.flower.pojo.po.TbUse;
import com.flower.pojo.po.TbUseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUseMapper {
    int countByExample(TbUseExample example);

    int deleteByExample(TbUseExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbUse record);

    int insertSelective(TbUse record);

    List<TbUse> selectByExample(TbUseExample example);

    TbUse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbUse record, @Param("example") TbUseExample example);

    int updateByExample(@Param("record") TbUse record, @Param("example") TbUseExample example);

    int updateByPrimaryKeySelective(TbUse record);

    int updateByPrimaryKey(TbUse record);
}