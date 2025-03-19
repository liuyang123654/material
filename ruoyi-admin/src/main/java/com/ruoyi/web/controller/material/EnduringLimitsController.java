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
import com.ruoyi.material.domain.EnduringLimits;
import com.ruoyi.material.service.IEnduringLimitsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@RestController
@RequestMapping("/material/enduring_limits")
public class EnduringLimitsController extends BaseController
{
    @Autowired
    private IEnduringLimitsService enduringLimitsService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:limits:list')")
    @GetMapping("/list")
    public TableDataInfo list(EnduringLimits enduringLimits)
    {
        startPage();
        List<EnduringLimits> list = enduringLimitsService.selectEnduringLimitsList(enduringLimits);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:limits:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EnduringLimits enduringLimits)
    {
        List<EnduringLimits> list = enduringLimitsService.selectEnduringLimitsList(enduringLimits);
        ExcelUtil<EnduringLimits> util = new ExcelUtil<EnduringLimits>(EnduringLimits.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('material:limits:query')")
    @GetMapping(value = "/{trademark}")
    public AjaxResult getInfo(@PathVariable("trademark") String trademark)
    {
        return success(enduringLimitsService.selectEnduringLimitsByTrademark(trademark));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:limits:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EnduringLimits enduringLimits)
    {
        return toAjax(enduringLimitsService.insertEnduringLimits(enduringLimits));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:limits:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EnduringLimits enduringLimits)
    {
        return toAjax(enduringLimitsService.updateEnduringLimits(enduringLimits));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:limits:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{trademarks}")
    public AjaxResult remove(@PathVariable String[] trademarks)
    {
        return toAjax(enduringLimitsService.deleteEnduringLimitsByTrademarks(trademarks));
    }

    /**
     * @Author 刘洋
     * @Date 2023/5/13
     */
    //牌号
    @PreAuthorize("@ss.hasPermi('material:enduring_limits:query')")
    @GetMapping("/select_trademark")
    public AjaxResult select_trademark()
    {
        return AjaxResult.success(enduringLimitsService.select_trademark());
    }
    //热处理制度
    @PreAuthorize("@ss.hasPermi('material:enduring_limits:query')")
    @GetMapping("/select_heatTreatmentSystem")
    public AjaxResult select_heatTreatmentSystem()
    {
        return AjaxResult.success(enduringLimitsService.select_heatTreatmentSystem());
    }
    //大查询 持久极限
    @PreAuthorize("@ss.hasPermi('material:enduring_limits:query')")
    @GetMapping("/select_enduring_limits")
    public AjaxResult select_enduring_limits(@RequestParam String trademark, @RequestParam String heat_treatment_system,  @RequestParam Long temperature_min, @RequestParam Long temperature_max,@RequestParam Long time_min, @RequestParam Long time_max)
    {
        return AjaxResult.success(enduringLimitsService.select_enduring_limits(trademark,heat_treatment_system,temperature_min,temperature_max,time_min,time_max));
    }
    
    
    //2023/10/8 @Author 刘洋
    //查找最大最小温度
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_temperature_max")
    public AjaxResult select_temperature_max()
    {
        return AjaxResult.success(enduringLimitsService.select_temperature_max());
    }
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_temperature_min")
    public AjaxResult select_temperature_min()
    {
        return AjaxResult.success(enduringLimitsService.select_temperature_min());
    }
    //查找最大最小时间
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_time_max")
    public AjaxResult select_time_max()
    {
        return AjaxResult.success(enduringLimitsService.select_time_max());
    }
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_time_min")
    public AjaxResult select_time_min()
    {
        return AjaxResult.success(enduringLimitsService.select_time_min());
    }
}
