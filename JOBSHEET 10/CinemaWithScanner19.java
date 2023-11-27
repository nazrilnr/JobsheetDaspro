import java.util.Scanner;

public class CinemaWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String[][] Audience = new String[4][2];
            int Row, Column;
            String name,next;

            while (true) {
            System.out.print("input name: ");
            name = sc.nextLine();
            System.out.print("input Row: ");
            Row = sc.nextInt();
            System.out.print("input Column: ");
            Column = sc.nextInt();
            sc.nextLine();

            Audience[Row-1][Column-1] = name;
            System.out.println("Any other audience (y/n): ");
            next=sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
            break;
            }
            }
    }
}