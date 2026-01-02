import java.util.*;
public class TwoDArrayAddition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        System.out.println("Enter array 1 elements: ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int arr2[][] = new int[3][3];
        System.out.println("Enter array 2 elements: ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int ans[][] = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                ans[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println();
        System.out.println("Array 1 elements: ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Array 2 elements: ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Result array elements: ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
