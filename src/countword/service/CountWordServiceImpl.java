package countword.service;

import java.util.List;


public class CountWordServiceImpl implements CountWordService{

    @Override
    public int wordCount(List<String> list){

        int sum=0;

        for (String e : list){
            if(!e.equals(""))
                sum++;
            System.out.println(e);

        }

        return sum;
    }



}