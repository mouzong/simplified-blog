package com.adacorp.commentservice.Service.Interf;

import com.adacorp.commentservice.Dto.CommentReqDto;
import com.adacorp.commentservice.Dto.CommentResDto;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public abstract class CommentServiceInterf {
    public abstract List<CommentResDto> getAllComments();


    public abstract void deleteCommentById(UUID commentId);

    public abstract CommentResDto updateComment(CommentReqDto comment);

    public abstract CommentResDto createComment(CommentReqDto comment);
}
