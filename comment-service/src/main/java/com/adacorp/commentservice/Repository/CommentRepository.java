package com.adacorp.commentservice.Repository;

import com.adacorp.commentservice.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID> {


}
