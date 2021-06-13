/*
QUESTION::
a. Create a class StringOperation with following member function inside package StringPackage.
  1. boolean isPalindrome(String str): Return true if the input string is palindrome otherwise false
  2. String reverse(String str): Return the reverse form of input string
  3. int length(String str): Return length of input string
  4. String uppercase(String str): Return the uppercase form of input string
*/
import java.util.*;
import StringPackage.StringOperation;
public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringOperation so = new StringOperation();
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        if (so.isPalindrome(str)==true){
            System.out.println("String is palindrome!!✅");
        }
        else {
            System.out.println("Not Palindrome!!❌");
        }
        System.out.println("Reversed string: " +so.reverse(str));
        System.out.println("Length of string: "+so.length(str));
        System.out.println("Uppercased string: "+so.uppercase(str));
        scan.close();
    }
}
