import java.util.Scanner;

public class Practice_12
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the integer =");
        int a = scanner.nextInt();
        System.out.println("Integer = " +a);

        System.out.println("Enter the double =");
        double b = scanner.nextDouble();
        System.out.println("Double =" +b);

        System.out.println("Enter the boolean =");
        boolean c = scanner.nextBoolean();
        System.out.println("Boolean =" +c);

        System.out.println("Enter the character =");
        char ch= scanner.next().charAt(0);
        System.out.println("Character =" +ch);


    }
}
