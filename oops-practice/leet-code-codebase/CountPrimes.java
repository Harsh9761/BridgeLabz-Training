
public class CountPrimes {
	public static void main(String args[]) {
		int n = 10;
		System.out.println(checkprime(n));
	}
	public static int checkprime(int n) {
		boolean prime[] = new boolean[n+1];
        int c = 0;
		prime[0]=true;//not prime
		prime[1]=true;//not prime
		for(int i = 2;i*i<prime.length;i++) {
			if(prime[i]==false) {//prime
				for(int j = 2;i*j<prime.length;j++) {
					prime[i*j] = true;
				}
				
			}
		}
		for(int i = 2;i< prime.length-1;i++) {
			if(prime[i]==false) {
				c++;
			}
		}
        return c;
        
    }
}
