package Day8;

import java.util.Random;

public class OOPS_EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Emp e1 = new Emp();
		System.out.println("Monthly Wage : " + e1.monthlyWage());
	}
}

class Emp {
	static int WAGE_PER_HOUR = 200;
	static int FULLTIME_HOUR = 8;
	static int PARTTIME_HOUR = 4;
	static int WORKING_DAYS = 20;
	static int TOTAL_WORKING_HOURS = 100;
	public static int hours;
	public static int monthly, totalHours = 0;

	public static void isPresent() {
		Random ran = new Random();
		int isPresent = ran.nextInt(3);
		switch (isPresent) {
		case 0:
			hours = 0;
			break;
		case 1:
			hours = PARTTIME_HOUR;
			break;
		case 2:
			hours = FULLTIME_HOUR;
			break;
		}
	}

	public static int dailyWage(int h) {
		return h * WAGE_PER_HOUR;
	}

	public int monthlyWage() {
		int i = 0;
		while (i < WORKING_DAYS && totalHours < TOTAL_WORKING_HOURS) {
			isPresent();
			monthly += dailyWage(hours);
			totalHours += hours;
			i++;
			System.out.println("Day" + i + ": " + dailyWage(hours));
		}

		return monthly;
	}
}
