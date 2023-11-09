import java.util.Scanner;

/**
 * input19
 */
public class Input19 {

    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        System.out.print("input a number = ");
        int number = input19.nextInt();
        if (number%2 == 0 ) {
            System.out.println(number+" is an even number! ");            
        } else {
            System.out.println(number+" is an odd number! ");            
        }
                
    }
}