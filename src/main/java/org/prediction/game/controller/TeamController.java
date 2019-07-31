package org.prediction.game.controller;

import org.prediction.game.domain.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/teams")
public class TeamController {

    private List<Team> teams  = new ArrayList<>();

    public TeamController() {
        Team manchesterUnited = new Team("Manchester United", "Manchester");
        Team chelsea = new Team("Chelsea", "London");
        Team arsenal = new Team("Arsenal", "London");

        teams.add(manchesterUnited);
        teams.add(chelsea);
        teams.add(arsenal);
    }

    @GetMapping(value = "all")
    public List<Team> getAll() {
        return teams;
    }
}
