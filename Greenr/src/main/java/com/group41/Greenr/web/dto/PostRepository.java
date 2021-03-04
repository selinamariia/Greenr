package com.group41.Greenr.web.dto;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.group41.Greenr.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	@Query("select p from Post p where postName like %?1%")
	List<Post> findByName(Optional<String> postName);

}
