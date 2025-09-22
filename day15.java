public class day15 {
    public static void main(String[] args) {
        String angka1 ="25";
        String angka2 ="78";

        byte angka3 = Byte.parseByte(angka1);
        byte angka4 = Byte.parseByte(angka2);

        int kurang = angka3 - angka4;
        int tambah = angka3 + angka4;
        System.out.println(tambah);
        System.out.println(kurang);
        


    }
}
