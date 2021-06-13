/*
QUESTION::
a. Create a class StringOperation with following member function inside package StringPackage.
  1. boolean isPalindrome(String str): Return true if the input string is palindrome otherwise false
  2. String reverse(String str): Return the reverse form of input string
  3. int length(String str): Return length of input string
  4. String uppercase(String str): Return the uppercase form of input string
*/

package StringPackage;

public class StringOperation{
    String rev = "" ;
    public boolean isPalindrome(String str){
        for (int i= str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);

        }
        if (str.equals(rev)){
            return true;

        }
        else{
            return false;
        }
    }
    public String reverse(String str){
        for (int i= str.length()-1; i==0; i--){
            char ch = str.charAt(i);
            rev = rev + ch;

        }
        return (rev);
    }
    public int length(String str){
        return str.length();
    }
    public String uppercase(String str){
        return (str.toUpperCase());
    }
}
