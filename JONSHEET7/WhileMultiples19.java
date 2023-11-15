import java.util.Scanner;

public class WhileMultiples19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner (System.in);

        int multiple;
        int sum = 0;
        int counter = 0;
        double average;

        System.out.print("INPUT THE MULTIPLE = ");
        multiple = input19.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
            i++;
        }

        average = (double) sum / counter;

        System.out.printf("There Are %d numbers that are multiple of %d in range 1 to 50. \n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
        System.out.printf("The average of all multiples of %d in range 1 s.d. 50 is %.2f. \n", multiple, average);

        input19.close();
    }
    
}