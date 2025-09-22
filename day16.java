import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = sc.nextInt();

        int perkalian = angka1 * angka2;
        int pembagian = angka1 / angka2;

        System.out.println("Hasil dikalikan :\t " + perkalian);
        System.out.println("Hasil dibagikan :\t " + pembagian);
    }
}
