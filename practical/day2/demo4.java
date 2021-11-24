
// Java program to check if given number is palindrome or not
import java.util.Scanner;


public class demo4 {
    public static void main(String[] args) {
        int num, rev, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :: ");
        num = sc.nextInt();
        int temp = num;
        while (num>0){
            rev = num % 10;
            sum = (sum*10) + rev;
            num = num/10;

        }
        if (temp == sum){
            System.out.println("Number is palindrome");
        }    
        else{
            System.out.println("Not pallindrome");
        }
            
        sc.close();
    }
}
