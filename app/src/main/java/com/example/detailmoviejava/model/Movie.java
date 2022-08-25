package com.example.detailmoviejava.model;

import java.io.Serializable;

public class Movie implements Serializable {
    private String name;
    private String create_at;
    private String thumbnail;
    private String description;
    private Category category;
    private Director director;

    public Movie() {
    }

    public Movie(String name, String create_at, String thumbnail, String description, Category category, Director director) {
        this.name = name;
        this.create_at = create_at;
        this.thumbnail = thumbnail;
        this.description = description;
        this.category = category;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
