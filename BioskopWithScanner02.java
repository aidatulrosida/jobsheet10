import java.util.Scanner;
public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        int baris, kolom;
        String nama,next;
        String[][] penonton = new String [4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc02.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc02.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc02.nextInt();
            sc02.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainya? (y/n): ");
            next = sc02.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}