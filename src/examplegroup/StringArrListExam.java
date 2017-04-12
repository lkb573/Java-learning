package examplegroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrListExam {
    public static void main(String[] args){

        String[] strArr = {
                "스시메이진", "용호낙지", "스시", "한옥집", "제면소",
                "두끼", "KFC", "미스사이공", "아비꼬", "구로곱창",
                "돌배기집", "은행골", "숟가락반상 마실", "철판목장"
        };

        /*List<String> goumet = new ArrayList<>();
        goumet.add("스시메이진");
        goumet.add("용호낙지");*/

        List<String> goumet = Arrays.asList(
                "스시메이진", "용호낙지", "스시", "한옥집", "제면소",
                "두끼", "KFC", "미스사이공", "아비꼬", "구로곱창",
                "돌배기집", "은행골", "숟가락반상 마실", "철판목장"
        );

        List<String> goumetUnderThree = new ArrayList<>();

        for (String e : goumet){
            if (e.length() <= 3){
                goumetUnderThree.add(e);
            }
        }

        for (String e : goumetUnderThree){
            System.out.println(e);
        }

    }
}
