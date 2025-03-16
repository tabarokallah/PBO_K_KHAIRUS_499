// Kelas Hewan
public class Hewan {
    // Deklarasi atribut
    String nama;
    String jenis;
    String suara;

    // Konstruktor untuk menginisialisasi atribut
    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Suara : " + suara);
        System.out.println(); // Baris kosong untuk pemisah
    }
}


