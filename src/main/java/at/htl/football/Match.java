package at.htl.football;

public class Match {
    private String homeName;
    private String guestName;
    private int homeGoals;
    private int guestGoals;

    Match(String homeName, String guestName, int homeGoals, int guestGoals){
        homeName = this.homeName;
        guestName = this.guestName;
        homeGoals = this.homeGoals;
        guestGoals = this.guestGoals;
    }

    public String getHomeName() {
        return homeName;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public int getHomePoints(){
        return 0;
    }

    public int getGuestPoints(){
        return 0;
    }
}
