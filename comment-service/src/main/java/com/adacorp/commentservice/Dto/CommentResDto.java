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
@NoArgsConstructor
@AllArgsConstructor
public class CommentResDto {
    private UUID CommentId;
    private String CommentContent;
    private LocalDateTime CreatedAt;

    public CommentResDto fromComment(Comment comment) {
        return CommentResDto.builder()
                .CommentId(comment.getCommentId())
                .CommentContent(comment.getCommentContent())
                .CreatedAt(comment.getCreatedAt())
                .build();
    }
}
