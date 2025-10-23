import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Menu Makanan Warung Surabaya =====");
        System.out.println("1. Nasi Goreng ");
        System.out.println("2. Nasi Goreng Merah ");
        System.out.println("3. Pangsit  ");
        System.out.println("4. Bakso ");

        System.out.print("Masukkan pilihan menu :");
        byte menu  = sc.nextByte();
        
        switch (menu){
            case 1:
                System.out.println("Anda Memilih Menu Nasi Goreng");
                break;
            case 2:    
                System.out.println("Anda Memilih Menu Nasi Goreng Merah");
                break;
            case 3:    
                System.out.println("Anda Memilih Menu Pangsit");
                break;
            case 4:    
                System.out.println("Anda Memilih Menu Bakso");
                break;
            default:
                System.out.println("Pilihan Anda Tidak Ada di Menu ");
                break;
        }
    }
}
