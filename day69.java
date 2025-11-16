package evaluasi;

import java.util.Scanner;

public class empat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pola :");
        int pola = sc.nextInt();

        for (int i = 1; i <= pola; i++) {
            for (int j = 1; j <= pola; j++) {
                System.out.print("-+");

            }
            System.out.println();
        }
        for (int i = 1; i <= pola; i++) {
            for (int j = 1; j <= pola; j++) {
                System.out.print(" " +i);

            }
            System.out.println();
        }
        for (int i = 1; i <= pola; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);

            }
            System.out.println();
        }
    }
}
