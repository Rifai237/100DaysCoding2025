import java.util.Scanner;

public class day96 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("masukkan angka A :");
        int a = sc.nextInt();
        System.out.print("masukkan angka B :");
        int b = sc.nextInt();


        System.out.println("tambah : " + tambah(a,b));
        System.out.println("kurang : " + kurang(a,b));
        System.out.println("bagi : " + bagi(a,b));
        System.out.println("kali : " + kali(a,b));

    }
   static int tambah (int a, int b){
        return a+b;

    }
    static int kurang (int a, int b){
        return a-b;

    }
    static int bagi (int a, int b){
        return a/b;

    }
    static int kali (int a, int b){
        return a*b;

    }

}
