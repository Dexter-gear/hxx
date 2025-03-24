package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 支付记录对象 payment
 * 
 * @author hxx
 * @date 2025-03-24
 */
public class Payment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 支付记录ID */
    private Long paymentId;

    /** 订单ID */
    @Excel(name = "订单ID")
    private Long orderId;

    /** 支付方式（如支付宝、微信、银行卡等） */
    @Excel(name = "支付方式", readConverterExp = "如=支付宝、微信、银行卡等")
    private String paymentMethod;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private BigDecimal paymentAmount;

    /** 支付时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "支付时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date paymentTime;

    public void setPaymentId(Long paymentId) 
    {
        this.paymentId = paymentId;
    }

    public Long getPaymentId() 
    {
        return paymentId;
    }

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }

    public void setPaymentMethod(String paymentMethod) 
    {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() 
    {
        return paymentMethod;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) 
    {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getPaymentAmount() 
    {
        return paymentAmount;
    }

    public void setPaymentTime(Date paymentTime) 
    {
        this.paymentTime = paymentTime;
    }

    public Date getPaymentTime() 
    {
        return paymentTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("paymentId", getPaymentId())
            .append("orderId", getOrderId())
            .append("paymentMethod", getPaymentMethod())
            .append("paymentAmount", getPaymentAmount())
            .append("paymentTime", getPaymentTime())
            .toString();
    }
}
