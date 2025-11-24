
package Tugas1;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double angka1, angka2, hasil;
        
        System.out.println("==== KALKULATOR SEDERHANA ====");
        System.out.println("Pilih Operasi:");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.print("Masukkan Pilihan 1-4:");
        pilihan = input.nextInt();
        
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();
        
        switch(pilihan){
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case 4:
                if (angka2 != 0){
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Tidak bisa dibagi dengan nol!");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
        }

        System.out.println("====================================");
            
        
    }
}


