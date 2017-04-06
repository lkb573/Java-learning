import java.text.DecimalFormat;

public class AppshopExam {
    public static void main(String[] args){
        int iPad = 999_000;
        double dcRate = 0.85;

        //System.out.println("Discount Cash = " + iPad);
        //DecimalFormat df = new DecimalFormat("#,##0.00");

        //System.out.println("Result with , = " + df.format(iPad));


        double resultCash = discountCash(iPad, dcRate);

        System.out.println(resultCash + "won");

    }



    public static double discountCash(int originPrice, double dcRate){
        double resultCash = originPrice * dcRate;

        return resultCash;
    }
}
