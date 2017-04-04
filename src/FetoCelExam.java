import java.util.Scanner;


public class FetoCelExam {
    public static void main(String[] args) {
        double Cel, Fe;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Fe :");
        Fe = scan.nextDouble();

        Cel = (Fe -32) / 1.8;

        System.out.println("Fe to Cel : " + Cel);

    }
}
