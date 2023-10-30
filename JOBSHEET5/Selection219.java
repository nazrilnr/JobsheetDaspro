import java.util.Scanner;

public class Selection219 {
    public static void main(String[] args) {
        Scanner inputan20 = new Scanner(System.in);
        String Score;

        System.out.println("Score UAS : ");
        float finalExam = inputan20.nextFloat();
        System.out.println("Score UTS : ");
        float midExam = inputan20.nextFloat(); 
        System.out.println("Score Quis : ");
        float quiz = inputan20.nextFloat();
        System.out.println("Score Tugas : ");
        float assignment = inputan20.nextFloat();

        //CALLCULATION
        float total = (finalExam*0.4F)+(midExam*0.3F)+(quiz*0.2F)+(assignment*0.1F);
        String message = total < 65 ? "Retake ":"Pass"; 
        System.out.println("Final Grade = "+total+" and the decission is  "+message);

        if (total <= 39) {
            Score = "E"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total <= 50){ Score = "D"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total<=60){ Score = "C"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total<=65){ Score = "C+"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total<=73){ Score = "B"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total<=80){ Score = "B+"; 
            System.out.println("You Are on Grade  "+Score);
            }else if(total<=100){ Score = "A"; 
            System.out.println("You Are on Grade  "+Score); 
            
        }
    }
}