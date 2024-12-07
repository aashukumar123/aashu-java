
import java.util.Scanner;
public class Odd {
    public static int printoddeven(int n)
     {
        int sum=0;
        {
     System.out.println("enter a range");
        return sum;
        
        
        
     if(n % 2==0)
   
     {
        for(int i=1;i<=n;i=i+2)
        {
            sum=sum+i;
        }
        System.out.println("even number :"+ sum);

    

    }else {

        for(int i = 1; i<=n;i=i+2)
        {
            sum=sum+i;
        }
        
        
        System.out.println("odd number :"+ sum);
    } 
        }
     }
    
        

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
         
        int sum = printoddeven(n);
        
          
        System.out.println(printoddeven(n));
        }
    }





    

    





      


