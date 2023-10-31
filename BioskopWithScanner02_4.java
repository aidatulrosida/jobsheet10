import java.util.Scanner;

public class BioskopWithScanner02_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];
        boolean exit = false;

        while (true) {
            System.out.println("======================================");
            System.out.println("     Selamat Datang Di Bioskop 1B");
            System.out.println("======================================");
            System.out.println("- Menu 1 : Input Data Penonton");
            System.out.println("- Menu 2 : Tampilkan Daftar Penonton");
            System.out.println("- Menu 3 : Exit");
            System.out.println("======================================");
            System.out.print("Masukkan Pilihan Anda : ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                           penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil diinput.");
                            System.out.println(); 
                        }else {
                            System.out.println("Kursi sudah terisi. Mohon pilih kursi lain.");
                        }                 
                    } else {
                        System.out.println("Baris atau kolom tidak tersedia. Harap masukkan nilai yang benar.");
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else{
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;

                case 3:
                    exit = true;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid. Harap pilih menu yang sesuai.");
            }
        }

    }
}
