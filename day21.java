public class day21 {
    public static void main(String[] args) {
        int a = 5;
        int b =10;

        System.out.println("sebelum ditukar A = " + a);
        System.out.println("sebelum ditukar B = " + b);

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("sesudah diubah  A = " + a);
        System.out.println("sesudah diubah  B = " + b);

    }
}
