import java.util.Scanner;

public class PasswordStringExam {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Input password : ");

        String checkStr = input.nextLine();
        int numChar = checkStr.length();
        String upChar = checkStr.toUpperCase();

        numChar *= numChar;

        String resultStr = "$$" + upChar.substring(0,1) + checkStr.substring(1) + numChar + "##";

        System.out.println(resultStr);

    }
}
