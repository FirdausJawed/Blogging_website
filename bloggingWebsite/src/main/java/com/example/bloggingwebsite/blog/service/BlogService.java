package com.example.bloggingwebsite.blog.service;

import com.example.bloggingwebsite.blog.model.Blog;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class BlogService {

    private final Map<String, Blog> blogRepository = new HashMap<>();

    public Blog createBlog(Blog blog) {
        String id = UUID.randomUUID().toString();
        blog.setId(id);
        blog.setDateTimeCreated(LocalDateTime.now());
        blogRepository.put(id, blog);
        return blog;
    }

    public Blog getBlog(String id) {
        return blogRepository.get(id);
    }

    public Collection<Blog> getAllBlogs() {
        return blogRepository.values();
    }

    public Blog updateBlog(String id, Blog blog) {
        if (blogRepository.containsKey(id)) {
            blog.setId(id);
            blog.setDateTimeCreated(blogRepository.get(id).getDateTimeCreated());
            blogRepository.put(id, blog);
            return blog;
        }
        return null;
    }

    public void deleteBlog(String id) {
        blogRepository.remove(id);
    }
}
