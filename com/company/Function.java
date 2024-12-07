import java.util.Scanner;

public class Function {
    public static int caculatingthevalue(int a, int b) {
        int mul = a*b;
        return mul;

        
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();    
        int mul = caculatingthevalue(a, b);
     {
        System.out.println("the of these number will be  : " + mul);
     }
    }
    
}
