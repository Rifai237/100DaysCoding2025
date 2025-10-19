import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = sc.nextDouble();

        double tunjangan = 500000;
        double pajak;
        double gajiBersih;

        if (gajiPokok >= 5000000) {
            pajak = gajiPokok * 0.10;
        } else if (gajiPokok >= 3000000) {
            pajak = gajiPokok * 0.05;
        } else {
            pajak = 0;
        }

        gajiBersih = gajiPokok + tunjangan - pajak;

        System.out.println("\n--- Rincian Gaji ---");
        System.out.println("Gaji Pokok     : Rp" + gajiPokok);
        System.out.println("Tunjangan      : Rp" + tunjangan);
        System.out.println("Pajak          : Rp" + pajak);
        System.out.println("Gaji Bersih    : Rp" + gajiBersih);
    }
}
