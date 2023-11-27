import java.util.Scanner;
/**
 * LinearSearch10
 */
public class linearSearch19 {

    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int numElement = xc.nextInt();

        int[] arrayInt = new int[numElement];
        int i;

        for (i = 0; i < numElement; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrayInt[i] = xc.nextInt();
        }
        System.out.print("Enter the key to search for : ");
        int key = xc.nextInt();

        int result = -1;

        for (i = 0; i < numElement; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }

        if (result != -1) {
            System.out.println("The key is in the array at index position : " + result);
        } else {
            System.out.println("The key is not found in the array!");
        }
    xc.close();
    }
}