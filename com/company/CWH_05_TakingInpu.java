import java.util.Scanner;

public class CWH_05_TakingInpu {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println(" i am here");
        int a = sc.nextInt();
    
        int b = sc.nextInt();
        int sum = a*b/a-b;
        System.out.println(sum);



    }
}