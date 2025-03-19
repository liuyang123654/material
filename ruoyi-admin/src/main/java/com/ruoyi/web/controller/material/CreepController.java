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
import com.ruoyi.material.domain.Creep;
import com.ruoyi.material.service.ICreepService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@RestController
@RequestMapping("/material/creep")
public class CreepController extends BaseController
{
    @Autowired
    private ICreepService creepService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:creep:list')")
    @GetMapping("/list")
    public TableDataInfo list(Creep creep)
    {
        startPage();
        List<Creep> list = creepService.selectCreepList(creep);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:creep:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Creep creep)
    {
        List<Creep> list = creepService.selectCreepList(creep);
        ExcelUtil<Creep> util = new ExcelUtil<Creep>(Creep.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping(value = "/{trademark}")
    public AjaxResult getInfo(@PathVariable("trademark") String trademark)
    {
        return success(creepService.selectCreepByTrademark(trademark));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:creep:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Creep creep)
    {
        return toAjax(creepService.insertCreep(creep));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:creep:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Creep creep)
    {
        return toAjax(creepService.updateCreep(creep));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:creep:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{trademarks}")
    public AjaxResult remove(@PathVariable String[] trademarks)
    {
        return toAjax(creepService.deleteCreepByTrademarks(trademarks));
    }

    /**
     * @Author 刘洋
     * @Date 2023/5/20
     */
    //牌号
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_trademark")
    public AjaxResult select_trademark()
    {
        return AjaxResult.success(creepService.select_trademark());
    }
    //热处理制度
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_heatTreatmentSystem")
    public AjaxResult select_heatTreatmentSystem()
    {
        return AjaxResult.success(creepService.select_heatTreatmentSystem());
    }
    //大查询 蠕变
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_creep")
    public AjaxResult select_creep(@RequestParam String trademark, @RequestParam String heat_treatment_system, @RequestParam Long temperature_min, @RequestParam Long temperature_max,@RequestParam Long time_min, @RequestParam Long time_max, @RequestParam Long stress_min, @RequestParam Long stress_max)
    {
        return AjaxResult.success(creepService.select_creep(trademark,heat_treatment_system,temperature_min,temperature_max,time_min,time_max,stress_min,stress_max));
    }
    //查找最大最小温度
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_temperature_max")
    public AjaxResult select_temperature_max()
    {
        return AjaxResult.success(creepService.select_temperature_max());
    }
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_temperature_min")
    public AjaxResult select_temperature_min()
    {
        return AjaxResult.success(creepService.select_temperature_min());
    }
    //查找最大最小时间
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_time_max")
    public AjaxResult select_time_max()
    {
        return AjaxResult.success(creepService.select_time_max());
    }
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_time_min")
    public AjaxResult select_time_min()
    {
        return AjaxResult.success(creepService.select_time_min());
    }
    //查找最大最小应力
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_stress_max")
    public AjaxResult select_stress_max()
    {
        return AjaxResult.success(creepService.select_stress_max());
    }
    @PreAuthorize("@ss.hasPermi('material:creep:query')")
    @GetMapping("/select_stress_min")
    public AjaxResult select_stress_min()
    {
        return AjaxResult.success(creepService.select_stress_min());
    }
}

