package com.ruoyi.web.controller.material;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.material.domain.Limit_max_min;
import com.ruoyi.material.domain.Ten_Mentals_Value;
import com.ruoyi.material.service.IPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/material/point")
public class PointController {
    @Autowired
    private IPointService pointService;
    //查询维氏硬度hv
    @PreAuthorize("@ss.hasPermi('material:point:query')")
    @PostMapping("/select_hv")
    @CrossOrigin
    public AjaxResult select_hv(@RequestBody Ten_Mentals_Value ten_mentals_value)
    {
        //System.out.println(ten_mentals_value);
        if(pointService.if_table_exist(ten_mentals_value.getTable_name1())==null) return AjaxResult.success("数据库不存在此表");
        if(pointService.if_table_exist(ten_mentals_value.getTable_name2())==null) return AjaxResult.success("数据库不存在此表");
        List<Ten_Mentals_Value> list=pointService.select_all(ten_mentals_value.getTable_name1());
        Double sum;//用来承接本次循环的欧氏距离的平方
        Double min=1000000.0;//用来承接最小欧氏距离
        Ten_Mentals_Value ten_mentals_value1=new Ten_Mentals_Value();
        for(int i=0;i<list.size();i++)
        {
            sum=0.0;
            sum+=(ten_mentals_value.getAl()-list.get(i).getAl())*(ten_mentals_value.getAl()-list.get(i).getAl());
            sum+=(ten_mentals_value.getTi()-list.get(i).getTi())*(ten_mentals_value.getTi()-list.get(i).getTi());
            sum+=(ten_mentals_value.getCr()-list.get(i).getCr())*(ten_mentals_value.getCr()-list.get(i).getCr());
            sum+=(ten_mentals_value.getCo()-list.get(i).getCo())*(ten_mentals_value.getCo()-list.get(i).getCo());
            sum+=(ten_mentals_value.getNi()-list.get(i).getNi())*(ten_mentals_value.getNi()-list.get(i).getNi());
            sum+=(ten_mentals_value.getNb()-list.get(i).getNb())*(ten_mentals_value.getNb()-list.get(i).getNb());
            sum+=(ten_mentals_value.getMo()-list.get(i).getMo())*(ten_mentals_value.getMo()-list.get(i).getMo());
            sum+=(ten_mentals_value.getTa()-list.get(i).getTa())*(ten_mentals_value.getTa()-list.get(i).getTa());
            sum+=(ten_mentals_value.getW()-list.get(i).getW())*(ten_mentals_value.getW()-list.get(i).getW());
            //Hf都是0，在这里就不写了
            //如果本次欧氏距离平方小于最小的，则更新最小的
            if(sum<min) {
                min=sum;
                ten_mentals_value1=list.get(i);
            }

        }
        String x_y=pointService.select_xy(ten_mentals_value.getTable_name1(),ten_mentals_value1.getAl(),ten_mentals_value1.getTi(),ten_mentals_value1.getCr(),ten_mentals_value1.getCo(),ten_mentals_value1.getNi(),ten_mentals_value1.getNb(),ten_mentals_value1.getMo(),ten_mentals_value1.getHf(),ten_mentals_value1.getTa(),ten_mentals_value1.getW());
        //System.out.println(ten_mentals_value1);
        int index=x_y.indexOf('_');
        String x=x_y.substring(0,index);
        String y=x_y.substring(index+1,x_y.length());
        String hv=pointService.select_hv(ten_mentals_value.getTable_name2(),x,y);
        if(hv==null) {
            return AjaxResult.success("抱歉,未查询到相关维氏硬度信息;");
        } else {
            return AjaxResult.success(hv);
        }
    }

    //查找HD/SE照片
    @PreAuthorize("@ss.hasPermi('material:point:query')")
    @PostMapping("/select_image")
    @CrossOrigin
    public AjaxResult select_image(@RequestBody Ten_Mentals_Value ten_mentals_value,@RequestParam String HD_SE)
    {
        //System.out.println(ten_mentals_value);
        if(pointService.if_table_exist(ten_mentals_value.getTable_name1())==null) return AjaxResult.success("数据库不存在此表");
        if(pointService.if_table_exist(ten_mentals_value.getTable_name2())==null) return AjaxResult.success("数据库不存在此表");
        List<Ten_Mentals_Value> list=pointService.select_all(ten_mentals_value.getTable_name1());
        Double sum;//用来承接本次循环的欧氏距离的平方
        Double min=1000000.0;//用来承接最小欧氏距离
        Ten_Mentals_Value ten_mentals_value1=new Ten_Mentals_Value();
        for(int i=0;i<list.size();i++)
        {
            sum=0.0;
            sum+=(ten_mentals_value.getAl()-list.get(i).getAl())*(ten_mentals_value.getAl()-list.get(i).getAl());
            sum+=(ten_mentals_value.getTi()-list.get(i).getTi())*(ten_mentals_value.getTi()-list.get(i).getTi());
            sum+=(ten_mentals_value.getCr()-list.get(i).getCr())*(ten_mentals_value.getCr()-list.get(i).getCr());
            sum+=(ten_mentals_value.getCo()-list.get(i).getCo())*(ten_mentals_value.getCo()-list.get(i).getCo());
            sum+=(ten_mentals_value.getNi()-list.get(i).getNi())*(ten_mentals_value.getNi()-list.get(i).getNi());
            sum+=(ten_mentals_value.getNb()-list.get(i).getNb())*(ten_mentals_value.getNb()-list.get(i).getNb());
            sum+=(ten_mentals_value.getMo()-list.get(i).getMo())*(ten_mentals_value.getMo()-list.get(i).getMo());
            sum+=(ten_mentals_value.getTa()-list.get(i).getTa())*(ten_mentals_value.getTa()-list.get(i).getTa());
            sum+=(ten_mentals_value.getW()-list.get(i).getW())*(ten_mentals_value.getW()-list.get(i).getW());
            //Hf都是0，在这里就不写了
            //如果本次欧氏距离平方小于最小的，则更新最小的
            if(sum<min) {
                min=sum;
                ten_mentals_value1=list.get(i);
            }

        }
        String x_y=pointService.select_xy(ten_mentals_value.getTable_name1(),ten_mentals_value1.getAl(),ten_mentals_value1.getTi(),ten_mentals_value1.getCr(),ten_mentals_value1.getCo(),ten_mentals_value1.getNi(),ten_mentals_value1.getNb(),ten_mentals_value1.getMo(),ten_mentals_value1.getHf(),ten_mentals_value1.getTa(),ten_mentals_value1.getW());
        //System.out.println(ten_mentals_value1);
        int index=x_y.indexOf('_');
        String x=x_y.substring(0,index);
        String y=x_y.substring(index+1,x_y.length());
        while (x.length()<4)
        {
            x='0'+x;
        }
        while (y.length()<4)
        {
            y='0'+y;
        }
        x_y=x+"_"+y;
        //System.out.println(x_y);

        Map<String, String> myMap = new HashMap<String, String>();
        System.out.println("HD_SE="+HD_SE);
        if(Objects.equals(HD_SE, "HD"))
        {
            myMap.put("url","/images/123/HD/"+x_y+".tif");
        } else if(Objects.equals(HD_SE, "SE")){
            myMap.put("url","/images/123/SE/"+x_y+".tif");
        } else{
            myMap.put("url","未找到");
        }
        return AjaxResult.success(myMap);
    }
    //查询均值、方差、最大值、最小值等
    @PreAuthorize("@ss.hasPermi('material:point:query')")
    @GetMapping("/select_attribute")
    public AjaxResult select_attribute(@RequestParam String tablename,@RequestParam String attribute)
    {
        //System.out.println(ten_mentals_value);
        if(pointService.if_table_exist(tablename)==null) return AjaxResult.success("数据库不存在此表");
        return AjaxResult.success(pointService.select_attribute(tablename,attribute));
    }
    @PreAuthorize("@ss.hasPermi('material:point:query')")
    @GetMapping("/select_limit")
    public AjaxResult select_limit(@RequestParam String tablename)
    {
        if(pointService.if_table_exist(tablename)==null) return AjaxResult.success("数据库不存在此表");

        List<Limit_max_min> list=new ArrayList<>();
        Limit_max_min limit_max_min1=new Limit_max_min();
        limit_max_min1.setName("al");
        limit_max_min1.setMax(pointService.select_limit(tablename).getMax_al());
        limit_max_min1.setMin(pointService.select_limit(tablename).getMin_al());

        Limit_max_min limit_max_min2=new Limit_max_min();
        limit_max_min2.setName("ti");
        limit_max_min2.setMax(pointService.select_limit(tablename).getMax_ti());
        limit_max_min2.setMin(pointService.select_limit(tablename).getMin_ti());

        Limit_max_min limit_max_min3=new Limit_max_min();
        limit_max_min3.setName("cr");
        limit_max_min3.setMax(pointService.select_limit(tablename).getMax_cr());
        limit_max_min3.setMin(pointService.select_limit(tablename).getMin_cr());

        Limit_max_min limit_max_min4=new Limit_max_min();
        limit_max_min4.setName("co");
        limit_max_min4.setMax(pointService.select_limit(tablename).getMax_co());
        limit_max_min4.setMin(pointService.select_limit(tablename).getMin_co());

        Limit_max_min limit_max_min5=new Limit_max_min();
        limit_max_min5.setName("ni");
        limit_max_min5.setMax(pointService.select_limit(tablename).getMax_ni());
        limit_max_min5.setMin(pointService.select_limit(tablename).getMin_ni());

        Limit_max_min limit_max_min6=new Limit_max_min();
        limit_max_min6.setName("nb");
        limit_max_min6.setMax(pointService.select_limit(tablename).getMax_nb());
        limit_max_min6.setMin(pointService.select_limit(tablename).getMin_nb());

        Limit_max_min limit_max_min7=new Limit_max_min();
        limit_max_min7.setName("mo");
        limit_max_min7.setMax(pointService.select_limit(tablename).getMax_mo());
        limit_max_min7.setMin(pointService.select_limit(tablename).getMin_mo());

        Limit_max_min limit_max_min8=new Limit_max_min();
        limit_max_min8.setName("hf");
        limit_max_min8.setMax(pointService.select_limit(tablename).getMax_hf());
        limit_max_min8.setMin(pointService.select_limit(tablename).getMin_hf());

        Limit_max_min limit_max_min9=new Limit_max_min();
        limit_max_min9.setName("ta");
        limit_max_min9.setMax(pointService.select_limit(tablename).getMax_ta());
        limit_max_min9.setMin(pointService.select_limit(tablename).getMin_ta());

        Limit_max_min limit_max_min10=new Limit_max_min();
        limit_max_min10.setName("w");
        limit_max_min10.setMax(pointService.select_limit(tablename).getMax_w());
        limit_max_min10.setMin(pointService.select_limit(tablename).getMin_w());

        list.add(limit_max_min1);
        list.add(limit_max_min2);
        list.add(limit_max_min3);
        list.add(limit_max_min4);
        list.add(limit_max_min5);
        list.add(limit_max_min6);
        list.add(limit_max_min7);
        list.add(limit_max_min8);
        list.add(limit_max_min9);
        list.add(limit_max_min10);

        return AjaxResult.success(list);

    }



}
