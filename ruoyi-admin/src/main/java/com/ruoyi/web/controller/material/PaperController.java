package com.ruoyi.web.controller.material;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.material.service.IDataBaseService;
import com.ruoyi.material.service.IPaperService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


@RestController
@RequestMapping("/material/paper")
public class PaperController {
    @Autowired
    private IPaperService paperService;
    //查询文献列表
    //@PreAuthorize("@ss.hasPermi('material:database:query')")
    @GetMapping("/select_paperlist")
    public AjaxResult select_paperlist()
    {
        return AjaxResult.success(paperService.select_paperlist());
    }
    //查询文献内容
    //@PreAuthorize("@ss.hasPermi('material:database:query')")
    @GetMapping("/select_paper_content")
    public AjaxResult select_paper_content(@RequestParam Integer id)
    {
        return AjaxResult.success(paperService.select_paper_content(id));
        /*
        //文件转二进制数组
        //参考https://blog.csdn.net/weixin_39800144/article/details/80225990
        File file=new File(paperService.select_paper_content(id));
        String fileName=file.getName();
        try {
            InputStream fis = new FileInputStream(file);
            byte[] bytes = FileCopyUtils.copyToByteArray(fis);
            return AjaxResult.success(new String(bytes,"ISO-8859-1"));

        }catch (Exception ex){
            throw new RuntimeException("transform file into bin Array 出错",ex);
        }*/
    }


}

