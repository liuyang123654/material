package com.ruoyi.material.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.TensilePropertiesMapper;
import com.ruoyi.material.domain.TensileProperties;
import com.ruoyi.material.service.ITensilePropertiesService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@Service
public class TensilePropertiesServiceImpl implements ITensilePropertiesService 
{
    @Autowired
    private TensilePropertiesMapper tensilePropertiesMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TensileProperties selectTensilePropertiesByTrademark(String trademark)
    {
        return tensilePropertiesMapper.selectTensilePropertiesByTrademark(trademark);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tensileProperties 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TensileProperties> selectTensilePropertiesList(TensileProperties tensileProperties)
    {
        return tensilePropertiesMapper.selectTensilePropertiesList(tensileProperties);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tensileProperties 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTensileProperties(TensileProperties tensileProperties)
    {
        return tensilePropertiesMapper.insertTensileProperties(tensileProperties);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tensileProperties 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTensileProperties(TensileProperties tensileProperties)
    {
        return tensilePropertiesMapper.updateTensileProperties(tensileProperties);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param trademarks 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTensilePropertiesByTrademarks(String[] trademarks)
    {
        return tensilePropertiesMapper.deleteTensilePropertiesByTrademarks(trademarks);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param trademark 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTensilePropertiesByTrademark(String trademark)
    {
        return tensilePropertiesMapper.deleteTensilePropertiesByTrademark(trademark);
    }

    /**
     * @Author 刘洋
     * @Date 2023/5/3
     */
    //牌号
    @Override
    public List<String> select_trademark()
    {
        return tensilePropertiesMapper.select_trademark();
    }
    //热处理制度
    @Override
    public List<String> select_heatTreatmentSystem()
    {
        return tensilePropertiesMapper.select_heatTreatmentSystem();
    }

    //大查询 拉伸性能
    @Override
    public List<TensileProperties> select_tensile_properties(String trademark,String heat_treatment_system,Long temperature_min,Long temperature_max)
    {
        return tensilePropertiesMapper.select_tensile_properties(trademark,heat_treatment_system,temperature_min,temperature_max);
    }

    @Override
    public String[] predict_tensile_properties(String trademark, String heat_treatment_system, String temperature, String algorithms) {
        try {
            //格式：String[] args = new String[] { "F:\\Program Files\\Python37\\python", pyPath, data1，data2};
            String[] strings = new String[]{"python.exe", "C:\\Users\\Administrator\\Desktop\\铸造高温合金分析\\拉伸性能\\mymain.py", trademark, heat_treatment_system, temperature, algorithms};
            Process proc = Runtime.getRuntime().exec(strings); // 执行py文件C:\Users\liuyang\AppData\Local\Microsoft\WindowsApps\python.exe
            //C:\Users\Administrator\AppData\Local\Programs\Python\Python311\python.exe
            //或者proc = Runtime.getRuntime().exec("C:\\Users\\liuyang\\AppData\\Local\\Programs\\Python\\Python38\\python.exe    C:\\Users\\liuyang\\PycharmProjects\\铸造高温合金分析\\testpy.py 111"); // 执行py文件
            // 用输入输出流来截取结果C:\Users\liuyang\AppData\Local\Programs\Python\Python38\python.exe
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(), "gb2312"));

            /*
            测试文件执行是否有误：
            res如果是1，java调用python出错；是0，说明没有报错
            Process pr=Runtime.getRuntime().exec(strings);
            int res=pr.waitFor();
            System.out.println(res);

            如果报错为1：
            把报错信息输出，来查看错误：
            BufferedReader error = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            String err = null;
            while ((err = error.readLine()) != null) {
                System.out.println("=====error：" + err);
            }*/
            BufferedReader error = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            String err = null;
            while ((err = error.readLine()) != null) {
                System.out.println("=====error：" + err);
            }
            String line = null;
            String[] newStr = new String[0];
            while ((line = in.readLine()) != null) {
                //System.out.println(line);
                String cut = " ";    // 分割串，此处为一个空格
                newStr = line.split(cut);    // 分割成数组
                /*
                for (String string : newStr) {
                    System.out.println(string);    // 输出
                }
                 */
            }
            in.close();
            proc.waitFor();
            return newStr;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Long select_temperature_max(){
        return tensilePropertiesMapper.select_temperature_max();
    }
    @Override
    public Long select_temperature_min(){
        return tensilePropertiesMapper.select_temperature_min();
    }
}
