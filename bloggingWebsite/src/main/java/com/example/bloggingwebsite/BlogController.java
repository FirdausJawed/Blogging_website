package com.example.bloggingwebsite;

import com.example.bloggingwebsite.blog.model.Blog;
import com.example.bloggingwebsite.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/create")
    public Blog createBlog(@RequestBody Blog blog) {
        return blogService.createBlog(blog);
    }

    @GetMapping("/{id}/getblogbyid")
    public Blog getBlog(@PathVariable String id) {

        Blog blog = blogService.getBlog(id);
        if (blog == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Blog not found");
        }
        return blog;
    }

    @GetMapping("/getallblogs")
    public Collection<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @PutMapping("/{id}/updateblog")
    public Blog updateBlog(@PathVariable String id, @RequestBody Blog blog) {
        return blogService.updateBlog(id, blog);
    }

    @DeleteMapping("/{id}/deleteblog")
    public void deleteBlog(@PathVariable String id) {
        blogService.deleteBlog(id);
    }
}
