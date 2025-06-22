import java.util.Scanner;

public class Practice_15
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number1 =");
        int a= scanner.nextInt();;

        System.out.println("Enter the number2 =");
        int b= scanner.nextInt();;

        System.out.println("Enter the number3 =");
        int c= scanner.nextInt();

        int greatest;


        if(a>=b && a>=c) {
            greatest = a;

        }
        else if (b>=a && b>=c)
        {
            greatest=b;
        }
        else
        {
            greatest=c;
        }

        System.out.println("Greatest number =" + greatest);
    }
}
