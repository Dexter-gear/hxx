package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Comment;

/**
 * 评论Mapper接口
 * 
 * @author hxx
 * @date 2025-03-24
 */
public interface CommentMapper 
{
    /**
     * 查询评论
     * 
     * @param commentId 评论主键
     * @return 评论
     */
    public Comment selectCommentByCommentId(Long commentId);

    /**
     * 查询评论列表
     * 
     * @param comment 评论
     * @return 评论集合
     */
    public List<Comment> selectCommentList(Comment comment);

    /**
     * 新增评论
     * 
     * @param comment 评论
     * @return 结果
     */
    public int insertComment(Comment comment);

    /**
     * 修改评论
     * 
     * @param comment 评论
     * @return 结果
     */
    public int updateComment(Comment comment);

    /**
     * 删除评论
     * 
     * @param commentId 评论主键
     * @return 结果
     */
    public int deleteCommentByCommentId(Long commentId);

    /**
     * 批量删除评论
     * 
     * @param commentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCommentByCommentIds(Long[] commentIds);
}
