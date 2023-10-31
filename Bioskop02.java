import java.util.Scanner;
public class Bioskop02 {
    public static void  main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        penonton[0][0] =  "Admin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gissel";

        System.out.printf("%s\t %s\n", penonton[0][0], penonton[0][1]); 
        System.out.printf("%s\t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s\t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s\t %s\n", penonton[3][0], penonton[3][1]);

    }
}