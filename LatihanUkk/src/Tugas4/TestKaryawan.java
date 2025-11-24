
package Tugas4;

public class TestKaryawan {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();

        karyawan1.setNIP("K001");
        karyawan1.setNama("Budi Hartono");
        karyawan1.setDivisi("Marketing");

        System.out.println("Data Karyawan:");
        System.out.println("NIP    : " + karyawan1.getNIP());
        System.out.println("Nama   : " + karyawan1.getNama());
        System.out.println("Divisi : " + karyawan1.getDivisi());
    }
    
}

    
