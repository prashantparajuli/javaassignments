import java.util.Scanner;

public class practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle::");
        int len = sc.nextInt();
        System.out.println("Enter Breadth::");
        int bre = sc.nextInt();
        int area = len*bre;
        int circ = 2 * (len + bre);
        System.out.println("Area is ::: "+area);
        System.out.println("Circumference is ::: "+circ);
        sc.close();

    }
}
