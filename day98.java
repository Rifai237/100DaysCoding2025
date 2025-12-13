import java.util.Scanner;

public class day98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka N : ");
        int N = sc.nextInt();

        fibonanci(N);

    }
    static void fibonanci (int n){
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n ; i++) {
            System.out.print(a  + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
