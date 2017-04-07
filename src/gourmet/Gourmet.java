package gourmet;

public class Gourmet {

    private String title;
    private String mainMeun;
    private int score;

    //getter, accessor
    //setter, mutator

    public Gourmet(){
        System.out.println("Check create");
    }

    public Gourmet(String title, String mainMeun, int score) {
        this.title = title;
        this.mainMeun = mainMeun;
        this.score = score;

        System.out.println("Check create at once");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainMeun() {
        return mainMeun;
    }

    public void setMainMeun(String mainMeun) {
        this.mainMeun = mainMeun;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}