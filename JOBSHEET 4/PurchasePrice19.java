/**
 * PurchasePrice19
 */
    import java.util.Scanner;
public class PurchasePrice19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price, quatity;
        double discount=0.1,totalPrice, purchasePrice, totalDiscount;

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