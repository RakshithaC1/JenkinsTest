package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	    private Calc calc;

	    @Before
	    public void setUp() {
	    	calc = new Calc();
	    }

	    @Test
	    public void testAdd() {
	        assertEquals(5, calc.add(2, 3));
	        assertEquals(-1, calc.add(0, -1));
	    }

	    @Test
	    public void testSubtract() {
	        assertEquals(2, calc.subtract(5, 3));
	        assertEquals(0, calc.subtract(5, 5));
	    }

	    @Test
	    public void testMultiply() {
	        assertEquals(15, calc.multiply(3, 5));
	        assertEquals(0, calc.multiply(0, 7));
	    }
	    
	    @SuppressWarnings("deprecation")
	    public void testDivide() {
	        assertEquals(2.0, calc.divide(10, 5));
	        assertEquals(-1.0, calc.divide(5, 0));
	    }



	}

