//package com.adabrain.services.models;
//
//import javax.persistence.*;
//import java.util.UUID;
//
//@Entity
//@Table
//public class Game {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String id;
//
//    @Column
//    private String name;
//    @Column
//    private String releasedYear;
//    @Column
//    private String genre;
//
//    public Game(String name, String releasedYear, String genre) {
//        this.name = name;
//        this.releasedYear = releasedYear;
//        this.genre = genre;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getReleasedYear() {
//        return releasedYear;
//    }
//
//    public void setReleasedYear(String releasedYear) {
//        this.releasedYear = releasedYear;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//}
