package com.flower.dao;

import com.flower.pojo.po.TbImages;
import com.flower.pojo.po.TbImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbImagesMapper {
    int countByExample(TbImagesExample example);

    int deleteByExample(TbImagesExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbImages record);

    int insertSelective(TbImages record);

    List<TbImages> selectByExample(TbImagesExample example);

    TbImages selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbImages record, @Param("example") TbImagesExample example);

    int updateByExample(@Param("record") TbImages record, @Param("example") TbImagesExample example);

    int updateByPrimaryKeySelective(TbImages record);

    int updateByPrimaryKey(TbImages record);
}