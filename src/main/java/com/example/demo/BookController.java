package com.example.demo;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class BookController {

    List<Book> books = new ArrayList<>(List.of(

    new Book("It Ends With Us", "Romance", "English",
        "A deeply emotional story that follows Lily Bloom as she navigates love, heartbreak, and difficult choices in relationships, ultimately learning to prioritize self-respect and healing.",
        "Colleen Hoover"),

    new Book("Pride and Prejudice", "Romance", "English",
        "A classic romance that explores the evolving relationship between Elizabeth Bennet and Mr. Darcy, dealing with misunderstandings, pride, and societal expectations.",
        "Jane Austen"),

    new Book("Gunahon Ka Devta", "Romance", "Hindi",
        "A tragic love story between Chandar and Sudha that explores sacrifice, societal pressure, and emotional conflict in relationships.",
        "Dharamvir Bharati"),

    new Book("Your Dreams Are Mine Now", "Romance", "Hindi",
        "A college romance that turns into a story of love, loss, and political awakening, showing how love can inspire change.",
        "Ravinder Singh"),

    new Book("Maidanam", "Romance", "Telugu",
        "A bold Telugu novel that explores a woman's emotional and physical desires while questioning traditional norms and societal restrictions.",
        "Chalam"),

    new Book("Swarna Kamalam Kathalu", "Romance", "Telugu",
        "A collection of stories reflecting subtle emotions, relationships, and love in everyday life with a cultural touch.",
        "Yaddanapudi Sulochana Rani"),

    new Book("Gone Girl", "Thriller", "English",
        "A psychological thriller about a marriage gone wrong where a wife's disappearance reveals shocking secrets and twists.",
        "Gillian Flynn"),

    new Book("The Da Vinci Code", "Thriller", "English",
        "A fast-paced mystery involving hidden symbols, religious secrets, and a race against time to uncover a dangerous truth.",
        "Dan Brown"),

    new Book("The Rozabal Line", "Thriller", "Hindi",
        "A conspiracy thriller blending history, religion, and suspense, revolving around secrets that could shake the foundations of belief.",
        "Ashwin Sanghi"),

    new Book("Chanakya's Chant", "Thriller", "Hindi",
        "A gripping story that connects ancient political strategies of Chanakya with modern-day politics and ambition.",
        "Ashwin Sanghi"),

    new Book("Tulasi Dalam", "Thriller", "Telugu",
        "A supernatural thriller involving black magic, fear, and psychological tension that keeps readers on edge.",
        "Yandamuri Veerendranath"),

    new Book("Dabbu to the Power of Dabbu", "Thriller", "Telugu",
        "A thought-provoking novel exploring greed, ambition, and the consequences of money-driven decisions.",
        "Yandamuri Veerendranath"),


    new Book("Three Men in a Boat", "Comedy", "English",
        "A humorous travel tale of three friends whose simple boat trip turns into a series of funny and relatable misadventures.",
        "Jerome K. Jerome"),

    new Book("The Hitchhiker's Guide to the Galaxy", "Comedy", "English",
        "A science fiction comedy filled with absurd situations, following Arthur Dent as he travels across space after Earth's destruction.",
        "Douglas Adams"),

    
    new Book("Harishankar Parsai Rachanavali", "Comedy", "Hindi",
        "A collection of satirical essays that humorously criticize society, politics, and human behavior.",
        "Harishankar Parsai"),

    new Book("Raag Darbari", "Comedy", "Hindi",
        "A satirical novel that humorously exposes the corruption and hypocrisy in rural Indian society.",
        "Shrilal Shukla"),

    new Book("Ganapathi", "Comedy", "Telugu",
        "A classic humorous novel portraying the life and misadventures of a naive Brahmin boy with witty storytelling.",
        "Chilakamarti Lakshmi Narasimham"),

    new Book("Barrister Parvateesam", "Comedy", "Telugu",
        "A hilarious coming-of-age story of a young man traveling abroad, filled with innocence, mistakes, and humor.",
        "Mokkapati Narasimha Sastry"),

    new Book("The Shining", "Horror", "English",
        "A psychological horror story of a man slowly losing sanity in an isolated haunted hotel, putting his family at risk.",
        "Stephen King"),

    new Book("Dracula", "Horror", "English",
        "A gothic horror tale of Count Dracula and his attempt to spread his curse beyond Transylvania.",
        "Bram Stoker"),

    new Book("Bhootnath", "Horror", "Hindi",
        "A supernatural tale involving ghosts and eerie experiences that blend fear with curiosity.",
        "Vishnu Sharma (adapted versions)"),

    new Book("Tantrik Kathayein", "Horror", "Hindi",
        "A collection of stories revolving around black magic, rituals, and supernatural beliefs.",
        "Various Authors"),

    new Book("Kashmora", "Horror", "Telugu",
        "A spooky tale involving dark forces, revenge, and supernatural elements rooted in folklore.",
        "Dr. Kasi Viswanath"),

    new Book("Bhayanaka Kathalu", "Horror", "Telugu",
        "A collection of terrifying short stories exploring ghosts, spirits, and unexplained events.",
        "Various Authors"),

    new Book("The Kite Runner", "Drama", "English",
        "A powerful story of friendship and redemption set in Afghanistan, exploring guilt and forgiveness.",
        "Khaled Hosseini"),

    new Book("To Kill a Mockingbird", "Drama", "English",
        "A moving story about racial injustice and moral growth seen through the eyes of a young girl.",
        "Harper Lee"),

    new Book("Godaan", "Drama", "Hindi",
        "A realistic portrayal of rural India focusing on the struggles of a poor farmer and social inequality.",
        "Munshi Premchand"),

    new Book("Nirmala", "Drama", "Hindi",
        "A tragic story highlighting dowry issues and the emotional suffering of a young girl in a forced marriage.",
        "Munshi Premchand"),

    new Book("Veyi Padagalu", "Drama", "Telugu",
        "An epic novel depicting the cultural and social transformation of a village over generations.",
        "Viswanatha Satyanarayana"),

    new Book("Kanyasulkam", "Drama", "Telugu",
        "A classic play criticizing social evils like child marriage and dowry through satire and drama.",
        "Gurajada Apparao")

));

    @GetMapping("/getBooks")
    public List<Book> getBooks(@RequestParam String genre) {

        String input = genre.trim().toLowerCase(); // case-insensitive + trim

        return books.stream()
                .filter(book -> book.getGenre().toLowerCase().contains(input)) // partial match 🔥
                .toList();
    }

    
<<<<<<< HEAD
}
=======
}
>>>>>>> 6bbceafc4d0a7e91d630560c51131a499e34b32d
