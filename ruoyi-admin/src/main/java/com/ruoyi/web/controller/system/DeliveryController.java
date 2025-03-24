package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Delivery;
import com.ruoyi.system.service.IDeliveryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配送信息Controller
 * 
 * @author hxx
 * @date 2025-03-24
 */
@RestController
@RequestMapping("/system/delivery")
public class DeliveryController extends BaseController
{
    @Autowired
    private IDeliveryService deliveryService;

    /**
     * 查询配送信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:delivery:list')")
    @GetMapping("/list")
    public TableDataInfo list(Delivery delivery)
    {
        startPage();
        List<Delivery> list = deliveryService.selectDeliveryList(delivery);
        return getDataTable(list);
    }

    /**
     * 导出配送信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:delivery:export')")
    @Log(title = "配送信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Delivery delivery)
    {
        List<Delivery> list = deliveryService.selectDeliveryList(delivery);
        ExcelUtil<Delivery> util = new ExcelUtil<Delivery>(Delivery.class);
        util.exportExcel(response, list, "配送信息数据");
    }

    /**
     * 获取配送信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:delivery:query')")
    @GetMapping(value = "/{deliveryId}")
    public AjaxResult getInfo(@PathVariable("deliveryId") Long deliveryId)
    {
        return success(deliveryService.selectDeliveryByDeliveryId(deliveryId));
    }

    /**
     * 新增配送信息
     */
    @PreAuthorize("@ss.hasPermi('system:delivery:add')")
    @Log(title = "配送信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Delivery delivery)
    {
        return toAjax(deliveryService.insertDelivery(delivery));
    }

    /**
     * 修改配送信息
     */
    @PreAuthorize("@ss.hasPermi('system:delivery:edit')")
    @Log(title = "配送信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Delivery delivery)
    {
        return toAjax(deliveryService.updateDelivery(delivery));
    }

    /**
     * 删除配送信息
     */
    @PreAuthorize("@ss.hasPermi('system:delivery:remove')")
    @Log(title = "配送信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{deliveryIds}")
    public AjaxResult remove(@PathVariable Long[] deliveryIds)
    {
        return toAjax(deliveryService.deleteDeliveryByDeliveryIds(deliveryIds));
    }
}
