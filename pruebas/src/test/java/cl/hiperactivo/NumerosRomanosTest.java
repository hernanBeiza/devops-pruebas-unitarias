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
        //assertEquals("C",NumerosRomanos.numToRomano(100));
        assertEquals("XI",NumerosRomanos.numToRomano(11));
    }
}
