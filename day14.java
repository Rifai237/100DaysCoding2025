public class day14 {
    public static void main(String[] args) {
        String angka = "37";
        String angka1 = "39";
        String angka2 = "78.0";
        String betul = "false";

        int angkaB = Integer.parseInt(angka); //jika ingin menggunakan tipe data lauin tinggal di ganti nama tipedatanya
        int angkaB1 = Integer.parseInt(angka1);
        double angkaB2 = Double.parseDouble(angka2);
        boolean betulB = Boolean.valueOf(betul);
        
         int tambah = angkaB * angkaB1;

        System.out.println(" hasil = " + tambah);
        System.out.println("Tinggi saya = " + angkaB2);
        System.out.println("false = " + betulB);


    }
}
