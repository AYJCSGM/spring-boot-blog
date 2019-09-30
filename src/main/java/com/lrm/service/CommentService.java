package com.lrm.service;

import com.lrm.po.Comment;

import java.util.List;

/**
 * Created by 黄秋平 on 2019.06.18
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
