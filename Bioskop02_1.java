import java.util.Scanner;
public class Bioskop02_1 {
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
        penonton[3][1] = "Hana";

        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

    }
}