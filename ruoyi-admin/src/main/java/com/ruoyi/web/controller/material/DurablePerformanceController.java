package com.ruoyi.web.controller.material;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.material.domain.DurablePerformance;
import com.ruoyi.material.service.IDurablePerformanceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@RestController
@RequestMapping("/material/durable_performance")
public class DurablePerformanceController extends BaseController
{
    @Autowired
    private IDurablePerformanceService durablePerformanceService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:performance:list')")
    @GetMapping("/list")
    public TableDataInfo list(DurablePerformance durablePerformance)
    {
        startPage();
        List<DurablePerformance> list = durablePerformanceService.selectDurablePerformanceList(durablePerformance);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:performance:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DurablePerformance durablePerformance)
    {
        List<DurablePerformance> list = durablePerformanceService.selectDurablePerformanceList(durablePerformance);
        ExcelUtil<DurablePerformance> util = new ExcelUtil<DurablePerformance>(DurablePerformance.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('material:performance:query')")
    @GetMapping(value = "/{trademark}")
    public AjaxResult getInfo(@PathVariable("trademark") String trademark)
    {
        return success(durablePerformanceService.selectDurablePerformanceByTrademark(trademark));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:performance:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DurablePerformance durablePerformance)
    {
        return toAjax(durablePerformanceService.insertDurablePerformance(durablePerformance));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:performance:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DurablePerformance durablePerformance)
    {
        return toAjax(durablePerformanceService.updateDurablePerformance(durablePerformance));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:performance:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{trademarks}")
    public AjaxResult remove(@PathVariable String[] trademarks)
    {
        return toAjax(durablePerformanceService.deleteDurablePerformanceByTrademarks(trademarks));
    }

    /**
     * @Author 刘洋
     * @Date 2023/5/13
     */
    //牌号
    @PreAuthorize("@ss.hasPermi('material:durable_performance:query')")
    @GetMapping("/select_trademark")
    public AjaxResult select_trademark()
    {
        return AjaxResult.success(durablePerformanceService.select_trademark());
    }
    //热处理制度
    @PreAuthorize("@ss.hasPermi('material:durable_performance:query')")
    @GetMapping("/select_heatTreatmentSystem")
    public AjaxResult select_heatTreatmentSystem()
    {
        return AjaxResult.success(durablePerformanceService.select_heatTreatmentSystem());
    }
    //大查询 持久性能
    @PreAuthorize("@ss.hasPermi('material:durable_performance:query')")
    @GetMapping("/select_durable_performance")
    public AjaxResult select_durable_performance(@RequestParam String trademark, @RequestParam String heat_treatment_system, @RequestParam Long temperature_min, @RequestParam Long temperature_max,@RequestParam Long stress_min,@RequestParam Long stress_max)
    {
        return AjaxResult.success(durablePerformanceService.select_durable_performance(trademark,heat_treatment_system,temperature_min,temperature_max,stress_min,stress_max));
    }

    //查找最大最小温度
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_temperature_max")
    public AjaxResult select_temperature_max()
    {
        return AjaxResult.success(durablePerformanceService.select_temperature_max());
    }
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_temperature_min")
    public AjaxResult select_temperature_min()
    {
        return AjaxResult.success(durablePerformanceService.select_temperature_min());
    }
    
    //查找最大最小应力
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_stress_max")
    public AjaxResult select_stress_max()
    {
        return AjaxResult.success(durablePerformanceService.select_stress_max());
    }
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_stress_min")
    public AjaxResult select_stress_min()
    {
        return AjaxResult.success(durablePerformanceService.select_stress_min());
    }
}
