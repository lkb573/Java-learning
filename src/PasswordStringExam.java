import java.util.Scanner;

public class PasswordStringExam {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Input password : ");

        String checkStr = input.nextLine();
        int numChar = checkStr.length();
        String upChar = checkStr.substring(0,1).toUpperCase();

        numChar *= numChar;

        String resultStr = "$$" + upChar + checkStr.substring(1) + numChar + "##";

        System.out.println(resultStr);

    }
}
