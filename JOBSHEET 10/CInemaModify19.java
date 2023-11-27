/**
 * CInemaModify19
 */
public class CInemaModify19 {

    public static void main(String[] args) {
        String[][] Audience = new String[4][2];

    //         System.out.println(Audience.length);
    //         for (int i = 0; i < Audience.length; i++) {
    //         System.out.println("Length Row at -"+(i+1)+" : "+Audience[i].length);
    // }
    //         for (String[] rowAudience : Audience) {
    //         System.out.println("Length Row :"+rowAudience.length);
    // }

            Audience[0][0] = "Amin";
            Audience[0][1] = "Bena";
            Audience[1][0] = "Candra";
            Audience[1][1] = "Dela";
            Audience[2][0] = "Eka";
            Audience[2][1] = "Farhan";
            Audience[3][0] = "Gisel";

            for (int i = 0; i  < Audience.length; i++) {
                System.out.println("Audience In row: " + (i + 1) + String.join(",", Audience[i]));
                }

            // System.out.println("AUDIENCES IN THE ROW 3 :");
            // for (String i : Audience[2]) {
            // System.out.println(i);

            // for (int i = 0; i < Audience[2].length; i++) {
            // System.out.println(Audience[2][i]);

            // System.out.printf("%s \t %s\n",Audience[0][0],Audience[0][1]);
            // System.out.printf("%s \t %s\n",Audience[1][0],Audience[1][1]);
            // System.out.printf("%s \t %s\n",Audience[2][0],Audience[2][1]);
            // System.out.printf("%s \t %s\n",Audience[3][0],Audience[3][1]);

    }
}