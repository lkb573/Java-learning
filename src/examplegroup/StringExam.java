package examplegroup;

import javax.print.DocFlavor;

public class StringExam {
    public static void main(String[] args){
        String myStr = "Hello, world!!!";
        String myStr2 = "안녕~!!!";

        String result = myStr + myStr2;

        String result2 = myStr + 3;

        String change = myStr.substring(1,4);

        boolean check = myStr.contains("lol");
        boolean check2 = myStr.startsWith("h");

        System.out.println(result);
        System.out.println(result2);
        System.out.println(change);
        System.out.println(check);
        System.out.println(check2);

    }
}