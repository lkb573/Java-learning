import java.text.DecimalFormat;

public class AppshopExam {
    public static void main(String[] args){
        double iPad = 999_000;

        iPad = iPad / 0.15;

        System.out.println("Discount Cash = " + iPad);

        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Result with , = " + df.format(iPad));


    }
}
