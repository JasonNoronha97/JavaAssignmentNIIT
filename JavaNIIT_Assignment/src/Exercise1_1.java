
abstract class Arithmetic {
	double num1, num2;

	public Arithmetic(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public abstract double calculate(double o1, double o2);
}

class Addition extends Arithmetic {
	public Addition(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double calculate(double o1, double o2) {
		return (double) o1 + (double) o2;
	}
}

class Subtraction extends Arithmetic {
	public Subtraction(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double calculate(double o1, double o2) {
		return (double) o1 - (double) o2;
	}
}

class Multiplication extends Arithmetic {
	public Multiplication(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double calculate(double o1, double o2) {
		return (double) o1 * (double) o2;
	}
}

class Division extends Arithmetic {
	public Division(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double calculate(double o1, double o2) {
		double x=0;
		try {
			x = o1 / o2;
		} catch (ArithmeticException ae) {
			System.out.println("cannot divide by zero.");
		}
		return x;
	}
}

public class Exercise1_1 {

	public static void main(String[] args) {
		
		
		Addition a1 = new Addition(5,10);
		Subtraction s1 = new Subtraction(52, 96);
		Multiplication m1 = new Multiplication(55, 2);
		Division d1 = new Division(50, 0);
		
		Arithmetic arr[] = {a1,s1,m1,d1};		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println( arr[i].calculate(arr[i].num1, arr[i].num2));
		}
	}

}
