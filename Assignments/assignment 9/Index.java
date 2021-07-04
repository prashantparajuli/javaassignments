/*
Name: 
Assignment 9
Question: Create a custom exception class that validates input name whose length must be at least 3 
characters.
*/
import java.util.*;
public class Index {
    public static void main(String[] args) throws Name_exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        sc.close();
        try {
            if (name.length() < 3){
                throw new Name_exception("Name must contain at least 3 letters");    
            }  
            System.out.println("Name: "+name+" is valid ✅");  
        } catch (Name_exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class Name_exception extends Exception{
    public Name_exception(String msg) {
        super(msg);
    }
}