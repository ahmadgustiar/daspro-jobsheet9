import java.util.Scanner;

public class ArrayNilai02 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        // Langkah 4: input nilai
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        // Langkah 5: tampilkan nilai + status
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }

        // Pertanyaan 2: hanya tampilkan yang lulus
        System.out.println("\n--- Hanya yang lulus ---");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            }
        }

        // Pertanyaan 3: versi foreach untuk langkah 5
        System.out.println("\n--- Versi foreach ---");
        int no = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
        }

        // Pertanyaan 4: jumlah lulus dan tidak lulus
        int lulus = 0;
        int tidakLulus = 0;
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("\nJumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
}