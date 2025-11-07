import java.util.Scanner;

public class Day61 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Nilai Kelipatan (M) : ");
    int m = sc.nextInt();

    System.out.print("Masukkan Nilai batas akhir (N) : ");
    int n = sc.nextInt();

    System.out.printf("Bilangan kelipatan %d dari 1 sampai %d : \n", m, n);

    for (int i = m; i <= n; i += m) {
      System.out.print(i + " ");
    }
  }
}
