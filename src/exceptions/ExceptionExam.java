package exceptions;


import java.util.Scanner;

public class ExceptionExam {
    public static void main(String[] args){

        int flag =1;
        while (flag ==1) {

            System.out.print("Input number : ");
            Scanner in = new Scanner(System.in);
            String numInput = in.nextLine();

            try {
                int a = Integer.parseInt(numInput);
                System.out.printf("Input num is %d\n", a);
            } catch (NumberFormatException e) {
                flag = 0;
                System.out.println("Exception!");
            }
        }


    }
}
