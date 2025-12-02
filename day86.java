import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan batas array :");
        int a = sc.nextInt();
        int[] array = new int[a];
        int min = array[0];

        for (int i = 0; i < a; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            array[i] = sc.nextInt();
        }

        for (int j : array) {
            if (j > min) {
                min = j;
            }
        }
        System.out.println("Nilai maxsimum adalah : " + min);
    }
}
