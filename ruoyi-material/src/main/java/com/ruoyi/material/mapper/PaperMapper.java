package com.ruoyi.material.mapper;

import com.ruoyi.material.domain.Paper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaperMapper {
    //查找列表
    public List<Paper> select_paperlist();
    //查找文献内容
    public String select_paper_content(@Param("id")Integer id);
}
