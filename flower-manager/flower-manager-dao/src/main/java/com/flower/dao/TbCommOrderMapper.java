package com.flower.dao;

import com.flower.pojo.po.TbCommOrder;
import com.flower.pojo.po.TbCommOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommOrderMapper {
    int countByExample(TbCommOrderExample example);

    int deleteByExample(TbCommOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbCommOrder record);

    int insertSelective(TbCommOrder record);

    List<TbCommOrder> selectByExample(TbCommOrderExample example);

    TbCommOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbCommOrder record, @Param("example") TbCommOrderExample example);

    int updateByExample(@Param("record") TbCommOrder record, @Param("example") TbCommOrderExample example);

    int updateByPrimaryKeySelective(TbCommOrder record);

    int updateByPrimaryKey(TbCommOrder record);
}