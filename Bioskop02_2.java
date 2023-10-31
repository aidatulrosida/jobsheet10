import java.util.Scanner;
public class Bioskop02_2 {
    public static void  main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        System.out.println(penonton.length);

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + " :" + penonton[i].length);
        }

        System.out.println(penonton.length);
        
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
    }
}