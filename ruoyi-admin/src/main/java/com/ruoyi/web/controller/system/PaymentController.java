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
import com.ruoyi.system.domain.Payment;
import com.ruoyi.system.service.IPaymentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 支付记录Controller
 * 
 * @author hxx
 * @date 2025-03-24
 */
@RestController
@RequestMapping("/system/payment")
public class PaymentController extends BaseController
{
    @Autowired
    private IPaymentService paymentService;

    /**
     * 查询支付记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:payment:list')")
    @GetMapping("/list")
    public TableDataInfo list(Payment payment)
    {
        startPage();
        List<Payment> list = paymentService.selectPaymentList(payment);
        return getDataTable(list);
    }

    /**
     * 导出支付记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:payment:export')")
    @Log(title = "支付记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Payment payment)
    {
        List<Payment> list = paymentService.selectPaymentList(payment);
        ExcelUtil<Payment> util = new ExcelUtil<Payment>(Payment.class);
        util.exportExcel(response, list, "支付记录数据");
    }

    /**
     * 获取支付记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:payment:query')")
    @GetMapping(value = "/{paymentId}")
    public AjaxResult getInfo(@PathVariable("paymentId") Long paymentId)
    {
        return success(paymentService.selectPaymentByPaymentId(paymentId));
    }

    /**
     * 新增支付记录
     */
    @PreAuthorize("@ss.hasPermi('system:payment:add')")
    @Log(title = "支付记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Payment payment)
    {
        return toAjax(paymentService.insertPayment(payment));
    }

    /**
     * 修改支付记录
     */
    @PreAuthorize("@ss.hasPermi('system:payment:edit')")
    @Log(title = "支付记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Payment payment)
    {
        return toAjax(paymentService.updatePayment(payment));
    }

    /**
     * 删除支付记录
     */
    @PreAuthorize("@ss.hasPermi('system:payment:remove')")
    @Log(title = "支付记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{paymentIds}")
    public AjaxResult remove(@PathVariable Long[] paymentIds)
    {
        return toAjax(paymentService.deletePaymentByPaymentIds(paymentIds));
    }
}
