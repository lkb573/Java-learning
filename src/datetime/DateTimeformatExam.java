package datetime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeformatExam {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime ltn = LocalDateTime.now();

        System.out.println(today + "/" + now);

        String format =
                DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm:ss").format(ltn);

        System.out.println(format);
    }
}