package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PaymentMapper;
import com.ruoyi.system.domain.Payment;
import com.ruoyi.system.service.IPaymentService;

/**
 * 支付记录Service业务层处理
 * 
 * @author hxx
 * @date 2025-03-24
 */
@Service
public class PaymentServiceImpl implements IPaymentService 
{
    @Autowired
    private PaymentMapper paymentMapper;

    /**
     * 查询支付记录
     * 
     * @param paymentId 支付记录主键
     * @return 支付记录
     */
    @Override
    public Payment selectPaymentByPaymentId(Long paymentId)
    {
        return paymentMapper.selectPaymentByPaymentId(paymentId);
    }

    /**
     * 查询支付记录列表
     * 
     * @param payment 支付记录
     * @return 支付记录
     */
    @Override
    public List<Payment> selectPaymentList(Payment payment)
    {
        return paymentMapper.selectPaymentList(payment);
    }

    /**
     * 新增支付记录
     * 
     * @param payment 支付记录
     * @return 结果
     */
    @Override
    public int insertPayment(Payment payment)
    {
        return paymentMapper.insertPayment(payment);
    }

    /**
     * 修改支付记录
     * 
     * @param payment 支付记录
     * @return 结果
     */
    @Override
    public int updatePayment(Payment payment)
    {
        return paymentMapper.updatePayment(payment);
    }

    /**
     * 批量删除支付记录
     * 
     * @param paymentIds 需要删除的支付记录主键
     * @return 结果
     */
    @Override
    public int deletePaymentByPaymentIds(Long[] paymentIds)
    {
        return paymentMapper.deletePaymentByPaymentIds(paymentIds);
    }

    /**
     * 删除支付记录信息
     * 
     * @param paymentId 支付记录主键
     * @return 结果
     */
    @Override
    public int deletePaymentByPaymentId(Long paymentId)
    {
        return paymentMapper.deletePaymentByPaymentId(paymentId);
    }
}
