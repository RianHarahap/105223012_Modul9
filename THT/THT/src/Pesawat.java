public class Pesawat extends Tranportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.50;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            harga += harga * 0.25;
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            harga += harga * 0.50;
        }
        return harga;
    }
}
