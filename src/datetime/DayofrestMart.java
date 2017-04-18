package datetime;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.DayOfWeek.SUNDAY;
import static java.time.temporal.TemporalAdjusters.dayOfWeekInMonth;


public class DayofrestMart implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate today = LocalDate.from(temporal);
        /*long checkweek = today;*/

        LocalDate secSunday = today.with(dayOfWeekInMonth(2,SUNDAY));
        LocalDate fouSunday = today.with(dayOfWeekInMonth(4,SUNDAY));

        /*if (){
            return secSunday;
        }else if (){
            return fouSunday;
        }else {
            return null;
        }*/


        if (today.isBefore(secSunday)){
            return secSunday;
        }
        else {
            return fouSunday;
        }


    }
}
