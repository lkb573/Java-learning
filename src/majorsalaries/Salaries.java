package majorsalaries;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Salaries {
    private int year;
    private String team;
    private String league;
    private String playerID;
    private long salary;

    public Salaries(){

    }

    public Salaries(
            int year, String team, String league,
            String playerID, long salary) {

        this.year = year;
        this.team = team;
        this.league = league;
        this.playerID = playerID;
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }


}
