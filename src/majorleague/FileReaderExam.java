package majorleague;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class FileReaderExam {
    public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("src\\Parks.csv");

        BufferedReader br = new BufferedReader(fr);


        /*while (true) {
            String line = br.readLine();

            String[] splitLine = line.split(",");
            for(String e : splitLine){
                System.out.println(e);
            }


            if(line == null)
                break;
            System.out.println(line);
        }*/

        String line = "";
        String[] splitLine;
        List<MajorPark> list = new ArrayList();
        int zeroCheck = 0;
        
        while ((line=br.readLine()) != null){
            //System.out.println(line);
            if(zeroCheck == 0)
                zeroCheck = 1;

            else {
                splitLine = line.split(",");

                MajorPark t1 = new MajorPark(splitLine[0], splitLine[1], splitLine[2],
                        splitLine[3], splitLine[4], splitLine[5]);

                list.add(t1);

            }
        }


        MajorService service = new MajorService();
        int usCount = service.sumOfNotUS(list);
        MajorService service1 = new MajorService();
        int aliasCount = service1.sumOfAlias(list);
        MajorService service2 = new MajorService();
        double avarResult = service2.avarOfNamechar(list);


        System.out.printf("All Count of US : %d\n",usCount);
        System.out.printf("All Count of use alias : %d\n",aliasCount);
        System.out.printf("Average of Name Char : %.2f\n",avarResult);

    }
}