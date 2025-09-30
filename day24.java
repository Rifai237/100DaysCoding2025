import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah jari jari : ");
        double jari = sc.nextDouble();
        final double phi = 3.14; // nilai phi itu 3,14 atau 22/7

        double LuasLingkaran = phi * (jari*jari);

        System.out.println("Jumlah luas Lingkaran : "  + LuasLingkaran + "cm2");

    }
}
