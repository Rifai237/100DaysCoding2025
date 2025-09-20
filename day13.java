public class no10 {
    public static void main(String[] args) {
        double uang = 120000000;
//        double anak = 3;


        double potongan = uang * 7 /100;
        System.out.println(potongan);
        double ptn = uang - potongan ;
        double bagirata = ptn / 3;

        System.out.println("warisan sesudah di potong admin " + ptn );
        System.out.println("uang yang diterima rifai = " + bagirata );
        System.out.println("uang yang diterima cipung = " + bagirata );
        System.out.println("uang yang diterima mariati = " + bagirata );
    }
}
