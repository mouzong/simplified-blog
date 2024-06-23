package com.adacorp.commentservice.Dto;

import com.adacorp.commentservice.Entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentReqDto {
    private String CommentContent;
    private LocalDateTime CreatedAt;
    private UUID CommentId;

    public Comment toComment() {
        return Comment.builder()
                .commentId(getCommentId())
                .commentContent(getCommentContent())
                .createdAt(getCreatedAt())
                .build();
    }

}
