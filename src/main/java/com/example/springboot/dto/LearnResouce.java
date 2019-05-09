package com.example.springboot.dto;

public class LearnResouce {
    private String title;
    private String name;
    private String link;

    public LearnResouce(String title, String name, String link) {
        this.title = title;
        this.name = name;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
