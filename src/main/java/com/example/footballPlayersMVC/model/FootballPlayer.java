package com.example.footballPlayersMVC.model;

import java.util.Date;

public class FootballPlayer {
    private int id;
    private String name;
    private String club;
    private Date birthDate;

    private String nationality;

    public FootballPlayer(int id, String name, String club, Date birthDate) {
        this.id = id;
        this.name = name;
        this.club = club;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Date getBirthDate() {
        return birthDate;
    }



    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
