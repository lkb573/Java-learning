package majorsalaries;

import java.util.ArrayList;
import java.util.List;


public class SalariesService {

    public double averOfallSalary(List<Salaries> list){
        long sum=0;

        for (Salaries e : list){
            sum += e.getSalary();

        }

        double aver = (double) sum / list.size();
        return aver;
    }

    public Long topOfSalary(List<Salaries> list){
        long bestSalary=0;

        for (Salaries e : list){

            if(bestSalary < e.getSalary())
                bestSalary = e.getSalary();

        }

        return bestSalary;
    }

    public long lowOfSalary(List<Salaries> list){
        long lowSalary = (long)averOfallSalary(list);


        for (Salaries e : list){

            if(lowSalary > e.getSalary())
                lowSalary = e.getSalary();

        }

        return lowSalary;
    }

    public static Salaries topOfSalaryPlayer(List<Salaries> list){
        Salaries topList = new Salaries();

        for (Salaries e : list){
            if(e.getSalary() > topList.getSalary() ) {
                topList = e;
            }
        }

        return topList;
    }

    public static Salaries lowOfSalaryPlayer(List<Salaries> list){


        Salaries lowList = new Salaries();

        for (Salaries e : list){
            if(e.getSalary() < lowList.getSalary() ) {
                lowList = e;
            }
        }

        return lowList;
    }




    public double averOfYearSalary(List<Salaries> list){
        long sum=0;
        int year = 1985;

        for (Salaries e : list){
            if(e.getYear() == year)
                sum += e.getSalary();
            else {
                year++;

            }
        }


        double aver = 0;
        return aver;
    }

}
