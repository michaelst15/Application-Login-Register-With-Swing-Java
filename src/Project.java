import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Penjumlahan Sederhana");
        System.out.println("Masukkan Angka Pertama : ");
        int value = scanner.nextInt();
        System.out.println("Masukkan Angka kedua : ");
        int otherValue = scanner.nextInt();
        int result = value + otherValue;
        System.out.println("hasilnya : " + result);
    }
}
