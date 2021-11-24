//Program to find the sum of two matrices
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        int[][] num1 = new int[3][3];
        int[][] num2 = new int[3][3];
        int[][] sum = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrix elements:: ");
        for (int i=0; i<3; i++ ){
            for (int j = 0; j<3; j++){
                num1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter second matrix elements:: ");
        for (int i=0; i<3; i++ ){
            for (int j = 0; j<3; j++){
                num2[i][j]= sc.nextInt();
            }
        }
        for (int i=0; i<3; i++ ){
            for (int j = 0; j<3; j++){
                sum[i][j] = num1[i][j] + num2[i][j];
                System.out.println("Sum : " +sum[i][j]);
            }
        }
        sc.close();
    }
}
