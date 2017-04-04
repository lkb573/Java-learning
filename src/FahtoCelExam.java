import java.util.Scanner;


public class FahtoCelExam {
    public static void main(String[] args) {
        double Cel, Fah;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Fe :");
        Fah = scan.nextDouble();

        Cel = (Fah -32) / 1.8;

        System.out.println("Fe to Cel : " + Cel);

    }
}
