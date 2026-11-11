public class SearchNilai02 {
    public static void main(String[] args) {
        // Inisialisasi array dan nilai yang dicari
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 90;
        boolean ditemukan = false;

        // Proses perulangan pencarian linear
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        
        // Kondisi jika nilai tidak ada di dalam array
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}