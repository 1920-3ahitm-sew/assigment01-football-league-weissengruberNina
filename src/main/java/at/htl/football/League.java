package at.htl.football;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class League {
    private static List<Team> teams = new ArrayList<>();

    public static void addMatchResult(Match match){
        Team homeTeam = findOrCreateTeam(match.getHomeName());
        homeTeam.addMatch(match);
        Team guestTeam = findOrCreateTeam(match.getGuestName());
        guestTeam.addMatch(match);
    }

    private static Team findOrCreateTeam(String teamName){
        for (Team team : teams) {
            if (teamName.equals(team.getName())){
                return team;
            }
        }
        Team newTeam = new Team(teamName);
        teams.add(newTeam);


        return newTeam;
    }

    public List<Team> getTable(){
        teams.sort(Collections.reverseOrder());
        return teams;
    }
}

