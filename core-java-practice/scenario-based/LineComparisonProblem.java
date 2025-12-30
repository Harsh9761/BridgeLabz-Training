
public class LineComparisonProblem {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		
		double x1 = 5;
		double y1 = 6;
		double x2 = 7;
		double y2 = 10;
		
		double x3 = 5;
		double y3 = 8;
		double x4 = 7;
		double y4 = 11;
		
		Double line1Length = getLength(x1,y1,x2,y2);
		Double line2Length = getLength(x3,y3,x4,y4);
		
		boolean isEqual = checkEqual(line1Length,line2Length);
		if(isEqual) {
			System.out.println("Both Lines are Equal");
		}
		compareLines(line1Length,line2Length);
		

	}
	
	//Use Case 1
	public static Double getLength(double x1,double y1,double x2,double y2) {
		double diff1 = x2 - x1;
		double diff2 = y2 - y1;
		return Math.sqrt(Math.pow(diff1, 2)+Math.pow(diff2, 2));
	}
	
	//Use Case 2
	public static boolean checkEqual(Double line1Length,Double line2Length) {
		return line1Length.equals(line2Length);
	}
	
	//Use Case 3
	public static void compareLines(Double line1Length,Double line2Length) {
		int result = line1Length.compareTo(line2Length);
		if(result > 0) {
			System.out.println("Line 1 is greater than Line 2");
		} else if(result < 0) {
			System.out.println("Line 1 is lesser than Line 2");
		} else {
			System.out.println("Both Lines are Equal");
		}
	}

}
