package demo;

public class Calc {
	
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public double divide(int a, int b) {
	        if (b == 0) {
	            return -1.0;
	        }
	        return a / b;
	    }

}
