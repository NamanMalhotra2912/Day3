package Employee_Wage;

public class EmpWage_Wage_for_Month {
	
	public static final int is_Part_Time=1;
	public static final int is_Full_Time=2;
	public static final int Emp_Wage_PerHr=20;
	public static final int Number_of_Working_days=2;
	
	public static void main(String[] args) {
		
		int emphr=0;
		int empwage=0;
		int total_empwage=0;
		
		for (int day=0; day<Number_of_Working_days; day++ ) {
			
			int empCheck =(int) Math.floor(Math.random()*10) % 3;
			
			switch(empCheck) {
			case is_Part_Time: emphr=8;break;
			case is_Full_Time: emphr=16;break;
			default: emphr=0;
			}
			empwage= emphr * Emp_Wage_PerHr;
			total_empwage+=empwage;
			System.out.println("Employee wage is : "+empwage);	
		}
		
		System.out.println("Employee Total Wage is : "+total_empwage);
	}

}
