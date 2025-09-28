import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        // rumus luas perssegi L=s*s
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int sisi1= sc.nextInt();

        int luas = sisi1 * sisi1;

        System.out.println("Luas persegi : " + luas);



    }
}
