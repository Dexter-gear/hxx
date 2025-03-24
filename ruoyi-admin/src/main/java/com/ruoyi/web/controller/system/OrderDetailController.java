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
import com.ruoyi.system.domain.OrderDetail;
import com.ruoyi.system.service.IOrderDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单明细Controller
 * 
 * @author hxx
 * @date 2025-03-24
 */
@RestController
@RequestMapping("/system/detail")
public class OrderDetailController extends BaseController
{
    @Autowired
    private IOrderDetailService orderDetailService;

    /**
     * 查询订单明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(OrderDetail orderDetail)
    {
        startPage();
        List<OrderDetail> list = orderDetailService.selectOrderDetailList(orderDetail);
        return getDataTable(list);
    }

    /**
     * 导出订单明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "订单明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OrderDetail orderDetail)
    {
        List<OrderDetail> list = orderDetailService.selectOrderDetailList(orderDetail);
        ExcelUtil<OrderDetail> util = new ExcelUtil<OrderDetail>(OrderDetail.class);
        util.exportExcel(response, list, "订单明细数据");
    }

    /**
     * 获取订单明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{detailId}")
    public AjaxResult getInfo(@PathVariable("detailId") Long detailId)
    {
        return success(orderDetailService.selectOrderDetailByDetailId(detailId));
    }

    /**
     * 新增订单明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "订单明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OrderDetail orderDetail)
    {
        return toAjax(orderDetailService.insertOrderDetail(orderDetail));
    }

    /**
     * 修改订单明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "订单明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OrderDetail orderDetail)
    {
        return toAjax(orderDetailService.updateOrderDetail(orderDetail));
    }

    /**
     * 删除订单明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "订单明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{detailIds}")
    public AjaxResult remove(@PathVariable Long[] detailIds)
    {
        return toAjax(orderDetailService.deleteOrderDetailByDetailIds(detailIds));
    }
}
