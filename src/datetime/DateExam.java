package datetime;



import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class DateExam {
    public static void main(String[] args){

        LocalDate startDay = LocalDate.now().minus(15,ChronoUnit.DAYS);
        LocalDate fifty = startDay.plusDays(49);
        LocalDate onehundred = startDay.plusDays(99);

        System.out.println("Start Day : " + startDay);
        System.out.println("50 Day : " + fifty);
        System.out.println("100 Day : " + startDay.plus(99,ChronoUnit.DAYS));
        System.out.println("200 Day : " + startDay.plus(199,ChronoUnit.DAYS));
        System.out.println("500 Day : " + startDay.plus(499,ChronoUnit.DAYS));
        System.out.println("1000 Day : " + startDay.plus(999,ChronoUnit.DAYS));

        LocalDate bb = startDay.plusDays(49).minusYears(3).plusMonths(3);

        System.out.println(bb);

        if (fifty.compareTo(onehundred) > 0){
            System.out.println("fifty big");
        } else {
            System.out.println("onehundred big");
        }


        if (fifty.isAfter(onehundred)){
            System.out.println("fifty big");
        } else {
            System.out.println("onehundred big");
        }



    }
}