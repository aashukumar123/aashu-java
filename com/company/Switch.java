import java.util.Scanner;
class Switch
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        char Button = sc.next().charAt(1);
        
        switch(Button){
            case 'A' : System.out.println(" how are u");
              break;
        
            case 'b' : System.out.println("you are fine");
                break;
            
            case 'g' : System.out.println("yes i am already fine");
                break;
            
            default:System.out.println("yah this is good news to see u");

            
            


        }
    }
}