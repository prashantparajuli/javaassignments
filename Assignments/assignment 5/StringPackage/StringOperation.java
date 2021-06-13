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