package org.prediction.game.controller;

import org.prediction.game.domain.Team;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping
    public List<Team> getAll() {
        return teams;
    }

    @PostMapping
    public List<Team> createTeam(@RequestBody Team team) {
        teams.add(team);
        return teams;
    }

    @GetMapping(value = "/{location}")
    public List<Team> getTeamBy(@PathVariable String location) {
        return teams
                .stream()
                .filter((Team t) -> t.getLocation().equals(location))
                .collect(Collectors.toList());
    }
}
