import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU DATA SISWA =====");
            System.out.println("1. Input Data Siswa");
            System.out.println("2. Tampilkan Data Siswa");
            System.out.println("3. Cari Data Siswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Siswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.nextLine();
                    System.out.println("Data siswa tersimpan!");
                    break;
                case 2:
                    System.out.println("Menampilkan seluruh data siswa...");
                    break;
                case 3:
                    System.out.print("Masukkan nama siswa yang dicari: ");
                    String cari = input.nextLine();
                    System.out.println("Mencari data siswa bernama: " + cari);
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

        } while (pilihan != 4);


    }
}
