package com.example.footballPlayersMVC.service;

import com.example.footballPlayersMVC.model.FootballPlayer;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {
    private List<FootballPlayer> players = Arrays.asList(
            new FootballPlayer(1, "Lionel Messi", "Los Angeles Galaxy", Date.valueOf("1934-11-01")),
            new FootballPlayer(2, "Cristiano Ronaldo", "Manchester United",  Date.valueOf("1934-11-01")),
            new FootballPlayer(3, "Steven Gerard", "FC Liverpool",  Date.valueOf("1934-11-01"))
    );

    public FootballPlayer getPlayer(String pName) {
        return players.stream().filter(player -> player.getName().equals(pName)).findFirst().orElse(null);
    }

    public List<FootballPlayer> getAllPlayers() {
        return players;
    }
}
