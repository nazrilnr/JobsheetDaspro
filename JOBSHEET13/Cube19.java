import java.util.Scanner;

public class Cube19 {
    static void Volume(int s){
        int vol = s*s*s;
    
        System.out.println("Volume Cube : "+vol);
        } static void Extensibility(int s){
            int Extensibility=s*s*6;
            System.out.println("The surface area of the cube is :"+Extensibility);
        } public static void main(String[]args) { Scanner sc = new
        Scanner(System.in);
        System.out.print("Enter the length of the side of the cube :"); int sisi=sc.nextInt(); Volume(sisi);
        Extensibility(sisi);
    } 
}