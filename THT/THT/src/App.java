public class App {
    public static void main(String[] args) {
        Tranportasi[] daftar = new Tranportasi[3];

        daftar[0] = new Bus("Bus", 40, "Bandung");
        daftar[1] = new Kereta("Kereta", 100, "Surabaya");
        daftar[2] = new Pesawat("Garuda", 150, "Bali");

        for (Tranportasi t : daftar) {
            System.out.println("Transportasi: " + t.getNama());
            System.out.println("Tujuan: " + t.getTujuan());
            System.out.println("Jumlah Kursi: " + t.getJumlahKursi());
            System.out.println("Harga Tiket (default): " + t.hitungHargaTiket());
            System.out.println("Harga Tiket (Bisnis): " + t.hitungHargaTiket("Bisnis"));
            System.out.println("Harga Tiket (VIP): " + t.hitungHargaTiket("VIP"));
            System.out.println("\n");
        }
    }
}
