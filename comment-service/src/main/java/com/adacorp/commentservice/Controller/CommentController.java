package com.adacorp.commentservice.Controller;

import com.adacorp.commentservice.Dto.CommentReqDto;
import com.adacorp.commentservice.Dto.CommentResDto;
import com.adacorp.commentservice.Entity.Comment;
import com.adacorp.commentservice.Service.Interf.CommentServiceInterf;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private final CommentServiceInterf commentServiceInterf;

    public CommentController(CommentServiceInterf commentServiceInterf) {
        this.commentServiceInterf = commentServiceInterf;
    }

    @PostMapping("/create-comment")
    public CommentResDto create ( CommentReqDto comment){
        return commentServiceInterf.createComment(comment);
    }

    @GetMapping("/get-all-comments")
    public List<CommentResDto> getAllComments() {

        return commentServiceInterf.getAllComments();
    }

    @DeleteMapping("/delete-comment-by-id")
    public void deleteCommentById(UUID commentId) {
        commentServiceInterf.deleteCommentById(commentId);
    }

    @PutMapping("/update-user")
    public CommentResDto updateUser(CommentReqDto comment) {
        return commentServiceInterf.updateComment(comment);
    }

}
