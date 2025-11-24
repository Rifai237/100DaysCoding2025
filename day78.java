public class day78 {
    public static void main(String[] args) {
        String teks = "Belajar ddp Sangat Menyenangkan";

        System.out.println("Teks asli: " + teks);
        System.out.println("Panjang teks: " + teks.length());
        System.out.println("Huruf besar: " + teks.toUpperCase());
        System.out.println("Huruf kecil: " + teks.toLowerCase());
        System.out.println("Karakter pada index ke-8: " + teks.charAt(8));
        System.out.println("Substring (0-7): " + teks.substring(0, 7));
        System.out.println("Apakah mengandung kata 'ddp'? " + teks.contains("ddp"));

    }
}
