import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam {
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

        //count all char & average
        //int sumforchar=0, count=0;

        /*for (String e : changeList){
            sumforchar += e.length();
            count++;
        }*/
        //change to function method
        double aver = actionList(changeList/*, sumforchar, count*/);


       //double aver = sumforchar / (double)count;
        System.out.printf(/*"%d all word number, " +
                "%d all word char number, " +*/
                "%.2f aver of char\n",
                /*count, sumforchar,*/ aver);

        //new List word number 5 more
        /*List<String> wordnunderFive = new ArrayList<>();

        for (String e : changeList){
            if (e.length() <= 5){
                wordnunderFive.add(e);
            }
        }*/

        //change Function method
        List<String> wordnunderFive = printFiveword(changeList);

        System.out.println("char count <= 5 / words");
        System.out.println(wordnunderFive);

    }


    public static double actionList(
            List<String> inputList/*, int sumLength, int checkNum*/){
        int sumLength=0, checkNum=0;

        for (String e : inputList) {
            sumLength +=e.length();
            checkNum++;
        }
        double result = sumLength / (double)checkNum;

        return result;
    }


    public static List<String> printFiveword(List<String> checkList){

        List<String> resultList = new ArrayList<>();

        for (String e : checkList){
            if (e.length() <= 5){
                resultList.add(e);
            }
        }
        return resultList;
    }
}