import java.util.Scanner;

public class practical3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers::: ");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println(a + " is  largest");
        }
        else if (b>c && b>a){
            System.out.println(b + " is largest");
        }
        else{
            System.out.println(c + " is largest");
        }
        sc.close();
    }
    
}
