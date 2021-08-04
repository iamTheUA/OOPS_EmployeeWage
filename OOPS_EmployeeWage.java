package Day8;

import java.util.Random;

public class OOPS_EmployeeWage {
	
	static int WAGE_PER_HOUR= 200;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
	}

	public static void isPresent() {
		Random ran = new Random();
		int isPresent= ran.nextInt(3);
	}
	
	public static int dailyWage(int h) {
		return h*WAGE_PER_HOUR;
	}
	
}
