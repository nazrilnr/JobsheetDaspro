import java.util.Scanner;

/**
 * Square19
 */
public class Square19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai N = ");

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");

            for(int idalam=1; idalam<=N; idalam++){
            System.out.print("*");
            }
            System.out.println();

        }
    }
}
