import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        if (nilai  > 0) {
            System.out.println("positif");
        } else if (nilai < 0 ) {
            System.out.println("negatif");
        }else{
            System.out.println("0");
        }
    }
}
