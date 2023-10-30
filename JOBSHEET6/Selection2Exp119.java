import java.util.Scanner;
public class Selection2Exp119 {
    public static void main(String[] args) {
        Scanner inputan19 = new Scanner(System.in); 
        int year; System.out.println("What Year ?"); 
        year = inputan19.nextInt(); 
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not A Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not A Leap Year");
        }
        
         if (year%4==0) {
             if (year%100!=0) {
                 System.out.println("Leap Year"); 
         }   else {
                 System.out.println("Not A leap Year");
         }
         }   else { 
             System.out.println("Not A leap Yea"); }
    }
}