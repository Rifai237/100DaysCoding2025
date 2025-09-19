import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nim  : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan alamat : ");
        String alamat = sc.nextLine();
        System.out.print("Masukkan umur : ");
        byte umur = sc.nextByte();
        System.out.print("Masukkan angkatan : ");
        int angkatan = sc.nextInt();
        System.out.print("Masukkan tinggi badan  : ");
        double tinggiB = sc.nextDouble();
        System.out.print("Masukkan berat badan  : ");
        float beratB = sc.nextFloat();

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(alamat);
        System.out.println(umur);
        System.out.println(angkatan);
        System.out.println(tinggiB);
        System.out.println(beratB);
        }
        }
    }
}
