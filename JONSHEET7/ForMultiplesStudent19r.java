/**
 * ForMultiplesStudent19r
 */
import java.util.Scanner;
public class ForMultiplesStudent19r {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int multiple;
            int sum = 0;
            int counter = 0; 
            System.out.print("Input the multiple = ");
            multiple = input.nextInt();

            for(int i=1;i<=50;i++){
                if(i%multiple==0){
                    sum = sum + i;
                    counter++;

                }
            }
            System.out.printf("There are %d numbers that are multiple of %d in range 1  to 50. \n", counter, multiple);
            System.out.printf("The sum from all multiples of %d n range 1 s.d. 50 is %d. \n", multiple, sum);
        }
    }
}