
public class day34 {
    public static void main(String[] args) {
        
        double hargaBarang = 25000;
        double jumlahBeli = 6;
        double total = hargaBarang * jumlahBeli;

        
        boolean dapatDiskon = jumlahBeli > 5 && total >= 100000;

       
        double diskon = 0.10 * total; 
        double totalBayar = total - (dapatDiskon ? diskon : 0);

        System.out.println("Harga barang  : Rp" + hargaBarang);
        System.out.println("Jumlah beli   : " + jumlahBeli);
        System.out.println("Total awal    : Rp" + total);
        System.out.println("Dapat diskon? : " + dapatDiskon);
        System.out.println("Total bayar   : Rp" + totalBayar);
    }
}
