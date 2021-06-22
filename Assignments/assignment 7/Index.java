
/*
Name : Prashanta parajuli
Roll: 20
QUESTION::
Solve the problem of inheritance discussed in the class.
Problem:
Who knows???

*/
public class Index{
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setName("Bishnu");
        admin.setAddress("Miruwa");
        admin.setPost("Analyst");
        admin.setDept("data-center");
        admin.setW_hours(4);
        System.out.println("Admin Name: "+admin.getName());
        System.out.println("Address: "+admin.getAddress());
        System.out.println("Post: "+admin.getPost());
        System.out.println("Department: "+admin.getDept());
        System.out.println("Working Hours: "+admin.getW_hours());
        System.out.println("\n\n");
        
        Teaching t = new Admin();
        t.setName("Anish");
        t.setAddress("Lakeside");
        t.setPost("Professor");
        t.setDept("YetaUta");
        System.out.println("Teaching  staff name: "+t.getName());
        System.out.println("Address: "+t.getAddress());
        System.out.println("Post: "+t.getPost());
        System.out.println("Department: "+t.getDept());
        System.out.println("\n\n");

        Non_teaching nt = new Admin();
        nt.setName("Amrit");
        nt.setAddress("Paaudur_Ghumti");
        nt.setPost("Manager");
        System.out.println("Non-teaching, Name: "+nt.getName());
        System.out.println("Address: "+nt.getAddress());
        System.out.println("Post: "+nt.getPost());
        System.out.println("\n\n");

        Staff st = new Admin();
        st.setName("Amrita");
        st.setAddress("nadipur");
        st.setPost("Assistant");
        System.out.println("Staff, Name: "+st.getName());
        System.out.println("Address: "+st.getAddress());
        System.out.println("Post: "+st.getPost());

        
    }
}
interface Staff{
   public void setName(String name);
   public String getName();
   public void setAddress(String address);
   public String getAddress();
   public void setPost(String post);
   public String getPost();


}
interface Non_teaching extends Staff{

}
interface Teaching extends Staff{
    public void setDept(String dept);
    public String getDept();
}
class Admin implements Non_teaching, Teaching{
    private String name, address, post, dept;
    private int w_hours;
    public void setW_hours(int w_hours) {
        this.w_hours = w_hours;
    }
    public int getW_hours() {
        return w_hours;
    }
    public void setAddress(String address) {
        this.address = address;
        
    }
    
    public String getAddress() {
        
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getDept() {
        return dept;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public String getPost() {
        return post;
    }
}
