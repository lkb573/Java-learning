package halloffame.model;


public class HallOfFame {

    private String playerId;
    private int yearid;
    private String voteBy;
    private int ballot;
    private int needed;
    private int vote;
    private Boolean inducted;
    private String category;

    public HallOfFame() {
    }

    public HallOfFame(String playerId, int yearid, String voteBy, int ballot, int needed, int vote, Boolean inducted, String category) {
        this.playerId = playerId;
        this.yearid = yearid;
        this.voteBy = voteBy;
        this.ballot = ballot;
        this.needed = needed;
        this.vote = vote;
        this.inducted = inducted;
        this.category = category;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getYearid() {
        return yearid;
    }

    public void setYearid(int yearid) {
        this.yearid = yearid;
    }

    public String getVoteBy() {
        return voteBy;
    }

    public void setVoteBy(String voteBy) {
        this.voteBy = voteBy;
    }

    public int getBallot() {
        return ballot;
    }

    public void setBallot(int ballot) {

        this.ballot = ballot;
    }

    public int getNeeded() {
        return needed;
    }

    public void setNeeded(int needed) {
        this.needed = needed;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public Boolean getInducted() {
        return inducted;
    }

    public void setInducted(Boolean inducted) {
        this.inducted = inducted;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}