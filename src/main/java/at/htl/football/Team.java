package at.htl.football;

public class Team {
    private String name;
    private int points;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsShot;
    private int goalsRecived;

    Team(String name) {
        name = this.name;
    }

    public void addMatch(Match match){

    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public int getGoalsRecived() {
        return goalsRecived;
    }

    public int getGoalDifference(){
        int goalDifference;

        return 0;
    }

    public int compareTo(Team team){
        return 0;
    }

}
