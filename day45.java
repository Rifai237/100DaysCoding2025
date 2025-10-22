import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Game favorit ");
        System.out.println("1. roblox ");
        System.out.println("2. Mobile legend ");
        System.out.println("3. Free Fire  ");
        System.out.println("4. PUBG  ");

        System.out.print("Pilih Game (1, 2, 3, 4) Untuk bermain :");
        char game = sc.next().charAt(0);

        switch (game){
            case '1':
                System.out.println("anda membnuka roblox");
                break;
            case '2':
                System.out.println("anda membuka mobile legend");
                break;
            case '3':
                System.out.println("anda membuka free fire");
                break;
            case '4':
                System.out.println("anda membuka PUBG");
                break;
            default:
                System.out.println("Game tidak terdaftar");
                break;
        }
    }
}
