/*
WAP to input a number and find the sum of even digits in that number.
*/
import java.util.*;
public class Sum {
 public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = mySc.nextInt();
        getSum gs = new getSum();
        gs.setNum(num);
        System.out.println("Sum of even numbers:" + gs.findSum());
        mySc.close();
    }
}
class getSum{
    private int num;
    public void setNum(int num){
        this.num = num;
    }
    public int findSum()
    {
        int sum = 0;
        while (num !=0){
            int n = num % 10;
            if (num%2 == 0){
                sum = sum + n;
            }
            num = num / 10;
        }
        return sum;
    }
}


