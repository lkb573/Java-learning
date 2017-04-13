package majorleaguemap;


import majorleaguemap.park.Major;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class MajorLeagueMap {
    public static void main(String[] args) {

        Map<String, Major> map = new HashMap<>();

        try {
            FileReader fr = new FileReader("src\\Parks.csv");

            BufferedReader br = new BufferedReader(fr);

            String line = "";
            String[] splitLine;

            br.readLine();          //skip first line = name

            while ((line = br.readLine()) != null) {
                splitLine = line.split(",");

                map.put(splitLine[0],
                        new Major(splitLine[1], splitLine[2], splitLine[3],
                        splitLine[4], splitLine[5]));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(map);

        for (Map.Entry<String, Major> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}