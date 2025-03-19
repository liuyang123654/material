package com.ruoyi.material.service;

import com.ruoyi.material.domain.Limit_max_min;
import com.ruoyi.material.domain.Paper;

import java.util.List;

public interface IPaperService {
    //查找列表
    public List<Paper> select_paperlist();
    //查找文献内容
    public String select_paper_content(Integer id);
}
