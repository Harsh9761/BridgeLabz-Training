import java.util.*;
public class FitnessChallengeTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pushUps[] = new int[7];
		int total = 0;
		int workoutDays = 0;
		for(int i = 0;i < 7;i++) {
			System.out.print("Enter number of pushups for day "+(i+1)+" : ");
			pushUps[i] = sc.nextInt();
		}
		for(int i = 0;i<7;i++) {
			if(pushUps[i]==0) {
				continue;
			}
			total += pushUps[i];
			workoutDays++;
		}
		double average = (double)total/workoutDays;
		System.out.println("Total PushUps: "+total);
		System.out.println("Average is: "+average);
	}

}
