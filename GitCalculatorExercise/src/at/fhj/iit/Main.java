package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new CalculatorImpl();
		
		calc.addValue(20);	// currently highest number
		calc.addValue(4);	// currently lowester number
		calc.addValue(16);
		calc.addValue(2);
		
		// add other integers
		
		calc.getMinimum();
		calc.getMaximum();
		// output highest number
		
		// output sum of all numbers
		calc.sum();

	}

}
