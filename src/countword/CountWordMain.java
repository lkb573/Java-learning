package countword;


import countword.service.CountWordServiceImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountWordMain {
    public static void main(String[] args) {

        FileReader fr = null;
        List<String> wordcount = new ArrayList<>();

        try {
            fr = new FileReader("src\\closer.txt");

            BufferedReader br = new BufferedReader(fr);

            String line = "";


            while ((line = br.readLine()) != null) {
                String[] splitLine = line.split(" ");

                for(String e : splitLine){

                        wordcount.add(e);

                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        CountWordServiceImpl service = new CountWordServiceImpl();
        int result = service.wordCount(wordcount);


        System.out.println(result);



    }
}