
package Tugas3;

import java.io.InputStreamReader;
import java.util.Scanner;

public class AnggotaGym {
     public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.println("==== Pendaftaran Anggota Gym ====");
        String namaAnggota;
        String daftarLagi;
        int totalAnggota = 0;
            
        do{
            System.out.print("Masukkan nama anggota: ");
            namaAnggota = input.nextLine();
            totalAnggota++;
            System.out.print("Daftar anggota lagi? (ya/tidak): ");
            daftarLagi = input.nextLine();

        }while (daftarLagi.equalsIgnoreCase("ya")); 
//equalsIgnoreCase() digunakan untuk membandingkan dua buah string tanpa memperdulikan perbedaan huruf besar atau kecil 

        System.out.println("------------------------------------------------");
        System.out.println("Total anggota yang didaftarkan: " + totalAnggota);

        input.close(); 
    }
    
}
    

