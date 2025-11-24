
package Tugas4;

public class Karyawan {
    private String nip; //Nomor Induk Pegawai
    private String nama; 
    private String divisi; 

        public String getNIP() {
        return this.nip;
    }

    // Setter untuk NIP
    public void setNIP(String nip) {
        this.nip = nip;
    }

    // Getter untuk nama
    public String getNama() {
        return this.nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }    
        
        public String getDivisi() {
        return this.divisi;
    }

    // Setter untuk divisi
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
}
    


