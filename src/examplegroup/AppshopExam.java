package examplegroup;

import java.text.DecimalFormat;

public class AppshopExam {
    public static void main(String[] args){
        int iPad = 999_000;
        double dcRate = 0.15;

        //System.out.println("Discount Cash = " + iPad);
        //DecimalFormat df = new DecimalFormat("#,##0.00");

        //System.out.println("Result with , = " + df.format(iPad));


        int resultCash = discountCash(iPad, dcRate);

        System.out.println(resultCash + "won");

    }



    public static int discountCash(int originPrice, double dcRate){
        return (int)(originPrice * (1-dcRate));
    }
}
