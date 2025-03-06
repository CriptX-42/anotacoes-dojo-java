package Utilitarios.Data;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // é uma classe abstrata por isso não precisamos do new
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
