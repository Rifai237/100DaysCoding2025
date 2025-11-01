import java.util.Arrays;
import java.util.Scanner;

public class bulatArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang Array : ");
        int n = input.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr [] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            max = (arr[i] > max) ? arr[i] : max;
            min = (arr[i] < min) ? arr[i] : min;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nilai Min : " + min);
        System.out.println("Nilai Max : " + max);
    }
}
