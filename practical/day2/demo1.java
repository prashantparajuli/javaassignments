//Wap to chceck if the input number is positive negative or zero
import java.util.Scanner;
public class demo1{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if (num > 0 ){
            System.out.println("Number is positive...");
        }
        else if (num<0){
            System.out.println("Number is negative...");

        }
        else {
            System.out.println("Number is zero...");
        }


        sc.close();
    }
}
