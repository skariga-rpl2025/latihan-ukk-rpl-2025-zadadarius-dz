
package Tugas2;

import java.util.Scanner;


public class VotingKetos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suaraA = 0;
        int suaraB = 0;
        String pilihan;

        System.out.println(" ===== Program Pemilihan Ketua OSIS =====");
        System.out.println("Ketik 'selesai' untuk mengakhiri input suara.");

        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B): ");
            pilihan = input.nextLine();

            switch (pilihan.toLowerCase()) { 
                case "a":
                    suaraA++;
                    break;
                case "b":
                    suaraB++;
                    break;
                case "selesai":
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan 'A' atau 'B', atau 'selesai' untuk keluar.");
            }
            
            if (pilihan.equalsIgnoreCase("selesai")) {
                break;
            }
        }

        System.out.println("\n--- Hasil Hitung Cepat ---");
        System.out.println("Total suara untuk Kandidat A: " + suaraA);
        System.out.println("Total suara untuk Kandidat B: " + suaraB);

        if (suaraA > suaraB) {
            System.out.println("Kandidat A adalah pemenangnya");
        } else if (suaraB > suaraA) {
            System.out.println("Kandidat B adalah pemenangnya");
        } else {
            System.out.println("Hasil seri");
        }

        input.close(); 
    }
}
    
