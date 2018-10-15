import org.junit.Test;

import static org.junit.Assert.*;

public class twoStringMethodsTest {

    @Test
    public void abcTest() {
       boolean result= twoStringMethods.abcTest("123abc");
       assertEquals(true, result);
    }
    @Test
    public void abcTest2() {
        boolean result= twoStringMethods.abcTest("123.abc");
        assertEquals(false, result);
    }
    @Test
    public void abcTest3() {
        boolean result= twoStringMethods.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void twoStrings() {
        String result= twoStringMethods.twoStrings("abc","xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void twoStrings2() {
        String result= twoStringMethods.twoStrings("Hi","There");
        assertEquals("HTihere", result);
    }

    @Test
    public void twoStrings3() {
        String result= twoStringMethods.twoStrings("xxxx","Thereee");
        assertEquals("xTxhxexreee", result);
    }

    @Test
    public void twoStrings4() {
        String result= twoStringMethods.twoStrings("Thereee","xxxx");
        assertEquals("Txhxexrxeee", result);
    }

}

