import java.util.Scanner;

public class ModifyCinemaScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] Audience = new String[4][2];
        int Row, Column;
        String name,next;
        boolean menu=true;
        while (menu!=false) {
            System.out.println("Pilih menu");
            System.out.println("1. input Audoence");
            System.out.println("2. pront list audience");
            System.out.println("3. Exit");
            int option=sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
            while (true) {
                System.out.print("input name: ");
                name = sc.nextLine();
                System.out.print("input row: ");
                Row = sc.nextInt();
                System.out.print("input Column: ");
                Column = sc.nextInt();
                sc.nextLine();
                
                if(Column==5||Column==3){
                    System.out.println("Column atau Column Not display");
                    continue;
                }
                if(Audience[Column-1][Column-1]!=null){
                    System.out.println("Has gone in the other way!");
                    continue;
                }else{
                Audience[Column-1][Column-1] = name;
                }
                System.out.println("input other Audience (y/n): ");
                next=sc.nextLine();
    
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }
                break;
                case 2:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (Audience[i][j]==null) {
                            Audience[i][j]="***";
                        }
                    } 
                }
                    for (int i = 0; i < Audience.length; i++) {
                    System.out.println("Audience at Column-"+ (i+1)+": "+String.join(", ", Audience[i]));
                    }
                    break;
                case 3:
                System.out.println("your exit");
                menu=false;
                break;
                default:
                System.out.println("wrong input");
            }
        }
            }
    }