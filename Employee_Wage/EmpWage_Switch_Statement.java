package Employee_Wage;

public class EmpWage_Switch_Statement {
	
	public static final int is_Part_Time=1;
	public static final int is_Full_Time=2;
	public static final int Emp_Wage_PerHr=20;
	
	public static void main(String[] args) {
		
		int emphr=0;
		int empwage=0;
		
		int empCheck =(int) Math.floor(Math.random()*10) % 3;
		
		switch(empCheck) {
		case is_Part_Time: emphr=8;break;
		case is_Full_Time: emphr=16;break;
		default: emphr=0;
		}
		
		empwage= emphr * Emp_Wage_PerHr;
		
		System.out.println("Employee Hours is : "+emphr);
		System.out.println("Employee Wage is : "+empwage);
	}

}
