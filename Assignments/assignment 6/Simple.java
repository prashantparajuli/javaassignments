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
//Save this as Simple.java AYE🔥
public class Simple {
    public static void main(String[] args) {
        Manager_1 manager = new Manager_1();
        SuperVisor sv = new SuperVisor();
        manager.set("Anish", 200, "Account");
        sv.set("Amrit", 150, 101);
        System.out.println("Name of manager: "+manager.getName()+"\nSalary: "+manager.getSalary()+"\nSection: "+manager.getSection_name()+"\n\n");
        System.out.println("Name of manager: "+sv.getName()+"\nSalary: "+sv.getSalary()+"\nSection: "+sv.getGroup_ID()+"\n\n");

    }
}
class Employee{
    protected String name;
    protected double salary;
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void set(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
class Manager_1 extends Employee{
    private String section_name;
    public String getSection_name() {
        return section_name;
    }
    public void set(String name, double salary, String section_name) {
        this.name = name;
        this.salary = salary;
        this.section_name = section_name;
    }
}
class SuperVisor extends Employee{
    private int group_ID;
    public int getGroup_ID() {
        return group_ID;
    }
    public void set(String name, double salary, int group_ID){
        this.name = name;
        this.salary = salary;
        this.group_ID = group_ID;
    }
}
