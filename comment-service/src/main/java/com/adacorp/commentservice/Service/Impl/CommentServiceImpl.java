package com.adacorp.commentservice.Service.Impl;

import com.adacorp.commentservice.Dto.CommentReqDto;
import com.adacorp.commentservice.Dto.CommentResDto;
import com.adacorp.commentservice.Entity.Comment;
import com.adacorp.commentservice.Repository.CommentRepository;
import com.adacorp.commentservice.Service.Interf.CommentServiceInterf;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CommentServiceImpl extends CommentServiceInterf {
    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<CommentResDto> getAllComments() {

        List<Comment> comments = commentRepository.findAll();
        List<CommentResDto> commentResDtos = new ArrayList<>();

        for (Comment comment : comments) {
            commentResDtos.add(new CommentResDto().fromComment(comment));
        }
        return commentResDtos;
    }

    @Override
    public void deleteCommentById(UUID commentId) {
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new RuntimeException("Ce commentaire n'existe pas!!"));
        commentRepository.deleteById(comment.getCommentId());
    }

    @Override
    public CommentResDto updateComment(CommentReqDto comment) {
        return new CommentResDto().fromComment(commentRepository.save(comment.toComment()));
    }

    @Override
    public CommentResDto createComment(CommentReqDto comment) {
        return new CommentResDto().fromComment(commentRepository.save(comment.toComment()));
    }




}
