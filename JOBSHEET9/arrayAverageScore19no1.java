import java.util.Scanner;

public class arrayAverageScore19no1 {
    public static void main(String[] args) {
        Scanner xc19 = new Scanner(System.in);

        int[] score = new int[5];
        int counterL=0,counterP=0, student;
        double averageL,averageP, totalP=0,totalL=0;
        double total = 0;

        System.out.print("Total Students : ");
        student = xc19.nextInt();

        int[] totalScore = new int[10];
            
            for (int i=0; i < student; i++) {
                System.out.print("Input Score student are-"+(i+1)+" : ");
                score[i] = xc19.nextInt();

                }for (int i=0; i < student; i++) {
                    if (score[i]>70) {
                    totalL+=score[i];
                    counterL++;
                }else{
                    totalP+=score[i];
                    counterP++;
                }
            }
            averageL=totalL/counterL;
            averageP=totalP/counterP;

            System.out.println("Student Passed "+averageL);
            System.out.println("Student Failed "+averageP);

         }
    }