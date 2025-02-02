package com.example.footballPlayersMVC.controller;

import com.example.footballPlayersMVC.model.FootballPlayer;
import com.example.footballPlayersMVC.service.PlayerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.http.HttpRequest;

@Controller
//@RequestMapping("/")
public class FootballPlayerController {
    private final PlayerService playerService;
    @RequestMapping("/")
//    @ResponseBody()
    public String sayHello() {
        return "main-menu";
    }

    public FootballPlayerController(PlayerService playerService, PlayerService playerService1) {
        this.playerService = playerService1;
    }

    @RequestMapping("/search-form")
    public String searchForm() {
        return "search-form";
    }

    @RequestMapping("/players-info")
    public String playersInfo(Model model) {
        System.out.println(this.playerService.getAllPlayers());
        model.addAttribute("players", this.playerService.getAllPlayers());
        return "players-info";
    }


    @RequestMapping("/player-details")
    public String playerDetails(HttpServletRequest request, Model model) {
        System.out.println("There is a name from the request: " + request.getParameter("playerName"));

        String name = request.getParameter("playerName");

        FootballPlayer footballPlayer = this.playerService.getPlayer(name);

        model.addAttribute("name", name);
//        model.addAttribute("nationality", footballPlayer.getNationality());
        model.addAttribute("club", footballPlayer.getClub());
        model.addAttribute("dateOfBirth", footballPlayer.getBirthDate());
//        model.addAttribute("name", name);
        model.addAttribute("age", 23);

        return "player-details";
    }
}
