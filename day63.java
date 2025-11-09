import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int jumlah = 0;

        System.out.print("Masukkan nilai N: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
             jumlah *= i;
        }

        System.out.println("Jumlah dari 1 sampai " + n + " adalah " + jumlah);
    }
}
