

public class HelloWorld {

    public static void main(String[] args){
        int n = 5;

        System.out.println("Hello, World!!!");
        System.out.println("한글 검사");

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }

        int howManyDay = 90, hoursPerDay = 8;
        int totalHour = howManyDay * hoursPerDay;

        System.out.println("Total Hours = " + totalHour);



    }

}