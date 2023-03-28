package BangunDatar;

import java.util.Scanner;

public class Main {

        private static char pilihan;
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
        PersegiPanjang persegi;
        SegitigaSiku segitiga;
        Lingkaran lingkarans;
        int s1, s2, r;

        persegi = new PersegiPanjang();
        segitiga = new SegitigaSiku();
        lingkarans = new Lingkaran();

        mainMenu();

        switch (pilihan) {
            case '1' : {
                System.out.print("Masukkan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + persegi.luas(s1, s2));
                System.out.println("Keliling persegi panjang: " + persegi.keliling(s1, s2));
                break;
            }
            case '2' : {
                System.out.print("Masukkan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + segitiga.luas(s1, s2));
                System.out.println("Keliling segitiga: " + segitiga.keliling(s1, s2));
                break;
            }
            case '3' : {
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.print("Luas lingkaran: " + lingkarans.luas(r));
                System.out.println("Keliling lingkaran: " + lingkarans.keliling(r));
                break;
            }
            default: {
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu() {
        System.out.println("==============");
        System.out.println("Hitung Luas dan Keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.println("Masukkan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
