package gourmet;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class GourmetReview {
    public static void main(String[] args){
        //data create
        Gourmet spoon = new Gourmet();
        spoon.setTitle("숟가락반상 마실");
        System.out.println("After Check create Line");
        spoon.setTitle("한정식, 떡갈비, 갈비찜");
        spoon.setScore(80);
        /*spoon.title = "숟가락반상 마실";
        spoon.mainMeun = "한정식, 떡갈비, 갈비찜";
        spoon.score = 111;*/

        Gourmet shsui = new Gourmet();
        shsui.setTitle("스시메이진");
        shsui.setMainMeun("일식, 초밥, 우동");
        shsui.setScore(50);
        /*shsui.title = "스시메이진";
        shsui.mainMeun = "일식, 초밥, 우동";
        shsui.score = 120;*/

        Gourmet noodle = new Gourmet();
        noodle.setTitle("마루가야 제면소");
        noodle.setMainMeun("면류, 우동, 튀김");
        noodle.setScore(43);
        /*noodle.title = "마루가야 제면소";
        noodle.mainMeun = "면류, 우동, 튀김";
        noodle.score = 80;*/

        Gourmet chiken = new Gourmet();
        chiken.setTitle("KFC");
        chiken.setMainMeun("치킨, 닭, 사이드메뉴");
        chiken.setScore(60);
        /*chiken.title = "KFC";
        chiken.mainMeun = "치킨, 닭, 사이드메뉴";
        chiken.score = 130;*/

        Gourmet meet = new Gourmet();
        meet.setTitle("새마을 식당");
        meet.setMainMeun("한식, 삼겹살, 연탄불고기");
        meet.setScore(56);
        /*meet.title = "새마을 식당";
        meet.mainMeun = "한식, 삼겹살, 연탄불고기";
        meet.score = 90;*/

        Gourmet yongho = new Gourmet("용호낙지", "낙새, 낙곱새", 45);

        //data input list
        List<Gourmet> list = Arrays.asList(
                spoon,shsui,noodle,chiken,meet);
                /*new ArrayList<>();
        list.add(spoon);
        list.add(shsui);
        list.add(noodle);
        list.add(chiken);
        list.add(meet);*/

        /*int sum=0;
        for (Gourmet e : list){
            sum += e.score;
        }*/


        GourmetService service = new GourmetService();
        double aver = service.calcAverScore(list);


        System.out.println("Score Average = " + aver);

        Gourmet g1 = new Gourmet("a", "b", 25);
        Gourmet g2 = new Gourmet("a", "b", 30);

        g1.getScore();
        g2.getScore();

    }
}