package gourmet;

import java.util.List;

public class GourmetService {
    public double calcAverScore(List<Gourmet> list){
        int sum=0;
        for (Gourmet e : list){
            sum += e.getScore();
        }
        double resultAver;
        return resultAver = (double) sum / list.size();
    }
}
