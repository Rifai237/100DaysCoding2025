import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        //rumus itu luas = panjang*lebar
        Scanner sc = new Scanner (System.in);
        System.out.print("masukkang jumlah panjang  : ");
        int panjang = sc.nextInt();
        System.out.print("masukkang jumlah lebar  : ");
        int lebar = sc.nextInt();

        int luas = panjang * lebar ;

        System.out.println("luas dari persegi panjang adalah : " + luas + " cm2");

    }
}
