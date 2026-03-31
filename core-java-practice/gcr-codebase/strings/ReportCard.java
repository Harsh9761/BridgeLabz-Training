import java.util.*;
public class ReportCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students");
		int num = sc.nextInt();
		int pcm[][] = new int[num][3];
		String grade[] = new String[num];
		double average[] = new double[num];
        double percentage[] = new double[num];
		for(int i = 0;i < num;i++) {
			Random r = new Random();
			pcm[i][0] = r.nextInt(51)+50;
			pcm[i][1] = r.nextInt(51)+50;
			pcm[i][2] = r.nextInt(51)+50;
			
			
			average[i] = (pcm[i][0]+pcm[i][1]+pcm[i][2])/3.0;
			percentage[i] = ((pcm[i][0]+pcm[i][1]+pcm[i][2])/300.0)*100.0;
			
			average[i] = Math.round(average[i] * 100.0) / 100.0;
            percentage[i] = Math.round(percentage[i] * 100.0) / 100.0;
            
            if (percentage[i] >= 80)
                grade[i] = "A";
            else if (percentage[i] >= 70)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else
                grade[i] = "F";
		}
		System.out.println("Phy\tChem\tMath\tAvg\t%age\tGrade");
		for(int i = 0;i<num;i++) {
			System.out.println(pcm[i][0]+"\t"+pcm[i][1]+"\t"+pcm[i][2] +"\t"+average[i] + "\t" +percentage[i] + "\t"+grade[i]);
		}
		
	}

}
