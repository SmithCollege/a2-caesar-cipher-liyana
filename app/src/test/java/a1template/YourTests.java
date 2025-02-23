// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class YourTests {

    @Test
    public void encodeTest(){
        CaesarCipher classUnderTest = new CaesarCipher(16);
        assertEquals("rs wi xkwo sc vsikxk!", classUnderTest.encode("hi my name is liyana!"));
        
        classUnderTest = new CaesarCipher(22);
        assertEquals("m'q ws ibgmxih xlmw asvow.", classUnderTest.encode("i'm so excited this works."));
    }

    @Test
    public void decodeTest(){
        CaesarCipher classUnderTest = new CaesarCipher(2);
        assertEquals("i can write tests!", classUnderTest.decode("g ayl upgrc rcqrq!"));
        
        classUnderTest = new CaesarCipher(5);
        assertEquals("what a joy this has been", classUnderTest.decode("rcvo v ejt ocdn cvn wzzi"));

    }
}