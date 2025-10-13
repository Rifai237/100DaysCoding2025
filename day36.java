import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        if (nilai >= 60 ){
            if (nilai >= 80 ){
                System.out.println("lulus dengan predikat A");
            }else if(nilai >= 70 && nilai <= 84 ) {
                System.out.println("Predikat B");
            } else if (nilai > 60 && nilai <= 69) {
                System.out.println("Predikat C");
            }
        }else if (nilai < 60 ){
            if (nilai >= 40 && nilai <=59){
                System.out.println("Remedial");
            }else if (nilai < 40 ){
                System.out.println("Pulang mi dek tidur :)");
            }
        }
    }
}
