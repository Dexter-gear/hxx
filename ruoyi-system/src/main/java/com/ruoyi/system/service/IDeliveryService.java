package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Delivery;

/**
 * 配送信息Service接口
 * 
 * @author hxx
 * @date 2025-03-24
 */
public interface IDeliveryService 
{
    /**
     * 查询配送信息
     * 
     * @param deliveryId 配送信息主键
     * @return 配送信息
     */
    public Delivery selectDeliveryByDeliveryId(Long deliveryId);

    /**
     * 查询配送信息列表
     * 
     * @param delivery 配送信息
     * @return 配送信息集合
     */
    public List<Delivery> selectDeliveryList(Delivery delivery);

    /**
     * 新增配送信息
     * 
     * @param delivery 配送信息
     * @return 结果
     */
    public int insertDelivery(Delivery delivery);

    /**
     * 修改配送信息
     * 
     * @param delivery 配送信息
     * @return 结果
     */
    public int updateDelivery(Delivery delivery);

    /**
     * 批量删除配送信息
     * 
     * @param deliveryIds 需要删除的配送信息主键集合
     * @return 结果
     */
    public int deleteDeliveryByDeliveryIds(Long[] deliveryIds);

    /**
     * 删除配送信息信息
     * 
     * @param deliveryId 配送信息主键
     * @return 结果
     */
    public int deleteDeliveryByDeliveryId(Long deliveryId);
}
