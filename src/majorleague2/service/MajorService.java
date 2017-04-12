package majorleague2.service;


import majorleague2.model.MajorPark;

import java.util.ArrayList;
import java.util.List;

public class MajorService implements IParkService{

    public int sumOfNotUS(List<MajorPark> list){
        int count=0;
        String checkUs = "US";

        for (MajorPark e : list){
            if( !(e.getCountry().equals(checkUs)) ) {
                count++;
            }
        }

        return count;
    }

    public int sumOfAlias(List<MajorPark> list){
        int count = 0;

        for(MajorPark e : list){
            if( !(e.getParkAlias().equals("")) )
                count++;

        }

        return count;
    }

    public List<MajorPark> haveAliaspark(List<MajorPark> list){

        List<MajorPark> aliasList = new ArrayList<>();

        for (MajorPark e : list){
            if( !(e.getParkAlias().equals("")) );
                aliasList.add(e);
        }
        return aliasList;
    }


    public double avarOfNamechar(List<MajorPark> list){
        int sum = 0;

        for(MajorPark e : list){
            sum += e.getParkName().length();
        }

        double aver = (double) sum / list.size();
        return aver;
    }

}
