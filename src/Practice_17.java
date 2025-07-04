import java.util.Scanner;

public class Practice_17
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number1 =");

        int a = scanner.nextInt();

        System.out.println("Enter the number2 =");
        int b = scanner.nextInt();

        System.out.println("Enter the number3 =");

        int c =scanner.nextInt();

        int smallest;

        if(a<=b && a<=c)
        {
            smallest=a;

        } else if (b<=a && b<=c)
        {
            smallest=b;
        }
        else {
            smallest=c;
        }

        System.out.println("This is the smallest number =" + smallest);
    }
}
