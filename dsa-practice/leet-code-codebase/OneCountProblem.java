
public class OneCountProblem {

	public static void main(String[] args) {
		int n = 10;
		int c = 0;
        while(n>=1){
            if(n%2==1){
                c++;
            }
            n=n/2;
        }
        System.out.println(c);

	}

}
