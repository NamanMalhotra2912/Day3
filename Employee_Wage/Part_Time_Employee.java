package Employee_Wage;

public class Part_Time_Employee {
	
	public static void main(String[] args) {
		
		int is_Part_Time=1;
		int is_Full_Time=2;
		int Emp_Wage_PerHr=20;
		int emphr=0;
		int empwage=0;
		
		double empCheck = Math.floor(Math.random()*10) % 2;
		
		if (empCheck == is_Part_Time) 
			emphr=8;
		else 
			emphr=16;
		empwage= emphr * Emp_Wage_PerHr;
		
		System.out.println("Employee Hours is : "+emphr+" Employee Wage is : " +empwage);
	}

}
