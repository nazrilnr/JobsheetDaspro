/**
 * PurchasePrice19
 */
    import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameOfbook;
        String pageCount;
        int price, quatity;
        double discount=0.1,totalPrice, purchasePrice, totalDiscount;
        
        System.out.println("Name of Book: ");
        nameOfbook = input.nextLine();
        System.out.println("Pagecount: ");
        pageCount = input.nextLine();

        System.out.println("Input price: ");
        price = input.nextInt();
        System.out.println("Input quantity: ");
        quatity = input.nextInt();

        totalPrice=price*quatity;
        totalDiscount=totalPrice*discount;
        purchasePrice=totalPrice-totalDiscount;

        System.out.println("Total Discount: "+ totalDiscount);
        System.out.println("FInal purchase price: "+ purchasePrice);
    }
    
}