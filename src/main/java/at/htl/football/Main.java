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

            for (int i = 0; i < file.size(); i++) {
                String homeTeam;
                String guestTeam;
                int homeGoals;
                int guestGoals;

                String[] item = file.get(i).split(";");

                homeTeam = item[1];
                guestTeam = item[2];
                //homeGoals = Integer.parseInt(item[3]);
                homeGoals = 3;
                //guestGoals = Integer.parseInt(item[4]);
                guestGoals =3;

                League.addMatchResult(new Match(homeTeam, guestTeam, homeGoals, guestGoals));
            }
            } catch (IOException e1) {
                e1.printStackTrace();
        }






    }

    private void printTable(List<Team> teams){
        System.out.printf("%-20s %4s %4s %4s %4s %4s %4s %4s %n", "Team", "PTS", "W", "D", "L", "GF", "GA", "GD");

        for (int i = 0; i < teams.size(); i++) {
            System.out.printf("%-20s %4s %4s %4s %4s %4s %4s %4s %n",teams.get(i).getName(), teams.get(i).getPoints(), teams.get(i).getWins(), teams.get(i).getDraws(), teams.get(i).getLost(), teams.get(i).getGoalDifference(), teams.get(i).getGoalsRecived(), teams.get(i).getGoalDifference());
        }

        System.out.println("PTS...Points, W...Wins, D...Draws, L...Lost, GF...Goals for, GA...Goals against, GD...Goals difference");
    }
}
