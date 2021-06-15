/*
QUESTION:::
Instructions
A company needs to keep record of its following Employees:
    i) Manager      ii) Supervisor
The record requires name and salary of both employees. In addition, it also requires section_name (i.e. name of
section, example Accounts, Marketing, etc.) for the Manager and group_id (Group identification number, e.g.
205, 112, etc.) for the Supervisor. Design classes for the above requirement. Each of the classes should have a
function called set() to assign data to the fields and a function called get() to return the value of the fields. Write
a main program to test your classes. What form of inheritance will the classes hold in this case?
ANS : Hierarchical inheritance.
*/

import java.util.*;
public class Index{
    public static void main(String[] args) {
        String post = "";
        String sect = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of employee: ");        
        String name = scan.nextLine();
        System.out.println("Enter the salary: ");
        double salary = scan.nextDouble();
        Employees emp = new Employees();
        emp.setName(name);
        emp.setSalary(salary);
        Manager m = new Manager();
        Supervisor s = new Supervisor();
        System.out.println("select the post(1/2)::");
        System.out.println("\t1.Manager");
        System.out.println("\t2.Supervisor");
        char ch = scan.next().charAt(0);
        if (ch=='1'){       //y'll know the switch case, right??
            post = "Manager";
            System.out.println("Select section:");
            System.out.println("\t1.Accounting");
            System.out.println("\t2.Marketing");
            char sel = scan.next().charAt(0);
            switch (sel) {
                case '1':
                    sect = "Accounting";
                    break;
                case '2':
                    sect = "Marketing";
                    break;
                default:
                    break;
            }
            m.manager_data(name, salary, post, sect);
            m.display();
        }
        else{
            post = "Supervisor";
            System.out.println("Enter group ID:");
            double groupID = scan.nextDouble();
            s.super_data(name, salary, post, groupID);
            s.super_display();
        }
        
        scan.close();
    }
}
class Employees{
    protected String name;
    protected double salary;
    Scanner sc = new Scanner(System.in);
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Manager extends Employees{
    private String section_name, post;
    public void manager_data(String name, double salary, String post, String section_name){
        this.name = name;
        this.salary = salary;
        this.post = post;
        this.section_name = section_name;
    }
    
    public void display() {
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+post);
        System.out.println("Section : "+section_name);
    }
}

class Supervisor extends Employees{
    private double groupID;
    private String post;
    public void super_data(String name, double salary, String post, double groupID){
        this.name = name;
        this.salary = salary;
        this.post = post;
        this.groupID = groupID;
    }
    
    public void super_display() {
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+post);
        System.out.println("GroupID : "+groupID);
    }
}
