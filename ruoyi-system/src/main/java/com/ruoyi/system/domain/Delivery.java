package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配送信息对象 delivery
 * 
 * @author hxx
 * @date 2025-03-24
 */
public class Delivery extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 配送信息ID */
    private Long deliveryId;

    /** 订单ID */
    @Excel(name = "订单ID")
    private Long orderId;

    /** 配送状态 */
    @Excel(name = "配送状态")
    private String deliveryStatus;

    /** 物流单号 */
    @Excel(name = "物流单号")
    private String trackingNumber;

    /** 发货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryTime;

    public void setDeliveryId(Long deliveryId) 
    {
        this.deliveryId = deliveryId;
    }

    public Long getDeliveryId() 
    {
        return deliveryId;
    }

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }

    public void setDeliveryStatus(String deliveryStatus) 
    {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryStatus() 
    {
        return deliveryStatus;
    }

    public void setTrackingNumber(String trackingNumber) 
    {
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() 
    {
        return trackingNumber;
    }

    public void setDeliveryTime(Date deliveryTime) 
    {
        this.deliveryTime = deliveryTime;
    }

    public Date getDeliveryTime() 
    {
        return deliveryTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deliveryId", getDeliveryId())
            .append("orderId", getOrderId())
            .append("deliveryStatus", getDeliveryStatus())
            .append("trackingNumber", getTrackingNumber())
            .append("deliveryTime", getDeliveryTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
