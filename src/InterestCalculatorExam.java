import java.util.Scanner;

public class InterestCalculatorExam {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Input Original Money : ");
        int inMoney = input.nextInt();

        System.out.print("Input how long Month : ");
        int inMonth = input.nextInt();

        System.out.print("Input how much InterestRate : ");
        double inTerestRate = input.nextDouble() * 0.01;


        if (inMonth >= 36) {
            inTerestRate *= 0.7;
        }


        //Interest = inMoney * inTerest * (Time/12)
        double inTerest = inMoney * inTerestRate * (inMonth/12);

        double resultMoney = inMoney + inTerest;


        System.out.printf("%d Month later, Result Money : %,.2f won", inMonth, resultMoney);
    }
}



        /*for(int i=0; i<=inMonth; i++){
            resultMoney += inMoney * inTerest * (inMonth/12);
        }
        */

//resultMoney += inMoney * inTerest * (inMonth/12);