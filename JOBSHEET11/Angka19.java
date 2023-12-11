import java.util.Scanner;

public class Angka19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Input tidak valid. N minimal harus 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Mencetak spasi sebelum angka
                for (int j = N - i; j > 0; j--) {
                    System.out.print("  ");
                }

                // Mencetak angka dari 1 hingga i
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                    // Mencetak spasi antara angka
                    if (k < i) {
                    System.out.print(" ");
                }
                }

                // Pindah ke baris baru setelah mencetak angka
                System.out.println();
            }
        }

        scanner.close();
    }
}
