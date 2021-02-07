package Employee_Wage;

public class Employee_Wage {
	
	public static void main(String[] args) {
		
		int is_Full_Time=1;
		int Emp_Wage_PerHr=20;
		int emphr=0;
		int empwage=0;
		
		double empCheck = Math.floor(Math.random()*10) % 2;
		
		if (empCheck == is_Full_Time) 
			emphr=8;
		else 
			emphr=0;
		empwage= emphr * Emp_Wage_PerHr;
		
		System.out.println("Employee Wage is : "+empwage);
	}

}
