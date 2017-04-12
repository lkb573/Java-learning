package examplegroup;

import java.util.Scanner;


public class PiboNachi {
    public static void main(String[] args) {
        int piboNum;
        Scanner scan = new Scanner(System.in);

        System.out.print("피보나치 수 :");
        piboNum = scan.nextInt();

        int beforeNum = 0, nextNum = 1, temp = 0;

        for (int i = 1; i < piboNum; i++) {
            temp = beforeNum + nextNum;
            beforeNum = nextNum;
            nextNum = temp;
        }

        System.out.print("result : " + temp);
    }
}
