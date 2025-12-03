import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = {10, 20, 30, 40, 50};
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Data ditemukan pada index ke-" + posisi);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
