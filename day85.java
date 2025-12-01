import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan batas array :");
        int a = sc.nextInt();
        int array [] = new int[a];
        int max = array[0];

        for (int i = 0; i < a; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max ) {
                max = array[i];
            }
        }
        System.out.println("Nilai maxsimum adalah : " + max);
    }
}
