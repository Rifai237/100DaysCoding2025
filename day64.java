public class day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" nilai M: ");
        int M = sc.nextInt();

        System.out.print(" nilai N  : ");
        int N = sc.nextInt();

        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil *= M;       
        }

        System.out.println(M + " pangkat " + N + " = " + hasil);
    }
}
