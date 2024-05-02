package Polymorfisme;

public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20]; // Array untuk menyimpan objek Kue(20)

        // Input array dengan kue jadi dan pesanan
        kueArray[0] = new KueJadi("Klepon", 9000, 1);
        kueArray[1] = new KuePesanan("Onde-onde", 8000, 3);
        kueArray[2] = new KuePesanan("Dadar Gulung", 15000, 5);
        kueArray[3] = new KueJadi("Lemper", 5000, 20);
        kueArray[4] = new KueJadi("Serabi", 10000, 10);
        kueArray[5] = new KuePesanan("Bolu", 5000, 5);
        kueArray[6] = new KuePesanan("Brownies", 12000, 3);
        kueArray[7] = new KuePesanan("Lapis Legit", 20000, 4);
        kueArray[8] = new KueJadi("Kue Lapis Surabaya", 25000, 8);
        kueArray[9] = new KueJadi("Kue Sus", 7000, 10);
        kueArray[10] = new KuePesanan("Kue Cubit", 3000, 6);
        kueArray[11] = new KueJadi("Kue Pukis", 7000, 5);
        kueArray[12] = new KuePesanan("Bolu Kukus", 6000, 5);
        kueArray[13] = new KueJadi("Bolu Pisang", 12000, 2);
        kueArray[14] = new KueJadi("Kue Apem", 5000, 5);
        kueArray[15] = new KuePesanan("Wingko Babat", 10000, 1);
        kueArray[16] = new KuePesanan("Kastengel", 15000, 3);
        kueArray[17] = new KuePesanan("Nastar", 12000, 2);
        kueArray[18] = new KueJadi("Bakpia", 30000, 7);
        kueArray[19] = new KueJadi("Bolu Gulung", 20000, 1);

        for (Kue kue : kueArray) { // Looping untuk mencetak informasi kue
            System.out.println(kue);
            System.out.println();
        }

        // Variabel untuk menyimpan total harga dan total berat kue pesanan
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;

        // Variabel untuk menyimpan total harga dan total jumlah kue jadi
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;

        // Looping untuk menghitung total harga dan total berat/jumlah
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) { // Cek apakah objek merupakan KuePesanan
                totalHargaPesanan += kue.harga;
                totalBeratPesanan += ((KuePesanan) kue).berat;
            } else if (kue instanceof KueJadi) { // Cek apakah objek merupakan KueJadi
                totalHargaJadi += kue.harga;
                totalJumlahJadi += ((KueJadi) kue).jumlah;
            }
        }

        // Menampilkan total harga dan total berat/jumlah
        System.out.println("Total harga KuePesanan: Rp " + totalHargaPesanan);
        System.out.println("Total berat KuePesanan: " + totalBeratPesanan);

        System.out.println("Total harga KueJadi: Rp " + totalHargaJadi);
        System.out.println("Total jumlah KueJadi: " + totalJumlahJadi);

        // Mencari kue dengan harga terbesar
        double hargaTerbesar = 0;
        Kue kueTerbesar = null;

        for (Kue kue : kueArray) { // Looping untuk memperbarui harga terbesar
            if (kue.harga > hargaTerbesar) {
                hargaTerbesar = kue.harga;
                kueTerbesar = kue;
            }
        }

        // Menampilkan informasi kue dengan harga terbesar
        System.out.println("\nInformasi kue dengan harga terbesar:");
        System.out.println(kueTerbesar);
    }
}