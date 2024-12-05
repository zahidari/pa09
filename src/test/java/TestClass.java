import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    public void testeFakultaet(){
        long n  ;
         n = MainClass.fakultaet(5);
         long m =MainClass.fakultaet(10);
        System.out.println(n+"\n"+m);

    }
    @Test
    public void testePrintZahlR(){
        MainClass.printZahlR(5,10);
    }
    @Test
    public void testePrintZahlR2(){
        MainClass.printZahlR2(5,10);
    }

    @Test
    void testFibo() {
        //long f5 = MainClass.fibonacci(5);
        //long f10 = MainClass.fibonacci(10);
        long f20 = MainClass.fibonacci(20);

//        System.out.println(f5);
//        System.out.println(f10);
        System.out.println(f20);

     }
     @Test
    void testQuersummeR(){
         System.out.println(MainClass.quersummeR(432));
     }
     @Test
    void testWurfeleR(){
        int s = MainClass.wuerfeleR();
         System.out.println(s);
     }
     @Test
    void testGetPascal(){
         System.out.println(MainClass.getPascalWert(4,1));
     }
}
