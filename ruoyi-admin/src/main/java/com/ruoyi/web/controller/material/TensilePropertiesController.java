package com.ruoyi.web.controller.material;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.material.domain.TensileProperties;
import com.ruoyi.material.service.ITensilePropertiesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@RestController
@RequestMapping("/material/tensile_properties")
public class TensilePropertiesController extends BaseController
{
    @Autowired
    private ITensilePropertiesService tensilePropertiesService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:properties:list')")
    @GetMapping("/list")
    public TableDataInfo list(TensileProperties tensileProperties)
    {
        startPage();
        List<TensileProperties> list = tensilePropertiesService.selectTensilePropertiesList(tensileProperties);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:properties:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TensileProperties tensileProperties)
    {
        List<TensileProperties> list = tensilePropertiesService.selectTensilePropertiesList(tensileProperties);
        ExcelUtil<TensileProperties> util = new ExcelUtil<TensileProperties>(TensileProperties.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('material:properties:query')")
    @GetMapping(value = "/{trademark}")
    public AjaxResult getInfo(@PathVariable("trademark") String trademark)
    {
        return success(tensilePropertiesService.selectTensilePropertiesByTrademark(trademark));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:properties:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TensileProperties tensileProperties)
    {
        return toAjax(tensilePropertiesService.insertTensileProperties(tensileProperties));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:properties:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TensileProperties tensileProperties)
    {
        return toAjax(tensilePropertiesService.updateTensileProperties(tensileProperties));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:properties:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{trademarks}")
    public AjaxResult remove(@PathVariable String[] trademarks)
    {
        return toAjax(tensilePropertiesService.deleteTensilePropertiesByTrademarks(trademarks));
    }

    /**
     * @Author 刘洋
     * @Date 2023/5/3
     */
    //牌号
    @PreAuthorize("@ss.hasPermi('material:properties:query')")
    @GetMapping("/select_trademark")
    public AjaxResult select_trademark()
    {
        return AjaxResult.success(tensilePropertiesService.select_trademark());
    }
    //热处理制度
    @PreAuthorize("@ss.hasPermi('material:properties:query')")
    @GetMapping("/select_heatTreatmentSystem")
    public AjaxResult select_heatTreatmentSystem()
    {
        return AjaxResult.success(tensilePropertiesService.select_heatTreatmentSystem());
    }
    //大查询 拉伸性能
    @PreAuthorize("@ss.hasPermi('material:properties:query')")
    @GetMapping("/select_tensile_properties")
    public AjaxResult select_tensile_properties(@RequestParam String trademark, @RequestParam String heat_treatment_system,@RequestParam Long temperature_min,@RequestParam Long temperature_max)
    {
        return AjaxResult.success(tensilePropertiesService.select_tensile_properties(trademark,heat_treatment_system,temperature_min,temperature_max));
    }
    //预测功能

    @PreAuthorize("@ss.hasPermi('material:properties:query')")
    @GetMapping("/predict_tensile_properties")
    public AjaxResult predict_tensile_properties(@RequestParam String trademark, @RequestParam String heat_treatment_system,@RequestParam String temperature,@RequestParam String algorithms)
    {
        return AjaxResult.success(tensilePropertiesService.predict_tensile_properties(trademark,heat_treatment_system,temperature,algorithms));
    }

    //查找最大最小温度
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_temperature_max")
    public AjaxResult select_temperature_max()
    {
        return AjaxResult.success(tensilePropertiesService.select_temperature_max());
    }
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_temperature_min")
    public AjaxResult select_temperature_min()
    {
        return AjaxResult.success(tensilePropertiesService.select_temperature_min());
    }
}
