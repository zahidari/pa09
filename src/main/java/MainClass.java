import com.sun.tools.javac.Main;

public class MainClass {



    public static long fakultaet(int n){
        long b = 1;


        if(n < 2)
            return b;


        b = n * fakultaet(n-1);
        return b;
    }

    // neu als rekrusive methode schreiben
    public static void printZahl(int start, int end) {
        for (int i=start; i<=end; i++) {
            System.out.println(i);
        }
    }
    public static void printZahlR(int start, int end){

        if(start > end)
            return;

        //System.out.println(end); // rückwerts zahlend. von 10 nach unten..
        printZahlR(start,end-1);
        System.out.println(end); // nacher einzusetzen wird die zahlen nach der schliessung geprintet.
    }
    public static void printZahlR2(int start, int end){

        if(start <= end){
            System.out.println(start);
            printZahlR2(start+1, end);
        }
    }


    public static long fibonacci(int n){

        if(n <= 2)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);

    }

    public static int quersumme(int x) {
        int ret = 0;
        for (int i = x; i > 0; i /= 10) {
            ret += i % 10;
        }
        return ret;
    }

    public static int quersummeR(int x){

        if( x < 10 )
            return x;

        return x % 10 + quersummeR(x/10);
    }

    public static int summe(int anfang, int ende){
        /*Berechnet rekursiv die Summe der Zahlen
         * von anfang bis ende.
         * Ist anfang > ende, so ist das Ergebnis 0
         */

    return 0;
    }
    public static int wuerfele() {
        int wurf;
        int ret = 0;
        do {
            wurf = (int) (Math.random() * 6) + 1;
            ret += wurf;
        } while (wurf == 6);
        return ret;
    }
    public static int wuerfeleR(){

        int wurf = (int) (Math.random() * 6) + 1;

        if(wurf == 6)
            return wurf+wuerfeleR();

        return wurf;
    }

    public static int getPascalWert(int i, int j){

        if(i ==j || j == 0)
            return 1;

        return getPascalWert(i-1,j)+getPascalWert(i-1,j-1);
    }

}
