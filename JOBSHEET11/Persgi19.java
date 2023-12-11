import java.util.Scanner;

public class Persgi19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Input tidak valid. N minimal harus 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    // Cetak angka 3 atau 5 pada batas-batas persegi
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print(N);
                    } else {
                        // Cetak spasi di tengah-tengah persegi
                        System.out.print(" ");
                    }

                    // Cetak spasi di antara angka
                    if (j < N) {
                        System.out.print(" ");
                    }
                }
                // Pindah ke baris baru setiap selesai satu baris
                System.out.println();
            }
        }

        scanner.close();
    }
}
