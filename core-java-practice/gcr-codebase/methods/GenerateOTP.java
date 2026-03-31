import java.util.*;
public class GenerateOTP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int otpArr[] = new int[10];
		for(int i = 0;i<10;i++) {
			otpArr[i] = generateOtp();
		}
		for(int i = 0;i < 10;i++) {
			System.out.println(otpArr[i]);
		}
		System.out.println("All OTPs are unique or not: " + areOTPsUnique(otpArr));

	}
	public static int generateOtp() {
		int otp = (int)(Math.random()*900000)+100000;
		return otp;
	}

	public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
