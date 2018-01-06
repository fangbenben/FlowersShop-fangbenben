package com.flower.dao;

import com.flower.pojo.po.TbCommUse;
import com.flower.pojo.po.TbCommUseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommUseMapper {
    int countByExample(TbCommUseExample example);

    int deleteByExample(TbCommUseExample example);

    int deleteByPrimaryKey(String commId);

    int insert(TbCommUse record);

    int insertSelective(TbCommUse record);

    List<TbCommUse> selectByExample(TbCommUseExample example);

    TbCommUse selectByPrimaryKey(String commId);

    int updateByExampleSelective(@Param("record") TbCommUse record, @Param("example") TbCommUseExample example);

    int updateByExample(@Param("record") TbCommUse record, @Param("example") TbCommUseExample example);

    int updateByPrimaryKeySelective(TbCommUse record);

    int updateByPrimaryKey(TbCommUse record);
}