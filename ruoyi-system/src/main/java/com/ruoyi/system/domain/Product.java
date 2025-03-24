package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品对象 product
 * 
 * @author hxx
 * @date 2025-03-24
 */
public class Product extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品ID */
    private Long productId;

    /** 所属分类ID */
    @Excel(name = "所属分类ID")
    private Long categoryId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String productName;

    /** 商品描述 */
    @Excel(name = "商品描述")
    private String description;

    /** 商品单价 */
    @Excel(name = "商品单价")
    private BigDecimal price;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Long stock;

    /** 商品图片地址 */
    @Excel(name = "商品图片地址")
    private String imageUrl;

    /** 状态：1-上架，0-下架 */
    @Excel(name = "状态：1-上架，0-下架")
    private Long status;

    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }

    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setStock(Long stock) 
    {
        this.stock = stock;
    }

    public Long getStock() 
    {
        return stock;
    }

    public void setImageUrl(String imageUrl) 
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() 
    {
        return imageUrl;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("productId", getProductId())
            .append("categoryId", getCategoryId())
            .append("productName", getProductName())
            .append("description", getDescription())
            .append("price", getPrice())
            .append("stock", getStock())
            .append("imageUrl", getImageUrl())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
