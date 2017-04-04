import java.util.Scanner;


public class CeltoFahExam {
    public static void main(String[] args){
        double Cel, Fah;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Cel :");
        Cel = scan.nextDouble();

        Fah = (Cel * 1.8) + 32;

        System.out.println("Cel to Fah : " + Fah);

    }
}
