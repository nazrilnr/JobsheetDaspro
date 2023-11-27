import java.util.Scanner;

public class arrayvalue19 {
    public static void main(String[] args) {
        Scanner xn19 = new Scanner(System.in);

        int[] finalScore = new int[10];

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score" + i + " : ");
            finalScore[i] = xn19.nextInt();

                }for (int i = 0; i < finalScore.length; i++) {
                    if (finalScore[i] > 70) {
                        System.out.println("Final score " + i + " LULUS ");
                    } else 
                    {System.out.println("Student are= " + i + "TIDAK LULUS");
                }
        }
    }
}

