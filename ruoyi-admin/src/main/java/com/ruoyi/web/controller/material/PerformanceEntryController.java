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
import com.ruoyi.material.domain.PerformanceEntry;
import com.ruoyi.material.service.IPerformanceEntryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-06-08
 */
@RestController
@RequestMapping("/material/entry")
public class PerformanceEntryController extends BaseController
{
    @Autowired
    private IPerformanceEntryService performanceEntryService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:entry:list')")
    @GetMapping("/list")
    public TableDataInfo list(PerformanceEntry performanceEntry)
    {
        startPage();
        List<PerformanceEntry> list = performanceEntryService.selectPerformanceEntryList(performanceEntry);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('material:entry:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PerformanceEntry performanceEntry)
    {
        List<PerformanceEntry> list = performanceEntryService.selectPerformanceEntryList(performanceEntry);
        ExcelUtil<PerformanceEntry> util = new ExcelUtil<PerformanceEntry>(PerformanceEntry.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('material:entry:query')")
    @GetMapping(value = "/{trademark}")
    public AjaxResult getInfo(@PathVariable("trademark") String trademark)
    {
        return AjaxResult.success(performanceEntryService.selectPerformanceEntryByTrademark(trademark));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:entry:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PerformanceEntry performanceEntry)
    {
        return toAjax(performanceEntryService.insertPerformanceEntry(performanceEntry));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:entry:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PerformanceEntry performanceEntry)
    {
        return toAjax(performanceEntryService.updatePerformanceEntry(performanceEntry));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('material:entry:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{trademarks}")
    public AjaxResult remove(@PathVariable String[] trademarks)
    {
        return toAjax(performanceEntryService.deletePerformanceEntryByTrademarks(trademarks));
    }


    /*
    @Author 刘洋
    @Date 2023/6/8
     */

    //查询最小
    @PreAuthorize("@ss.hasPermi('material:entry:query')")
    @GetMapping("/select_min")
    public AjaxResult select_min()
    {
        return AjaxResult.success(performanceEntryService.select_min());
    }
    //查询最大
    @PreAuthorize("@ss.hasPermi('material:entry:query')")
    @GetMapping("/select_max")
    public AjaxResult select_max()
    {
        return AjaxResult.success(performanceEntryService.select_max());
    }
    //查询牌号
    @PreAuthorize("@ss.hasPermi('material:entry:query')")
    @GetMapping("/select_trademark")
    public AjaxResult select_trademark()
    {
        return AjaxResult.success(performanceEntryService.select_trademark());
    }

    //查询所有
    @PreAuthorize("@ss.hasPermi('material:entry:query')")
    @GetMapping("/select_performance_entry")
    public AjaxResult select_performance_entry(@RequestParam String trademark,@RequestParam Double T)
    {
        return AjaxResult.success(performanceEntryService.select_performance_entry(trademark,T));
    }
}
