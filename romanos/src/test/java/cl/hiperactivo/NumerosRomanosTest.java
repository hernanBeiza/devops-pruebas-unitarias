package cl.hiperactivo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumerosRomanosTest {

	@Test
	public void testNumRomanos() throws Exception {
        assertEquals("I",NumerosRomanos.numToRomano(1));
        assertEquals("II",NumerosRomanos.numToRomano(2));
        assertEquals("III",NumerosRomanos.numToRomano(3));
        assertEquals("IV",NumerosRomanos.numToRomano(4));
        assertEquals("V",NumerosRomanos.numToRomano(5));
        assertEquals("VI",NumerosRomanos.numToRomano(6));
        assertEquals("VII",NumerosRomanos.numToRomano(7));
        assertEquals("VIII",NumerosRomanos.numToRomano(8));
        assertEquals("IX",NumerosRomanos.numToRomano(9));
        assertEquals("X",NumerosRomanos.numToRomano(10));
    }

    @Test
    public void testDecenas() throws Exception {
        assertEquals("X",NumerosRomanos.numToRomano(10));
        assertEquals("XI",NumerosRomanos.numToRomano(11));
        assertEquals("XIV",NumerosRomanos.numToRomano(14));
        assertEquals("XIX",NumerosRomanos.numToRomano(19));
        assertEquals("L",NumerosRomanos.numToRomano(50));
    }

    @Test
    public void testCentenas() throws Exception {
        assertEquals("C",NumerosRomanos.numToRomano(100));
        assertEquals("CXI",NumerosRomanos.numToRomano(111));
        assertEquals("CCC",NumerosRomanos.numToRomano(300));
        assertEquals("DCCXX",NumerosRomanos.numToRomano(720));
        assertEquals("CMLXXXVII",NumerosRomanos.numToRomano(987));
    }
    
    @Test
    public void testMiles() throws Exception {
        assertEquals("M",NumerosRomanos.numToRomano(1000));
        assertEquals("MCXI",NumerosRomanos.numToRomano(1111));
        assertEquals("MMM",NumerosRomanos.numToRomano(3000));
        assertEquals("I̅X̅DCCCLXXVI",NumerosRomanos.numToRomano(9876));
    }
    
}
