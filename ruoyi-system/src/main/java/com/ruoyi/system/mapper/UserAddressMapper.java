package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.UserAddress;

/**
 * 用户收货地址Mapper接口
 * 
 * @author hxx
 * @date 2025-03-24
 */
public interface UserAddressMapper 
{
    /**
     * 查询用户收货地址
     * 
     * @param addressId 用户收货地址主键
     * @return 用户收货地址
     */
    public UserAddress selectUserAddressByAddressId(Long addressId);

    /**
     * 查询用户收货地址列表
     * 
     * @param userAddress 用户收货地址
     * @return 用户收货地址集合
     */
    public List<UserAddress> selectUserAddressList(UserAddress userAddress);

    /**
     * 新增用户收货地址
     * 
     * @param userAddress 用户收货地址
     * @return 结果
     */
    public int insertUserAddress(UserAddress userAddress);

    /**
     * 修改用户收货地址
     * 
     * @param userAddress 用户收货地址
     * @return 结果
     */
    public int updateUserAddress(UserAddress userAddress);

    /**
     * 删除用户收货地址
     * 
     * @param addressId 用户收货地址主键
     * @return 结果
     */
    public int deleteUserAddressByAddressId(Long addressId);

    /**
     * 批量删除用户收货地址
     * 
     * @param addressIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserAddressByAddressIds(Long[] addressIds);
}
