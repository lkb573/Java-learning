import java.util.Scanner;

public class PasswordStringExam {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Input password : ");

        String preFix = "$$", postFix = "##";

        String checkStr = input.nextLine();
        int numChar = checkStr.length();
        String upChar = checkStr.substring(0,1).toUpperCase()
                        + checkStr.substring(1) ;

        if(numChar >= 8){
            postFix = "";
        }


        numChar *= numChar;

        String resultStr = preFix + upChar + numChar + postFix;

        System.out.println(resultStr);

    }
}
