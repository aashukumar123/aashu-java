import java.util.Scanner;
public class Average {
    public static int printaverage(int a,int b,int c)
     {
        
        int avg =  a+b+c/3;
        return avg;

        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner( System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       int avg = printaverage(a, b, c);
       System.out.println("the average value :"  +avg);
    }


    
}
