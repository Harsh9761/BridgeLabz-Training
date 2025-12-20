
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int peoples[] = new int[people];
        for(int i = 0;i<people;i++){
            peoples[i] = sc.nextInt();
            if(peoples[i]>=18){
                System.out.println("The student with the age "+peoples[i]+ " can vote");
            }
            else{
                System.out.println("The student with the age "+peoples[i]+ " can not vote");
            }
        }
    }
}
