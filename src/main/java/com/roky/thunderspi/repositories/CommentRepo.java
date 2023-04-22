package com.roky.thunderspi.repositories;

import com.roky.thunderspi.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
@Repository
public interface CommentRepo  extends JpaRepository<Comment,Long> {
=======
import java.util.List;

@Repository
public interface CommentRepo  extends JpaRepository<Comment,Long> {
    List<Comment> findAll();
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
}
