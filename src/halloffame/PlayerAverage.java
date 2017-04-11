package halloffame;


public class PlayerAverage {

    private String playerId;
    private int average;

    @Override
    public String toString() {
        return "PlayerAverage{" +
                "playerId='" + playerId + '\'' +
                ", average=" + average +
                '}' + "\n";
    }

    public PlayerAverage(String playerId, int average) {
        this.playerId = playerId;
        this.average = average;
    }

    public PlayerAverage() {

    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}
