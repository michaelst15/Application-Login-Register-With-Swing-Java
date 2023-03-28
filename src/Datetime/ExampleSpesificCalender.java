package Datetime;

import java.util.Calendar;

public class ExampleSpesificCalender {
    public static void main(String[] args) {
        Calendar calendar =  Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu: " + calendar.getTime());

        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian " + calendar.getTime());

        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 tahun kemudian " + calendar.getTime());
    }
}
