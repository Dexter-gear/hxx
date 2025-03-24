package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Payment;

/**
 * 支付记录Mapper接口
 * 
 * @author hxx
 * @date 2025-03-24
 */
public interface PaymentMapper 
{
    /**
     * 查询支付记录
     * 
     * @param paymentId 支付记录主键
     * @return 支付记录
     */
    public Payment selectPaymentByPaymentId(Long paymentId);

    /**
     * 查询支付记录列表
     * 
     * @param payment 支付记录
     * @return 支付记录集合
     */
    public List<Payment> selectPaymentList(Payment payment);

    /**
     * 新增支付记录
     * 
     * @param payment 支付记录
     * @return 结果
     */
    public int insertPayment(Payment payment);

    /**
     * 修改支付记录
     * 
     * @param payment 支付记录
     * @return 结果
     */
    public int updatePayment(Payment payment);

    /**
     * 删除支付记录
     * 
     * @param paymentId 支付记录主键
     * @return 结果
     */
    public int deletePaymentByPaymentId(Long paymentId);

    /**
     * 批量删除支付记录
     * 
     * @param paymentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePaymentByPaymentIds(Long[] paymentIds);
}
