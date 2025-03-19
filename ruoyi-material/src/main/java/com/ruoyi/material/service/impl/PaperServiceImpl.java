package com.ruoyi.material.service.impl;

import com.ruoyi.material.domain.Paper;
import com.ruoyi.material.mapper.PaperMapper;
import com.ruoyi.material.service.IPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements IPaperService {
    @Autowired
    private PaperMapper paperMapper;
    @Override
    public List<Paper> select_paperlist() {
        return paperMapper.select_paperlist();
    }

    @Override
    public String select_paper_content(Integer id) {
        return paperMapper.select_paper_content(id);
    }
}
