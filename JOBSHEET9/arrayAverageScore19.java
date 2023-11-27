import java.util.Scanner;
/**
 * ArrayAverageValue10
 */
public class arrayAverageScore19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];
        double total=0;
        double average;
        int passCount = 0;
        int passTotal = 0;
        int failCount = 0;
        int failTotal = 0;

        for (int i = 0; i < score.length; i++){
            System.out.print("Enter student score - "+(i+1)+" : ");
            score[i] = sc.nextInt();

            total += score[i];

            if (score[i] > 70) {
                passCount++;
                passTotal += score[i];
            } else {
                failCount++;
                failTotal += score[i];
            }
        }
        average = total / score.length;
        System.out.println("The class average score is = " + average);

        if (passCount > 0) {
            double passAverage = (double) failTotal / failCount;
            System.out.println("Average value for passing student : " + passAverage);
        } else {
            System.out.println("No student passed!");
        }

        if (failCount > 0) {
            double failAverage = (double) failTotal / failCount;
            System.out.println("Average value for failing student : " + failAverage);
        } else {
            System.out.println("No student failed!");
        }
        sc.close();
    }
}