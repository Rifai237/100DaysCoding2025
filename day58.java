import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("MAsukkan angka N :");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("angka 1-n :" + i);
        }
        System.out.println();
        for (int i = n; i >= 1; i--) {
            System.out.println("angka n-1 : " + i);
        }
    }
}
