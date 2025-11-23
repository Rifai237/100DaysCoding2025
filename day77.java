import java.util.Scanner;

public class days77 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String n = w.nextLine();

        System.out.println("\n=== HASIL MANIPULASI ===");
        System.out.println("substring(0, 5) : " + n.substring(0, 5));
        System.out.println("replace()       : " + n.replace("a", "@"));
        System.out.println("trim()          : " + n.trim());
    }
}
