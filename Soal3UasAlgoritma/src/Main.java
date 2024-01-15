import java.util.ArrayList;
import java.util.Random;

class RandomPenjualan {

    private static final int KAPASITAS_PERTALITE = 2000;
    private static final int KAPASITAS_PERTAMAX = 2500;
    private static final int KAPASITAS_PERTAMAX_TURBO = 1700;
    private static final int KAPASITAS_PERTADEX = 2800;

    public static void main(String[] args) {
        ArrayList<Integer> penjualanPertalite = new ArrayList<>();
        ArrayList<Integer> penjualanPertamax = new ArrayList<>();
        ArrayList<Integer> penjualanPertamaxTurbo = new ArrayList<>();
        ArrayList<Integer> penjualanPertadex = new ArrayList<>();

        Random random = new Random();

        while (true) {
            // Melakukan random penjualan untuk masing-masing jenis bahan bakar
            int randomPenjualanPertalite = random.nextInt(500);
            int randomPenjualanPertamax = random.nextInt(500);
            int randomPenjualanPertamaxTurbo = random.nextInt(500);
            int randomPenjualanPertadex = random.nextInt(500);

            // Menambahkan penjualan ke ArrayList
            penjualanPertalite.add(randomPenjualanPertalite);
            penjualanPertamax.add(randomPenjualanPertamax);
            penjualanPertamaxTurbo.add(randomPenjualanPertamaxTurbo);
            penjualanPertadex.add(randomPenjualanPertadex);

            // Menampilkan detail penjualan
            System.out.println("Detail Penjualan:");
            System.out.println("Pertalite: " + randomPenjualanPertalite + " kg");
            System.out.println("Pertamax: " + randomPenjualanPertamax + " kg");
            System.out.println("Pertamax Turbo: " + randomPenjualanPertamaxTurbo + " kg");
            System.out.println("Pertadex: " + randomPenjualanPertadex + " kg");

            // Menampilkan total penjualan
            int totalPertalite = penjualanPertalite.stream().mapToInt(Integer::intValue).sum();
            int totalPertamax = penjualanPertamax.stream().mapToInt(Integer::intValue).sum();
            int totalPertamaxTurbo = penjualanPertamaxTurbo.stream().mapToInt(Integer::intValue).sum();
            int totalPertadex = penjualanPertadex.stream().mapToInt(Integer::intValue).sum();

            System.out.println("Total Penjualan:");
            System.out.println("Pertalite: " + totalPertalite + " kg");
            System.out.println("Pertamax: " + totalPertamax + " kg");
            System.out.println("Pertamax Turbo: " + totalPertamaxTurbo + " kg");
            System.out.println("Pertadex: " + totalPertadex + " kg");

            // Menghitung dan menampilkan sisa stok
            int sisaStokPertalite = KAPASITAS_PERTALITE - totalPertalite;
            int sisaStokPertamax = KAPASITAS_PERTAMAX - totalPertamax;
            int sisaStokPertamaxTurbo = KAPASITAS_PERTAMAX_TURBO - totalPertamaxTurbo;
            int sisaStokPertadex = KAPASITAS_PERTADEX - totalPertadex;

            System.out.println("Sisa Stok:");
            System.out.println("Pertalite: " + sisaStokPertalite + " kg");
            System.out.println("Pertamax: " + sisaStokPertamax + " kg");
            System.out.println("Pertamax Turbo: " + sisaStokPertamaxTurbo + " kg");
            System.out.println("Pertadex: " + sisaStokPertadex + " kg");

            // Menunggu 3 detik sebelum melakukan random lagi
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}