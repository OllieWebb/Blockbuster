package com.sparta.ow.blockbuster.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "dvds", schema = "blockbuster")
public class Dvd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dvd_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "title", length = 50)
    private String title;

    @Size(max = 50)
    @Column(name = "actors", length = 50)
    private String actors;

    @Size(max = 50)
    @Column(name = "director", length = 50)
    private String director;

    @Size(max = 50)
    @Column(name = "genre", length = 50)
    private String genre;

    @Column(name = "releaseDate")
    private LocalDate releaseDate;

    @Column(name = "numOfCopies")
    private Integer numOfCopies;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(Integer numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

}