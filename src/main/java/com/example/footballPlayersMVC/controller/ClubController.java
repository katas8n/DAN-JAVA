package com.example.footballPlayersMVC.controller;

import com.example.footballPlayersMVC.model.ClubModel;
import jakarta.validation.Valid;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/club")
public class ClubController {

    @RequestMapping("/add_club_form")
    public String addClubForm(@ModelAttribute("club") ClubModel club) {
        return "add-club-form";
    }

    @RequestMapping("/processing_club_form")
    public String processingClubForm(@Valid @ModelAttribute("club") ClubModel club, BindingResult result) {
        System.out.println("Here we are");
        System.out.println(club.getClubName());
        System.out.println(result.hasErrors());
        if(result.hasErrors()) {
            return "error";
        }
        return "processing-club-form";
    }
}
