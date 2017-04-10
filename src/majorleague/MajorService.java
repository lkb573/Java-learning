package majorleague;


import java.util.List;

public class MajorService {

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


    public double avarOfNamechar(List<MajorPark> list){
        int sum = 0;

        for(MajorPark e : list){
            sum += e.getParkName().length();
        }

        double aver = (double) sum / list.size();
        return aver;
    }

}
