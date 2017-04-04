import java.util.Scanner;


public class CeltoFeExam {
    public static void main(String[] args){
        double Cel, Fe;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Cel :");
        Cel = scan.nextDouble();

        Fe = (Cel * 1.8) + 32;

        System.out.println("Cel to Fe : " + Fe);

    }
}
