public class day97 {
    static int hitungLuas(int sisi) {
        int luas = sisi * sisi;
        return luas; 
    }

    public static void main(String[] args) {
        int sisi = 4;
        int hasil = hitungLuas(sisi);
        System.out.println("Luas persegi = " + hasil);
    }
}
