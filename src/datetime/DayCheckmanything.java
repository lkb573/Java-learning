package datetime;


import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class DayCheckmanything {
    public static void main(String[] args) {

        Instant start = Instant.now();
        someAlgorithm();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        long millis = timeElapsed.toMillis();
        System.out.printf("%d milliseconds\n", millis);


        LocalDate tantan = LocalDate.of(2017,3,10);
        LocalDate today = LocalDate.of(2017,4,18);

        Period pe = Period.between(tantan, today);

        System.out.println(pe.getMonths() + "Month, " + pe.getDays() + "Day");


        LocalDate today1 = LocalDate.now();
        LocalDate nextMonday = today1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

        System.out.println("Next Monday : " + nextMonday);


        LocalDate dtday = today1.with(new DayafterTomorrow());
        System.out.println("Day of Tomorrow : " + dtday);


        LocalDate martday = today1.with(new DayofrestMart());
        System.out.println("Mart off Day = " + martday);

    }

    public static void someAlgorithm(){
        long sum = 0L;
        for (int i=0; i<100000000; i++){
            sum += i;

        }
    }
}