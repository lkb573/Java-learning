package examplegroup;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input and press Enter : ");
        String inputCut = input.nextLine();

        String change = inputCut.substring(0,1);

        String finalChange = inputCut.substring(1) + change + "ay";

        System.out.println("Result input : " + finalChange);

    }
}
