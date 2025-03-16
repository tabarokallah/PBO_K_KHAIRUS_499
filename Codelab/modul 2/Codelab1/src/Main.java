// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan pertama (Kucing)
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");

        // Membuat objek hewan kedua (Anjing)
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Memanggil metode tampilkanInfo() untuk kedua objek
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
