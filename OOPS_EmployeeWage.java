package Day8;

import java.util.Random;

public class OOPS_EmployeeWage {
	
	static int WAGE_PER_HOUR= 200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
	}

	public static void isPresent() {
		Random ran = new Random();
		int isPresent= ran.nextInt(2);
	}
	
	public static int dailyWage(int h) {
		return h*WAGE_PER_HOUR;
	}
	
}
