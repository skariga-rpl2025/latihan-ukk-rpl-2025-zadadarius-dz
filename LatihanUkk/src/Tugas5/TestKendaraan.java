
package Tugas5;

public class TestKendaraan {
     public static void main(String[] args) {

        Kendaraan mobilSaya = new Kendaraan();

        // Gunakan method setter untuk mengisi data (misal: noPolisi "N 1234 AA", merk "Toyota Avanza", tahun 2022).
        mobilSaya.setNoPolisi("N 1234 AA");
        mobilSaya.setMerk("Toyota Avanza");
        mobilSaya.setTahun(2022);

        // Gunakan method getter untuk mengambil dan menampilkan semua data kendaraan tersebut ke konsol.
        System.out.println("--- Data Kendaraan ---");
        System.out.println("No. Polisi : " + mobilSaya.getNoPolisi());
        System.out.println("Merk         : " + mobilSaya.getMerk());
        System.out.println("Tahun        : " + mobilSaya.getTahun());
    }
}


