// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1 (khairus shalih)
        RekeningBank rekening1 = new RekeningBank("202410370110499", "khairus shalih", 500000.0);

        // Membuat objek rekening2 (sandy)
        RekeningBank rekening2 = new RekeningBank("202410370110499", "sandy", 1000000.0);

        // Menampilkan informasi rekening sebelum transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Transaksi setor uang
        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        // Transaksi tarik uang
        rekening1.tarikUang(800000);
        rekening2.tarikUang(300000);

        // Menampilkan informasi rekening setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
