package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DeliveryMapper;
import com.ruoyi.system.domain.Delivery;
import com.ruoyi.system.service.IDeliveryService;

/**
 * 配送信息Service业务层处理
 * 
 * @author hxx
 * @date 2025-03-24
 */
@Service
public class DeliveryServiceImpl implements IDeliveryService 
{
    @Autowired
    private DeliveryMapper deliveryMapper;

    /**
     * 查询配送信息
     * 
     * @param deliveryId 配送信息主键
     * @return 配送信息
     */
    @Override
    public Delivery selectDeliveryByDeliveryId(Long deliveryId)
    {
        return deliveryMapper.selectDeliveryByDeliveryId(deliveryId);
    }

    /**
     * 查询配送信息列表
     * 
     * @param delivery 配送信息
     * @return 配送信息
     */
    @Override
    public List<Delivery> selectDeliveryList(Delivery delivery)
    {
        return deliveryMapper.selectDeliveryList(delivery);
    }

    /**
     * 新增配送信息
     * 
     * @param delivery 配送信息
     * @return 结果
     */
    @Override
    public int insertDelivery(Delivery delivery)
    {
        return deliveryMapper.insertDelivery(delivery);
    }

    /**
     * 修改配送信息
     * 
     * @param delivery 配送信息
     * @return 结果
     */
    @Override
    public int updateDelivery(Delivery delivery)
    {
        delivery.setUpdateTime(DateUtils.getNowDate());
        return deliveryMapper.updateDelivery(delivery);
    }

    /**
     * 批量删除配送信息
     * 
     * @param deliveryIds 需要删除的配送信息主键
     * @return 结果
     */
    @Override
    public int deleteDeliveryByDeliveryIds(Long[] deliveryIds)
    {
        return deliveryMapper.deleteDeliveryByDeliveryIds(deliveryIds);
    }

    /**
     * 删除配送信息信息
     * 
     * @param deliveryId 配送信息主键
     * @return 结果
     */
    @Override
    public int deleteDeliveryByDeliveryId(Long deliveryId)
    {
        return deliveryMapper.deleteDeliveryByDeliveryId(deliveryId);
    }
}
