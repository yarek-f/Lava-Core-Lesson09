package lviv.lgs.ua.task2;

public class Methods {

	/*private double a, b;

	public Methods(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}*/

	double add(double a, double b) throws MyException, IllegalAccessException {
		method(a, b);
		return a + b;
	}

	double subtraction(double a, double b) throws MyException, IllegalAccessException {
		method(a, b);
		return a - b;
	}

	double multiplication(double a, double b) throws MyException, IllegalAccessException {
		method(a, b);
		return a * b;
	}

	double devision(double a, double b) throws MyException, IllegalAccessException {
		method(a, b);
		return a / b;
	}

	private void method(double a, double b) throws MyException, IllegalAccessException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException("a < 0 && b < 0");
		}

		if ((a == 0 & b != 0) || (a != 0 & b == 0)) {
			throw new ArithmeticException("(a = 0 && b !=0) || (a!=0 && b = 0)");
		}

		if (a == 0 & b == 0) {
			throw new IllegalAccessException("a = 0 && b = 0");
		}

		if (a > 0 & b > 0) {
			throw new MyException("a > 0 & b > 0");
		}

	}

}
