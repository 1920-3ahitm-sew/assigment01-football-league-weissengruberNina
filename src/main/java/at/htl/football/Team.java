package at.htl.football;

public class Team implements Comparable{
    private String name;
    private int points;
    private int wins;
    private int draws;
    private int lost;
    private int defeats;
    private int goalsShot;
    private int goalsRecived;

    Team(String name) {
        name = this.name;
    }

    public Team() {

    }

    public void addMatch(Match match) {
        if (this.getName().equals(match.getHomeName())) {
            if (match.getHomeGoals() > match.getGuestGoals()) {
                points += 3;
                wins += 1;
            } else if (match.getHomeGoals() == match.getGuestGoals()) {
                points += 1;
                draws += 1;
            } else {
                lost += 1;
                defeats += 1;
            }
            goalsShot += match.getHomeGoals();
            goalsRecived+= match.getGuestGoals();
        } else if (this.getName().equals(match.getGuestName())) {
            if (match.getGuestGoals() > match.getHomeGoals()) {
                points += 3;
                wins += 1;
            } else if (match.getGuestGoals() == match.getHomeGoals()) {
                points += 1;
                draws += 1;
            } else {
                lost += 1;
                defeats += 1;
            }
            goalsShot += match.getGuestGoals();
            goalsRecived += match.getHomeGoals();
        }
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

    public int getLost() {
        return lost;
    }

    public int getGoalsRecived() {
        return goalsRecived;
    }

    public int getGoalDifference(){
        int goalDifference;
        goalDifference = this.goalsShot - this.goalsRecived;

        return goalDifference;
    }

    public int compareTo(Object o){
        Team otherTeam = (Team) o;
        return otherTeam.points - this.points;
    }

}
