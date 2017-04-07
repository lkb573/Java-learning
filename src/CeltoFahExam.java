import java.util.Scanner;


public class CeltoFahExam {
    public static void main(String[] args){
        double Cel, Fah;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Cel :");
        Cel = scan.nextDouble();

        /*Fah = (Cel * 1.8) + 32;*/

        CeltoFahService service = new CeltoFahService();

        Fah = service.celToFah(Cel);

        /*Fah = celToFah(Cel);*/
        System.out.println("Cel to Fah : " + Fah);

    }
}



/*
    public static double celToFah(double celData){
        return (celData * 1.8) + 32;
    }*/
