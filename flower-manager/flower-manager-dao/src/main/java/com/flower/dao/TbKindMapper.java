package com.flower.dao;

import com.flower.pojo.po.TbKind;
import com.flower.pojo.po.TbKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbKindMapper {
    int countByExample(TbKindExample example);

    int deleteByExample(TbKindExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbKind record);

    int insertSelective(TbKind record);

    List<TbKind> selectByExample(TbKindExample example);

    TbKind selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbKind record, @Param("example") TbKindExample example);

    int updateByExample(@Param("record") TbKind record, @Param("example") TbKindExample example);

    int updateByPrimaryKeySelective(TbKind record);

    int updateByPrimaryKey(TbKind record);
}