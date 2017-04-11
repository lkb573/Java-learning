package halloffame;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HallOfFameMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("src\\HallOfFame.csv"));

        String line = "";
        List<HallOfFame> hallList = new ArrayList<>();   //list for data

        br.readLine();          //skip first line = name

        while ((line=br.readLine()) != null){
            String[] splitString = line.split(",");


            HallOfFame fame = new HallOfFame();

            fame.setPlayerId(splitString[0]);
            if (!(splitString[3].equals("")))
                fame.setBallot(Integer.parseInt(splitString[3]));
            if (!(splitString[4].equals("")))
                fame.setNeeded(Integer.parseInt(splitString[4]));
            if (!(splitString[5].equals("")))
                fame.setVote(Integer.parseInt(splitString[5]));


            //pratice code
            /*if(splitString[3].equals("")){
                fame.setBallot(0);
            }
            else {
                fame.setBallot(Integer.parseInt(splitString[3]));
            }

            if(splitString[4].equals("")){
                fame.setNeeded(0);
            }
            else {
                fame.setNeeded(Integer.parseInt(splitString[4]));
            }

            if(splitString[5].equals("")){
                fame.setVote(0);
            }
            else {
                fame.setVote(Integer.parseInt(splitString[5]));
            }*/

            hallList.add(fame);
        }


        PlayerAverage pa = new PlayerAverage();

        List<PlayerAverage> newlist = new ArrayList<>();


        for (HallOfFame e : hallList){             //mapping work

            pa = new PlayerAverage();
            pa.setPlayerId(e.getPlayerId());
            pa.setAverage(( (e.getBallot()+e.getNeeded()+e.getVote() ) / 3));

            newlist.add(pa);
        }

        System.out.println(newlist);

    }
}