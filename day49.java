import java.util.Scanner;

public class Day49 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("program cek bilangan ganjil");
    System.out.print("masukkan angka: ");
    int n = sc.nextInt();

    boolean isGanjil = (n % 2 == 1) ? true : false;
    System.out.println(isGanjil);
  }
}
