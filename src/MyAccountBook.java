import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-03.
 */
public class MyAccountBook {
    public static void main(String[] args){
        int busCash = 1600;
        int lunchCash = 7500;
        int coffeeCash = 2900;

        int totalCash = busCash + lunchCash + coffeeCash;

        System.out.println("Today total Cash = " + totalCash);

        System.out.println("Add Line");

        int piboNum;
        Scanner scan = new Scanner(System.in);

        System.out.print("피보나치 수 :");
        piboNum = scan.nextInt();

        int beforeNum=0, nextNum=1, temp=0;

        for(int i=1; i<piboNum; i++){
            temp = beforeNum + nextNum;
            beforeNum = nextNum;
            nextNum = temp;
        }

        System.out.print("result : " + temp);
    }
}
