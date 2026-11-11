import java.util.Scanner;

public class KafeKampus01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        // Daftar menu
        System.out.println("=== DAFTAR MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s Rp %d%n", (i + 1), menu[i], harga[i]);
        }

        // Fitur pencarian menu (linear search)
        System.out.print("\nCari menu: ");
        String cari = input.nextLine();
        int hasil = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println(menu[hasil] + " tersedia, harganya Rp " + harga[hasil]);
        } else {
            System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
        }

        // Fitur pemesanan
        System.out.print("\nJumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int ketemu = -1;
            while (ketemu == -1) {
                System.out.print("Pesanan ke-" + (i + 1) + ": ");
                String nama = input.nextLine();
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        ketemu = j;
                        break;
                    }
                }
                if (ketemu == -1) {
                    System.out.println("Menu tidak tersedia, silakan coba lagi.");
                }
            }
            pesanan[i] = menu[ketemu];
            hargaPesanan[i] = harga[ketemu];
            total += harga[ketemu];
        }

        // Tampilkan daftar pesanan dan total
        System.out.println("\n=== DAFTAR PESANAN ===");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%d. %-16s Rp %d%n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("Total biaya : Rp " + total);
    }
}