class KarakterGame {
    protected int kesehatan;

    public KarakterGame(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void serang(KarakterGame target) {
        // Metode ini akan dioverride oleh subclass
    }
}

class Pahlawan extends KarakterGame {
    private String nama;

    public Pahlawan(String nama, int kesehatan) {
        super(kesehatan);
        this.nama = nama;
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getClass().getSimpleName() + " menggunakan Orbital Strike!");
        target.kesehatan -= 20;
        System.out.println(target.getClass().getSimpleName() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

class Musuh extends KarakterGame {
    private String nama;

    public Musuh(String nama, int kesehatan) {
        super(kesehatan);
        this.nama = nama;
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getClass().getSimpleName() + " menggunakan Snake Bite!");
        target.kesehatan -= 15;
        System.out.println(target.getClass().getSimpleName() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}


