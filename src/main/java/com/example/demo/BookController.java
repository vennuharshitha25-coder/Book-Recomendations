package com.example.demo;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class BookController {

    List<Book> books = new ArrayList<>(List.of(

        // ROMANCE
        new Book("Love Story", "Romance", "English", "A boy meets a girl."),
        new Book("Forever Us", "Romance", "English", "Two souls destined together."),
        new Book("Dil Se", "Romance", "Hindi", "Deep emotional love story."),
        new Book("Prema Katha", "Romance", "Telugu", "Village love story."),
        new Book("Heart Beats", "Romance", "English", "Modern love journey."),

        // THRILLER
        new Book("Thriller Night", "Thriller", "English", "A murder mystery."),
        new Book("Dark Secrets", "Thriller", "English", "Hidden truths unfold."),
        new Book("Khooni Raaz", "Thriller", "Hindi", "Crime investigation."),
        new Book("Mystery Case", "Thriller", "English", "Detective solves puzzle."),
        new Book("Danger Zone", "Thriller", "English", "High-risk adventure."),

        // COMEDY
        new Book("Comedy Express", "Comedy", "Hindi", "Fun-filled journey."),
        new Book("Laugh Out Loud", "Comedy", "English", "Hilarious events."),
        new Book("Fun Unlimited", "Comedy", "English", "Comedy chaos."),
        new Book("Navvulu", "Comedy", "Telugu", "Lighthearted story."),
        new Book("Crazy Friends", "Comedy", "English", "Friends comedy."),

        // HORROR
        new Book("Horror House", "Horror", "English", "Haunted house."),
        new Book("Ghost Night", "Horror", "English", "Paranormal story."),
        new Book("Bhoot", "Horror", "Hindi", "Ghost revenge."),
        new Book("Chudail", "Horror", "Hindi", "Scary legend."),
        new Book("Dark Room", "Horror", "English", "Terrifying events."),

        // DRAMA
        new Book("Telugu Tales", "Drama", "Telugu", "Village emotional story."),
        new Book("Life Story", "Drama", "English", "Human struggles."),
        new Book("Zindagi", "Drama", "Hindi", "Life journey."),
        new Book("Family Bonds", "Drama", "English", "Relationships."),
        new Book("Emotions", "Drama", "English", "Deep feelings.")
    ));

    @GetMapping("/getBooks")
    public List<Book> getBooks(@RequestParam String genre) {

        String input = genre.trim().toLowerCase(); // case-insensitive + trim

        return books.stream()
                .filter(book -> book.getGenre().toLowerCase().contains(input)) // partial match 🔥
                .toList();
    }
}