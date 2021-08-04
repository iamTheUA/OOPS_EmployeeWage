package Day8;

import java.util.Random;

public class OOPS_EmployeeWage {
	
	static int WAGE_PER_HOUR= 200;
	static int hours;
	static int monthly=0;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
	}

	public static void isPresent() {
		Random ran = new Random();
		int isPresent= ran.nextInt(3);
		switch(isPresent) {
			case 0: hours=0; break;
			case 1: hours=4; break;
			case 2: hours=8; break;
		}
	}
	
	public static int dailyWage(int h) {
		return h*WAGE_PER_HOUR;
	}
	
	public static int monthlyWage() {
		for(int i=0; i<20; i++) {
			isPresent();
			monthly=monthly+dailyWage(hours);
		}
		return monthly;
	}
}
