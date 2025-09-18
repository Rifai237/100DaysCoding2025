import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = sc.nextInt();

         int penjumlahan = angka1 + angka2;
         int perkalian = angka1 * angka2;
         int pembagian = angka1 / angka2;

        System.out.println("hasil penjumlahan : "  + penjumlahan);
        System.out.println("hasil perkalian : " + perkalian);
        System.out.println("hasil pembagian : " + pembagian);
    }
}
