package com.codegym.blog.repository;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findAllByNameContaining(Pageable pageable, String name);
    List<Blog> findAllByNameContaining(String name);
    @Query(value ="select * from blog limit  ?1,?2   ",nativeQuery = true)
    List<Blog> findAllScroll(int start,int limit);


    @Query(value = "select * from blog where category_id =  ?1",  nativeQuery = true)
    List<Blog> findBlogByCategory(int id );
}
