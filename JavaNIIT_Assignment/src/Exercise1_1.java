import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Arithmetic {
	double num1, num2;

	public void setValues(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public abstract double calculate();
}

class Addition extends Arithmetic {

	@Override
	public double calculate() {
		return this.num1 + this.num2;
	}
}

class Subtraction extends Arithmetic {

	@Override
	public double calculate() {
		return this.num1 - this.num2;
	}
}

class Multiplication extends Arithmetic {

	@Override
	public double calculate() {
		return this.num1 * this.num2;
	}
}

class Division extends Arithmetic {

	@Override
	public double calculate() {
		double x = 0;
		try {
			x = this.num1 / this.num2;
		} catch (ArithmeticException ae) {
			System.out.println("cannot divide by zero.");
		}
		return x;
	}
}

public class Exercise1_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Addition a1 = new Addition();
		Subtraction s1 = new Subtraction();
		Multiplication m1 = new Multiplication();
		Division d1 = new Division();

		a1.setValues(50, 2);
		s1.setValues(85, 9);
		m1.setValues(9, 5);
		d1.setValues(52, 2);

		Arithmetic arr[] = { a1, s1, m1, d1 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].calculate());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1. Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter m1, m2 and your choice: ");

		double x = Double.parseDouble(br.readLine());
		double y = Double.parseDouble(br.readLine());

		int choice = 0;

		try {
			choice = Integer.parseInt(br.readLine());
			arr[choice - 1].setValues(x, y);
			System.out.println(arr[choice - 1].calculate());
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please enter proper choice. 1 to 4 only");
		}

	}

}
