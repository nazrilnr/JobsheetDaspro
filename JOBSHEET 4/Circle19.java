import java.util.Scanner;
/**
 * Circle19
 */
public class Circle19 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        double circumference, area;
        System.out.println("input radius");
        r = input.nextInt();
        area = 3.14*r*r;
        circumference = 2*3.14*r;
        System.out.println("area" +area);
        System.out.println("circumference" +circumference);
    }
}