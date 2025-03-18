public class Main {
    public static void main(String[] args) {
        KarakterGame umum = new KarakterGame(100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        System.out.println("Status awal:");
        System.out.println("Brimstone memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println("Viper memiliki kesehatan: " + viper.getKesehatan());

        brimstone.serang(viper);
        viper.serang(brimstone);
    }
}