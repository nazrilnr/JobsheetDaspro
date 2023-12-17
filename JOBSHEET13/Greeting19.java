import java.util.Scanner;
public class Greeting19 {
    
    public static String getGreetingRecipient(){
    
        Scanner sc = new Scanner(System.in);
    System.out.println("Write Name Someone You can give Greeting:");
    String someoneName = sc.nextLine();
    return someoneName;
    } public static void main(String[] args) {
    String name = getGreetingRecipient();
    
    System.out.println("Thank you "+name+"\nMay the force be with you");
    }
} 