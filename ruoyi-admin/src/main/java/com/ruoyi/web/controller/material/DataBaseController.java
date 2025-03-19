package com.ruoyi.web.controller.material;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.material.service.IDataBaseService;
import com.ruoyi.material.service.IDurablePerformanceService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/material/database")
public class DataBaseController {
    @Autowired
    private IDataBaseService dataBaseService;
    //查询所有数据库信息
    @GetMapping("/select_database")
    public AjaxResult select_database()
    {
        return AjaxResult.success(dataBaseService.select_database());
    }

    //查询所有数据库信息
    @PutMapping("/update_database")
    public AjaxResult update_database(String name,String url) throws InterruptedException {
        System.out.println("更改了:"+name+"数据库，改后的url:"+url);
        dataBaseService.update_database(name,url);
        return AjaxResult.success();
    }

}
