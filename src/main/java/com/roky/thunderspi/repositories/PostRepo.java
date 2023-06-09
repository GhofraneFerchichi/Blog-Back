package com.roky.thunderspi.repositories;


import com.roky.thunderspi.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo  extends JpaRepository<Post,Long> {

    @Query("SELECT p FROM Post p  WHERE p.deleted_at = 0 ORDER BY p.created_At DESC")
    List<Post> findAllByDeleted_atIsNull();
    Post findById(int id);
    Post findByTitleLike(String title);
    //Post findByEmail(String email);

}
