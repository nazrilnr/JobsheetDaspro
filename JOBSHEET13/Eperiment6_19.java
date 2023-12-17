import java.util.Scanner;

public class Eperiment6_19 {
    static void Luas(int p,int l){
    int luas=p*l;
    System.out.println("Square Area Is "+luas);
}   static void Volume(int p,int l,
    int t){ int vol = p*l*t;
    System.out.println("Beam volume is "+vol);
}   public static void main(String[] args) { Scanner sc = new
    Scanner(System.in);
    System.out.print("enter length : ");
    int p=sc.nextInt();
    System.out.print("enter width : ");
    int l=sc.nextInt();
    System.out.print("enter height : ");
    int t =sc.nextInt();
    Luas(p, l);
    Volume(p, l, t);
    } 
}