package school.mjc.stage0.conditions.task3;

import java.time.LocalDate;
import java.time.Month;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month>0 && month<=12){
            Month month1 = Month.of(month);
            System.out.println(month1.length(false));
        }else {
            System.out.println("wrong number!");
        };

    }
}
