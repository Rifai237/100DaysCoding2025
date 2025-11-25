import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Buat username: ");
        String user = input.nextLine();

        System.out.print("Buat password: ");
        String pass = input.nextLine();
        while (true) {  
            System.out.print("Masukkan username: ");
           String u = input.nextLine();

            System.out.print("Masukkan password: ");
            String p = input.nextLine();

            if (u.equals(user) && p.equals(pass)) {
                System.out.println("\nLogin berhasil! Selamat datang " + user);
                break; 
            } else {
                System.out.println("Username / Password salah! Coba lagi.\n");
            }
        }


    }
}
