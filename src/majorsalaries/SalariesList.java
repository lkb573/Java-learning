package majorsalaries;

import javax.swing.plaf.SliderUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalariesList {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("src\\Salaries.csv"));

        String line = "";
        String[] splitString;
        List<Salaries> salarieslist = new ArrayList<>();   //list for data

        br.readLine();          //skip first line = name

        while ((line=br.readLine()) != null){
            splitString = line.split(",");

            salarieslist.add(new Salaries(
                    Integer.valueOf(splitString[0]), splitString[1], splitString[2],
                    splitString[3], Long.valueOf(splitString[4])));

        }


        SalariesService service = new SalariesService();
        double avarResult = service.averOfallSalary(salarieslist);
        SalariesService service1 = new SalariesService();
        long topSalary = service1.topOfSalary(salarieslist);
        SalariesService service2 = new SalariesService();
        long lowSalary = service2.lowOfSalary(salarieslist);

        SalariesService service3 = new SalariesService();
        Salaries topOfPlayer = SalariesService.topOfSalaryPlayer(salarieslist);

        SalariesService service4 = new SalariesService();
        Salaries lowOfPlayer = service4.lowOfSalaryPlayer(salarieslist);


        System.out.printf("Average of all salary : %.2f\n", avarResult);
        System.out.printf("Top of salary : %d\n", topSalary);
        System.out.println(topOfPlayer);
        System.out.printf("Low of salary : %d\n", lowSalary);
        System.out.printf("Low Of salary Name : %s, Salary : %d\n",
                lowOfPlayer.getPlayerID(), lowOfPlayer.getSalary());
        System.out.println(lowOfPlayer.toString());
    }
}
