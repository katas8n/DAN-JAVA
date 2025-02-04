package com.example.footballPlayersMVC.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;


@Component
public class ClubModel {
//    @Pattern(regexp = "[A-Z][a-z]+", message = "Club name must start with a capital letter!")
    @NotNull(message = "Club must have the name!")
    @Size(min = 4, max = 23, message = "Club name must be between 4 and 23 characters!")
    private String clubName;
    private Boolean isChampion;
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getIsChampion() {
        return isChampion;
    }

    public void setIsChampion(Boolean isChampion) {
        this.isChampion = isChampion;
    }

    public ClubModel() {}

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}
