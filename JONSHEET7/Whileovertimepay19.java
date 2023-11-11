import java.util.Scanner;

public class Whileovertimepay19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner (System.in);

        //Declare
        String position;
        int numEmployee;
        int overtimeHours;
        double overtimePay = 0;
        double totalOvertimePay = 0;

        System.out.print("Employee Number = ");
        numEmployee = input19.nextInt();

        int i=0;
            while(i<numEmployee){
                System.out.print(" Position of employee "+(i+1)+" (director, manager, staff) = ");
                position = input19.next();
                System.out.print(" Employee "+(i+1)+" Overtime Hours = ");
                overtimeHours = input19.nextInt();
            i++;

            if(position.equalsIgnoreCase("director")){
                continue;
            }else if (position.equalsIgnoreCase("manager")) {
                overtimePay= overtimeHours*100000;
            }else if (position.equalsIgnoreCase("staff")){
                overtimePay= overtimeHours*75000;
            }else{
                System.out.println("Invalid Position!");
                i--;
            continue;
            }

            totalOvertimePay += overtimePay; 
            
            System.out.print("Total of Overtime Pay = " +totalOvertimePay);
        }

    }
}
