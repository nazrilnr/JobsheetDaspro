import java.util.Scanner;
public class ExpressingGratitude19 {
    
    public static String getGreetingRecipient(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Write Name Someone You can give Greeting:");
    String namaOrang = sc.nextLine(); sc.close();
    return namaOrang;
    } 
        public static void sayThankyou() {
        String nama = getGreetingRecipient();
        System.out.println("Thank you "+nama+" for being the best teacher in the world\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anything");
        
    } public static void main(String[] args) {
        sayThankyou();
        String nama = getGreetingRecipient();
        String greeting = "Thank you "+nama+" wish you all the best";
        greetingAdd(greeting);
        
    } 


    public static void greetingAdd(String greeting) {
    System.out.println(greeting);
    }
}