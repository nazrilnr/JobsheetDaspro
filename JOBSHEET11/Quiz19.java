import java.util.Scanner;
import java.util.Random;
public class Quiz19 {
    public static void main(String[] args) {
        Random random = new Random();
            Scanner sc = new Scanner(System.in);
            char menu = 'y';

            do {
                int number = random.nextInt(10) + 1;
                boolean success = false;

                
            do {
                System.out.print("Random Number (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();
                success = (answer == number);
                
                if (answer>number) {
                System.out.println("To Big !");
                    }else if(answer < number)
                System.out.println("To small !");
                
            } while (!success);
            System.out.print("Are yoy wanna repeat the game(Y/y)?");

            menu = sc.nextLine().charAt(0);

            } while (menu == 'y' || menu == 'Y');

            sc.close();
    }
}