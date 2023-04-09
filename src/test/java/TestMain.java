import org.example.Main;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestMain {
    Main main;
    @Before
    public void setUp(){
        main = new Main();
    }
    @Test
    public void test1palindromo(){
        String palindromo = "h";
        Boolean result=main.isPalindromo(palindromo);
        assertEquals(true,result);
    }
    @Test
    public void test2palindromo(){
        String palindromo = "Sometamos o matemos";
        Boolean result=main.isPalindromo(palindromo);
        assertFalse(result);
    }
    @Test
    public void test3palindromo(){

        String palindromo = "Sometamos o matemos";
        Boolean result=main.validacionFrases(palindromo);
        assertEquals(false,result);
    }
    @Test
    public void test4palindromo(){

        String palindromo = "palabra";
        Boolean result=main.validacionFrases(palindromo);
        assertEquals(true,result);
    }


}
