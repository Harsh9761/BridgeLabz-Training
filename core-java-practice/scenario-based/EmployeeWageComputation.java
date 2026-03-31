
public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		System.out.println("\nWelcome to Employee Wage Computation Program.\n");
		int totalHours = 0;
		int totalWage = 0;
		int totalDays = 0;
		
		while(totalDays < 20 && totalHours < 100) {
			totalDays++;
			
			int dailyHours = 0;
			int empStatus = checkAttendence();
			
			switch(empStatus) {
				case 0:
					System.out.println("Employee is Absent");
					dailyHours = 0;
					break;
				case 1:
					dailyHours = 8;
					System.out.println("Full Time Present");
					break;
				case 2:
					dailyHours = 4;
					System.out.println("Part Time Present");
					break;
				default:
					System.out.println("Invalid Input");
			}
			
			if (totalHours + dailyHours > 100) {
                dailyHours = 100 - totalHours;
            }
			
			totalHours += dailyHours;
			int dailyWage = calculateDailyWage(dailyHours);
			totalWage += dailyWage;
			
			System.out.println("Daily Wage: " + dailyWage);
		}
		
		System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Monthly Wage: " + totalWage);
		

	}
	
	//Absent = 0
	//FullTime present = 1
	//PartTime present = 2
	public static int checkAttendence() {
		int status = (int)(Math.random()*3);
		return status;
	}
	public static int calculateDailyWage(int dailyhours) {
		int wage = 20* dailyhours;
		return wage;
	}
	

}
