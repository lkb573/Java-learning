import java.io.StringReader;

public class ArrayExam {
    public static void main(String[] args){

        /*int[] iArr = new int[10];

        iArr[0] = 2;
        iArr[1] = 4;
        iArr[2] = 6;
        iArr[3] = 8;
        iArr[4] = 10;
        iArr[5] = 12;
        iArr[6] = 14;
        iArr[7] = 16;
        iArr[8] = 18;
        iArr[9] = 20;

        for (int i=0; i<iArr.length; i++)
            System.out.println(iArr[i]);
        */


       int[] iArr = {1,2,3,4,5,6,7,8,9,10,
                        11,12,13,14,15,16,17,18,19,20,
                        21,22,23,24,25,26,27,28,29,30};

       for (int e : iArr) {
           String check = String.valueOf(e);

           if(check.contains("3") || check.contains("6")
                   || check.contains("9"))
               System.out.println("Clap!!");
           else
               System.out.println(e);
       }

       int sumNum=0, count=1;
       double averNum;
       for (int i : iArr){
           sumNum = sumNum + i;
           count++;
       }

       averNum = sumNum / count;

       System.out.printf("Average : %.2f", averNum);

    }
}
