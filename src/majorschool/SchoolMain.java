package majorschool;


import majorleague2.model.MajorPark;
import majorschool.model.NameId;
import majorschool.model.School;
import majorschool.service.SchoolService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchoolMain {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("src\\Schools.csv");

        BufferedReader br = new BufferedReader(fr);

        String line = "";
        String[] splitLine;
        List<School> schoolList = new ArrayList<>();

        br.readLine();          //skip first line = name

        while ((line=br.readLine()) != null){
            splitLine = line.split(",");

            schoolList.add(new School(splitLine[0], splitLine[1], splitLine[2],
                    splitLine[3], splitLine[4]));

        }

        SchoolService service = new SchoolService();
        List<School> resetId = service.schoolNameReset(schoolList);

        SchoolService service1 = new SchoolService();
        List<NameId> result = service1.nameIdReset(schoolList);

        //System.out.printf("%s\n", resetId);
        System.out.printf("%s\n", result);


    }
}
