package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OrdersMapper;
import com.ruoyi.system.domain.Orders;
import com.ruoyi.system.service.IOrdersService;

/**
 * 订单Service业务层处理
 * 
 * @author hxx
 * @date 2025-03-24
 */
@Service
public class OrdersServiceImpl implements IOrdersService 
{
    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * 查询订单
     * 
     * @param orderId 订单主键
     * @return 订单
     */
    @Override
    public Orders selectOrdersByOrderId(Long orderId)
    {
        return ordersMapper.selectOrdersByOrderId(orderId);
    }

    /**
     * 查询订单列表
     * 
     * @param orders 订单
     * @return 订单
     */
    @Override
    public List<Orders> selectOrdersList(Orders orders)
    {
        return ordersMapper.selectOrdersList(orders);
    }

    /**
     * 新增订单
     * 
     * @param orders 订单
     * @return 结果
     */
    @Override
    public int insertOrders(Orders orders)
    {
        orders.setCreateTime(DateUtils.getNowDate());
        return ordersMapper.insertOrders(orders);
    }

    /**
     * 修改订单
     * 
     * @param orders 订单
     * @return 结果
     */
    @Override
    public int updateOrders(Orders orders)
    {
        orders.setUpdateTime(DateUtils.getNowDate());
        return ordersMapper.updateOrders(orders);
    }

    /**
     * 批量删除订单
     * 
     * @param orderIds 需要删除的订单主键
     * @return 结果
     */
    @Override
    public int deleteOrdersByOrderIds(Long[] orderIds)
    {
        return ordersMapper.deleteOrdersByOrderIds(orderIds);
    }

    /**
     * 删除订单信息
     * 
     * @param orderId 订单主键
     * @return 结果
     */
    @Override
    public int deleteOrdersByOrderId(Long orderId)
    {
        return ordersMapper.deleteOrdersByOrderId(orderId);
    }
}
