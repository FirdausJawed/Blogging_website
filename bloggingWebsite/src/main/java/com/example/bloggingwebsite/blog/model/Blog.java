package com.example.bloggingwebsite.blog.model;

import java.time.LocalDateTime;
import java.util.List;

public class Blog {
    private String id;
    private LocalDateTime dateTimeCreated;
    private List<String> authors;
    private String content;

    public Blog(String id, LocalDateTime dateTimeCreated, List<String> authors, String content) {
        this.id = id;
        this.dateTimeCreated = dateTimeCreated;
        this.authors = authors;
        this.content = content;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(LocalDateTime dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
