import java.util.Scanner;

public class Practice_16
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number =");
        int i= scanner.nextInt();

        switch(i)
        {

            case 1:
           System.out.println("This is monday");
           break;
            case 2:
                System.out.println("This is tuesday");
                break;

            case 3:
                System.out.println("This is wednesday");
                break;

            case 4:
                System.out.println("This is thursday");
                break;

            case 5:
                System.out.println("This is friday");
                break;

            case 6:
                System.out.println("This is saturday");
                break;

            case 7:
                System.out.println("This is sunday");
                break;

            default:
                System.out.println("This is none of day");
        }



    }
}
