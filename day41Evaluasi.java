
package evaluasi;

import java.util.Scanner;

public class soal8 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Masukkan gander :");
        String gender = sc.nextLine();
        System.out.println("Masukkan umur :");
        int umur = sc.nextInt();

        if (gender.equalsIgnoreCase("laki laki") ){
            if(umur >= 25){
                System.out.println("anda seorang " + gender +"berumur "+ umur + ",sudah dewasa ");
            } else if (umur >= 18) {
                System.out.println("anda seorang " + gender +"berumur "+ umur + ",sudah remaja ");

            } else if (umur < 18) {
                System.out.println("anda seorang " + gender +"berumur "+ umur + ",sudah masih anak anak");

            }
        }else{
            System.out.println("diabaikan ");
        }

    }
}
//dewasa = 25
//remaja = 18
//anak anak = < 18
