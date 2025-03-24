package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserAddressMapper;
import com.ruoyi.system.domain.UserAddress;
import com.ruoyi.system.service.IUserAddressService;

/**
 * 用户收货地址Service业务层处理
 * 
 * @author hxx
 * @date 2025-03-24
 */
@Service
public class UserAddressServiceImpl implements IUserAddressService 
{
    @Autowired
    private UserAddressMapper userAddressMapper;

    /**
     * 查询用户收货地址
     * 
     * @param addressId 用户收货地址主键
     * @return 用户收货地址
     */
    @Override
    public UserAddress selectUserAddressByAddressId(Long addressId)
    {
        return userAddressMapper.selectUserAddressByAddressId(addressId);
    }

    /**
     * 查询用户收货地址列表
     * 
     * @param userAddress 用户收货地址
     * @return 用户收货地址
     */
    @Override
    public List<UserAddress> selectUserAddressList(UserAddress userAddress)
    {
        return userAddressMapper.selectUserAddressList(userAddress);
    }

    /**
     * 新增用户收货地址
     * 
     * @param userAddress 用户收货地址
     * @return 结果
     */
    @Override
    public int insertUserAddress(UserAddress userAddress)
    {
        userAddress.setCreateTime(DateUtils.getNowDate());
        return userAddressMapper.insertUserAddress(userAddress);
    }

    /**
     * 修改用户收货地址
     * 
     * @param userAddress 用户收货地址
     * @return 结果
     */
    @Override
    public int updateUserAddress(UserAddress userAddress)
    {
        userAddress.setUpdateTime(DateUtils.getNowDate());
        return userAddressMapper.updateUserAddress(userAddress);
    }

    /**
     * 批量删除用户收货地址
     * 
     * @param addressIds 需要删除的用户收货地址主键
     * @return 结果
     */
    @Override
    public int deleteUserAddressByAddressIds(Long[] addressIds)
    {
        return userAddressMapper.deleteUserAddressByAddressIds(addressIds);
    }

    /**
     * 删除用户收货地址信息
     * 
     * @param addressId 用户收货地址主键
     * @return 结果
     */
    @Override
    public int deleteUserAddressByAddressId(Long addressId)
    {
        return userAddressMapper.deleteUserAddressByAddressId(addressId);
    }
}
