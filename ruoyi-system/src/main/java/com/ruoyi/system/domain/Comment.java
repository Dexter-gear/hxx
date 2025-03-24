package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评论对象 comment
 * 
 * @author hxx
 * @date 2025-03-24
 */
public class Comment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 评论ID */
    private Long commentId;

    /** 商品ID */
    @Excel(name = "商品ID")
    private Long productId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 评分，1-5分 */
    @Excel(name = "评分，1-5分")
    private Long rating;

    /** 评论内容 */
    @Excel(name = "评论内容")
    private String commentText;

    public void setCommentId(Long commentId) 
    {
        this.commentId = commentId;
    }

    public Long getCommentId() 
    {
        return commentId;
    }

    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setRating(Long rating) 
    {
        this.rating = rating;
    }

    public Long getRating() 
    {
        return rating;
    }

    public void setCommentText(String commentText) 
    {
        this.commentText = commentText;
    }

    public String getCommentText() 
    {
        return commentText;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("commentId", getCommentId())
            .append("productId", getProductId())
            .append("userId", getUserId())
            .append("rating", getRating())
            .append("commentText", getCommentText())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
