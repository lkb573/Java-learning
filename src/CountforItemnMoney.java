import java.util.Scanner;

public class CountforItemnMoney {
    public static void main(String[] args){

        System.out.print("Check Item --> 1.This 2.MAl  ");
        Scanner check = new Scanner(System.in);
        int selItem = check.nextInt();

        System.out.print("Check Age --> ");
        int inAge = check.nextInt();

        System.out.print("Check Count --> ");
        int inCount = check.nextInt();

        /*//  ver.1
        double itemThis = 4500, itemMal = 5200, totalCount;

        //check age
        if (inAge < 19){
            itemThis *= 0.8;
            itemMal *= 0.8;
        }
        else if (inAge >= 45) {
            itemThis *= 1.3;
            itemMal *= 1.3;
        } else {}

        //total cash
        if (selItem == 1) {
            totalCount = itemThis * inCount;
        }
        else {
            totalCount = itemMal * inCount;
        }
        */

        //  ver.2
        double itemPrice=0;

        if (selItem == 1){
            itemPrice = 4500;
        }
        else if (selItem == 2){
            itemPrice = 5200;
        } else {}

        double totalCount = itemPrice * inCount;

        if (inAge < 19) {
            totalCount *= 0.8;
        }
        else if (inAge >= 45){
            totalCount *= 1.3;
        } else {}


        System.out.printf("%d age / total cash = %,.1f won", inAge, totalCount);
    }
}
