import java.util.Scanner;

public class Practice_13
{
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number1 =");
        int a= scanner.nextInt();

        System.out.println("Enter the number2 =");

        int b= scanner.nextInt();

        int add;
        int sub;
        int mul;
        int div;
        int per;

        System.out.println("Addition is = " +(a+b));
        System.out.println("Subtraction is =" +(a-b));
        System.out.println("Multiplication is =" +(a*b));
        System.out.println("Division is =" +(a/b));
        System.out.println("Percentage is =" +(a%b));

    }
}
