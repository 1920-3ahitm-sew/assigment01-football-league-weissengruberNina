package at.htl.football;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String FILENAME = "bundesliga-1819.csv";
    public static void main(String[] args) {

        League league = new League();
        List <String> file = new ArrayList<>();
        List<Match> match = new ArrayList<>();
        String[] element;

        try{
            file = Files.readAllLines(Paths.get(FILENAME));
            } catch (IOException e1) {
                e1.printStackTrace();
        }

        for (int i = 0; i < file.size(); i++) {
            element = file.get(i + 1).split(";");
            match.add(new Match(element[1], element[2], Integer.parseInt(element[3]), Integer.parseInt(element[4])));
            league.addMatchResult(match.get(i));
        }


    }

    private void printTable(List<Team> teams){
        System.out.println("Team                    PTS   W   D   L   GF   GA   GD");

        for (int i = 0; i < teams.size(); i++) {
            System.out.printf(teams.get(i).getName()+ teams.get(i).getPoints()+ teams.get(i).getWins()+ teams.get(i).getDraws()+ teams.get(i).getLost()+ teams.get(i).getGoalDifference()+ teams.get(i).getGoalsRecived()+ teams.get(i).getGoalDifference());
        }

        System.out.println("PTS...Points, W...Wins, D...Draws, L...Lost, GF...Goals for, GA...Goals against, GD...Goaö difference");
    }
}
