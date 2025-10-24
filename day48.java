import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka pertama :");
        angka1 = sc.nextInt();
        System.out.print("Masukkan Angka kedua:");
        angka2 = sc.nextInt();
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                break;
        }




    }
}
