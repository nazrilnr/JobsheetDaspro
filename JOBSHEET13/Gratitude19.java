/**
 *  Gratitude19
 */
public class Gratitude19 {
    
    public static String sayThankyou() {
        String greeting = "Thank ypu for being the best teacher in the world\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anything"; return greeting;
    } public static void main(String[]args) {
 // menggunakan fungsi
    String thankYou = sayThankyou();
    System.out.println(thankYou);
 // tanpa fungsi
    System.out.println("Thank ypu for being the best teacher in the world\n"+
    "You inspired in me a love for learning and made me feel like i could ask you anything");
        
        sayThankyou();
        String greeting = "Thankyou Mr...and Mrs... For 1 semester teaching me";
        sayAdditionalGreetings(greeting);
    }
    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
        } 

  
} 

//     public static void sayThankyou() {
//     System.out.println("Thank ypu for being the best teacher in the world\n"+
//     "You inspired in me a love for learning and made me feel like i could ask you anything");
//     } public static void main(String[] args) {
    
//         sayThankyou();
    
// }

// }