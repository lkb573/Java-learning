package examplegroup;

public class ControlStringExam {
    public static void main(String[] args){
        String orgStr = "ControlString";

        String change = orgStr.substring(0,1);

        //orgStr.substring(0, orgStr.indexOf("l"));

        String finalChange = orgStr.substring(1) + change + "ay";

        System.out.println(finalChange);

    }
}
