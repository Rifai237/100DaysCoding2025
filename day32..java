import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan umur : ");
        int umur = sc.nextInt();
        System.out.println("Masukkan tahun pengalaman kerja: ");
        int tahunPengalamanKerja = sc.nextInt();
        boolean syarat = (umur <= 30 || tahunPengalamanKerja >= 20);

        System.out.println("Syarat masuk Perusahaan A, setidaknya maximal umur 30 tahun atau Pengalaman kerja minimal 20 tahun ");
        System.out.println("umur: " + umur);
        System.out.println("Pengalaman Kerja: " + tahunPengalamanKerja + " Tahun");
        System.out.println("Diterima: " + syarat);

    }
}
