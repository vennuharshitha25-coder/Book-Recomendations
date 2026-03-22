package com.example.demo;

public class Book {
    private String title;
    private String genre;
    private String language;
    private String story;

    public Book(String title, String genre, String language, String story) {
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.story = story;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getLanguage() { return language; }
    public String getStory() { return story; }
}