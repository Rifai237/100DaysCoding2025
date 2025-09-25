public class day18 {
    public static void main(String[] args) {
        byte nilaiByte = 120;       // 1 byte
        int nilaiInt = nilaiByte;   // otomatis: byte -> int
        long nilaiLong = 1995;  // otomatis: int -> long
        float nilaiFloat = nilaiLong; // otomatis: long -> float
        double nilaiDouble = nilaiFloat; // otomatis: float -> double

        System.out.println("Nilai Byte   : " + nilaiByte);
        System.out.println("Nilai Int    : " + nilaiInt);
        System.out.println("Nilai Long   : " + nilaiLong);
        System.out.println("Nilai Float  : " + nilaiFloat);
        System.out.println("Nilai Double : " + nilaiDouble);
    }
}
