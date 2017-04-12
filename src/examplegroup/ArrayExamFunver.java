package examplegroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExamFunver {
    public static void main(String[] args){

        String review =
                "오늘의 2번째 포스팅역시 맛집! 주말에 남자친구랑 너무 맛있게 " +
                        "먹고온 구로 초밥뷔페를 추천해드리려고하는데요!! " +
                        "구로 초밥뷔페집의 이름은 스시메이진 이라는 곳이에요^^♥";

        //review --> List           blank cut, 1 word
        List<String> retoList= Arrays.asList(review.split(" "));

        List<String> changeList = new ArrayList<>();

        for (String e : retoList) {
            changeList.add(e);
        }

        System.out.println("change String to List");
        System.out.println(changeList);

        double aver = averCalc(changeList);
        System.out.printf("%.2f aver of char\n", aver);

        List<String> wordnunderFive = charlessThenfive(changeList);

        System.out.println("char count <= 5 / words");
        System.out.println(wordnunderFive);

    }


    public static double averCalc(List<String> wordList){

        int sumLength=0, checkNum=0;

        for (String e : wordList) {
            sumLength +=e.length();
            checkNum++;
        }
        double result = sumLength / (double)checkNum;

        return result;

    }


    public static List<String> charlessThenfive(List<String> inputList){

        List<String> resultList = new ArrayList<>();

        for (String e : inputList){
            if (e.length() <= 5){
                resultList.add(e);
            }
        }
        return resultList;

    }
}