import java.util.Scanner;
class Conditional

{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        
        if(x==y)
        {
            System.out.println("equal");

        }else if(x>y)
            {
                System.out.println(" x greater than");

            }else{
                System.out.println("less than");
            }
        
    }
}