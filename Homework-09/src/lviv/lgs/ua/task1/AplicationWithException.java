/*
 * LOGOS It Academy
 * 
 * */

package lviv.lgs.ua.task1;

import java.util.Scanner;

/**
 * @since java 1.8
 * @author Yaroslav Fedunkiv
 * @version 1.1
 */

public class AplicationWithException {

	public enum Seasons {
		WINTER, SPRING, SUMMER, AUTUMN
	}

	public enum Months {
		JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
		MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
		SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30),
		DECEMBER(Seasons.WINTER, 31);

		private Seasons season;
		private int day;

		Months(Seasons season, int day) {
			this.season = season;
			this.day = day;
		}

		public Seasons getSeason() {
			return season;
		}

		public int getDay() {
			return day;
		}

	}

	static void menu() {
		System.out.println("������ 1, ��� ��������� �� � ����� �����");
		System.out.println("������ 2, ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("������ 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("������ 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("������ 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("������ 6, ��� ������� �� ����� �������� ���� ����");
		System.out.println("������ 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("������ 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("������ 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("������ 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");

	}

	static boolean isMonth(String str) {
		boolean isMonth = false;
		for (Months month : Months.values()) {
			if (str.equalsIgnoreCase(month.name())) {
				isMonth = true;
				break;
			}
		}
		return isMonth;

	}

	static boolean isSeason(String str) {
		boolean isSeason = false;
		for (Seasons seasons : Seasons.values()) {
			if (str.equalsIgnoreCase(seasons.name())) {
				isSeason = true;
				break;
			}
		}
		return isSeason;

	}

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Scanner scanner = new Scanner(System.in);
		String str;

		Months[] months = Months.values();

		while (true) {
			menu();
			str = scanner.nextLine();
			switch (str) {
			
			case "1": { //������ 1, ��� ��������� �� � ����� �����
				System.out.println("Please enter a month: ");
				str = scanner.nextLine();

				if (isMonth(str))
					System.out.println("Such a month exists");
				else
					throw new WrongInputConsoleParametersException("There isn't such a month");

				break;

			} // case 1

			case "2": { //������ 2, ��� ������� �� ����� � ����� � ����� ����
				System.out.println("Please enter a season: ");
				str = scanner.nextLine();

				if (isSeason(str)) {
					for (Months month : Months.values()) {
						if (month.getSeason().name().equalsIgnoreCase(str))
							System.out.println(month);
					}
				} else
					throw new WrongInputConsoleParametersException("There isn't such a season");

				break;

			} // case 2

			case "3": { //������ 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���
				System.out.println("Please enter a month: ");
				str = scanner.nextLine();

				if (isMonth(str)) {
					System.out.println("Month with equals days: ");
					Months month = Months.valueOf(str.toUpperCase());
					for (Months m : Months.values()) {
						if (m.getDay() == month.getDay())
							System.out.println(m);
					}
				} else
					throw new WrongInputConsoleParametersException("There isn't such a month");

				break;

			} // case 3

			case "4": { //������ 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���
				System.out.println("Please enter a month: ");
				str = scanner.nextLine();

				if (isMonth(str)) {
					System.out.println("Months that have fewer days: ");
					Months month = Months.valueOf(str.toUpperCase());
					for (Months m : Months.values()) {
						if (m.getDay() < month.getDay())
							System.out.println(m);
					}
				} else
					throw new WrongInputConsoleParametersException("There isn't such a month");

				break;

			} // case 4

			case "5": { //������ 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���
				System.out.println("Please enter a month: ");
				str = scanner.nextLine();

				if (isMonth(str)) {
					System.out.println("Months that have more days: ");
					Months month = Months.valueOf(str.toUpperCase());
					for (Months m : Months.values()) {
						if (m.getDay() > month.getDay())
							System.out.println(m);
					}
				} else
					throw new WrongInputConsoleParametersException("There isn't such a month");

				break;

			} // case 5

			case "6": { //������ 6, ��� ������� �� ����� �������� ���� ����
				System.out.println("Please enter a month: ");
				str = scanner.nextLine();

				if (isSeason(str)) {
					System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal() + 1) % 4]);
				} else
					throw new WrongInputConsoleParametersException("There isn't such a season");

				break;

			} // case 6

			case "7": { //������ 7, ��� ������� �� ����� ��������� ���� ����
				System.out.println("Please enter a season: ");
				str = scanner.nextLine();

				if (isSeason(str)) {
					int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
					System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
				} else
					throw new WrongInputConsoleParametersException("There isn't such a season");

				break;

			} // case 7

			case "8": { //������ 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���
				for (Months month : months) {
					if (month.getDay() % 2 == 0)
						System.out.println(month);

				}

				System.out.println(" ");

				break;

			} // case 8

			case "9": { //������ 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���
				for (Months month : months) {
					if (month.getDay() % 2 != 0)
						System.out.println(month);

				}
				System.out.println(" ");

				break;

			} // case 9

			case "10": { //������ 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���
				System.out.println("Please enter a month: ");
				str = scanner.nextLine();

				if (isMonth(str)) {
					Months month = Months.valueOf(str.toUpperCase());
					if (month.getDay() % 2 == 0)
						System.out.println("Your month has an even number of days");
					else
						System.out.println("Your month has an odd number of days");

				} else
					throw new WrongInputConsoleParametersException("There isn't such a month");

				break;

			} // case 10
			}

		}

	}

}
