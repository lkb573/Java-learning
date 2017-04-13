package majorleague;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileReaderExam {               //exam Exception code
    public static void main(String[] args) /*throws Exception*/{

        List<MajorPark> parkList = null;
        try {
            FileReader fr = new FileReader("src\\Parks.csv");

            BufferedReader br = new BufferedReader(fr);

            String line = "";
            String[] splitLine;
            parkList = new ArrayList<>();   //list for data

            br.readLine();          //skip first line = name

            while ((line = br.readLine()) != null) {
                splitLine = line.split(",");
                //up code => use Array --- down code => use List
                //List<String> splitanother = Arrays.asList(line.split(","));

                //simple, effective code
                parkList.add(new MajorPark(splitLine[0], splitLine[1], splitLine[2],
                        splitLine[3], splitLine[4], splitLine[5]));

            }

        }catch (FileNotFoundException fne){
            System.out.println("Not found File!");

        }catch (IOException ie){
            System.out.println("Read file, but IO error!");

        }


        MajorService service = new MajorService();
        int usCount = service.sumOfNotUS(parkList);
        MajorService service1 = new MajorService();
        int aliasCount = service1.sumOfAlias(parkList);
        MajorService service2 = new MajorService();
        double avarResult = service2.avarOfNamechar(parkList);
        MajorService service3 = new MajorService();
        List<MajorPark> haveAlias = service3.haveAliaspark(parkList);



        System.out.printf("All Count of US : %d\n",usCount);
        System.out.printf("All Count of use alias : %d\n",aliasCount);
        System.out.printf("Average of Name Char : %.2f\n",avarResult);
        System.out.printf("%s\n", haveAlias);

    }
}