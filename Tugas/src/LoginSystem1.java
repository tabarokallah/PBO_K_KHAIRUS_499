import java.util.Scanner;

public class LoginSystem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            if (pilihan == 1) {
                // Login Admin
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                String nimAkhir = "449"; // Ganti dengan 3 digit terakhir NIM Anda
                String validUsername = "khairus" + 499;
                String validPassword = "khairus" + 499;

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
            }
        } while (pilihan != 2);

        // Login Mahasiswa
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        String validNama = "khairus"; // Ganti dengan nama Anda
        String validNim = "202410370110499";  // Ganti dengan NIM Anda

        if (nama.equals(validNama) && nim.equals(validNim)) {
            System.out.println("Login Mahasiswa berhasil!");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }

        scanner.close();
    }
}
