import java.util.Scanner;
public class day68 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan n: ");
        int n = up.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
