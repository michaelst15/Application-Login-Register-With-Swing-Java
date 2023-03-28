package Datetime;

import java.util.Calendar;

public class ExampleSplitCalender {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        System.out.println("Tanggal " + calendar.get(Calendar.DATE));
        System.out.println("Bulan " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun " + calendar.get(Calendar.YEAR));
    }
}
