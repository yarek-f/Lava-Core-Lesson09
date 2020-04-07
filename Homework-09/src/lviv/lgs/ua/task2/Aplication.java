package lviv.lgs.ua.task2;

public class Aplication {
	
	public static void main(String[] args) {
		Methods m = new Methods();
		double a, b;

		a = -5.3;
		b = -7.85;
		try {
			System.out.println(a + " + " + b + " = " + m.add(a, b));
		} catch (Throwable e) {
			System.out.println("Exception intercepted: " + e.toString());
		}

		a = 12.3;
		b = 0;
		try {
			System.out.println(a + " - " + b + " = " + m.subtraction(a, b));
		} catch (Throwable e) {
			System.out.println("Exception intercepted: " + e.toString());
		}

		a = 0;
		b = 10.0;
		try {
			System.out.println(a + " * " + b + " = " + m.multiplication(a, b));
		} catch (Throwable e) {
			System.out.println("Exception intercepted: " + e.toString());
		}

		a = 12.3;
		b = 15.55;
		try {
			System.out.println(a + " / " + b + " = " + m.devision(a, b));
		} catch (Throwable e) {
			System.out.println("Exception intercepted: " + e.toString());
		}

		a = 0;
		b = 0;
		try {
			System.out.println(a + " + " + b + " = " + m.add(a, b));
		} catch (Throwable e) {
			System.out.println("Exception intercepted: " + e.toString());
		}

	}
	
}
