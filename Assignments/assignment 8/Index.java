/*
Assignment:8
Name: 
Roll no: 
Instructions
An array is called balanced if it’s even numbered element a[0], a[2]… etc. are all even and its odd numbered
element a[1], a[3]… etc are all odd. Write a function named isBalanced that accepts an array of interger and
returns 1 if the array is balanced otherwise it returns 0.
*/
import java.util.*;
class Index{
    public static void main(String[] args) {
    int num[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter five numbers: ");
    for(int i=0;i<5;i++){
        num[i]= sc.nextInt();
    }
    checkNum cn = new checkNum();
    cn.setNum(num);
    int result = cn.isBalance();
    if (result==0)
        System.out.println("\nArray is balanced✅!!\n");
    else
        System.out.println("Not a balanced array❌!!\n");
    sc.close();
    }
}
class checkNum{
    int num[];
    public void setNum(int num[]) {
        this.num=num;
    }
    public int isBalance(){
        int val=0;
        for(int i=0;i<num.length;i++) {
            if(i%2==0){
                if(num[i]%2==1){
                    val = 1;
                }
            }
            else {
                if(num[i] % 2 == 0){
                    val = 1;
                }
            }
        }
        return val;
    }
}
