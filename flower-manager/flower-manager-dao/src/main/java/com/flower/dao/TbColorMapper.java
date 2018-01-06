package com.flower.dao;

import com.flower.pojo.po.TbColor;
import com.flower.pojo.po.TbColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbColorMapper {
    int countByExample(TbColorExample example);

    int deleteByExample(TbColorExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbColor record);

    int insertSelective(TbColor record);

    List<TbColor> selectByExample(TbColorExample example);

    TbColor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbColor record, @Param("example") TbColorExample example);

    int updateByExample(@Param("record") TbColor record, @Param("example") TbColorExample example);

    int updateByPrimaryKeySelective(TbColor record);

    int updateByPrimaryKey(TbColor record);
}