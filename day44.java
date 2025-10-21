import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai = ");
        int nilai = sc.nextInt();
        if(nilai >=85 && nilai <=100){
            System.out.println("A");
        }else if (nilai >=65 && nilai<=84) {
            System.out.println("B");
        }else if (nilai >=50 && nilai <=64){
            System.out.println("C");
        }else if (nilai >=45 && nilai <=49){
            System.out.println("D");
        }else if (nilai >= 0 && nilai <=44){
            System.out.println("Eror");
        }else{
            System.out.println("diluar nurul");
        }



    }
}
