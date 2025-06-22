import java.util.Scanner;

public class Practice_14
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        int i =scanner.nextInt();
        if(i>0)
        {
            System.out.println("Given number is positive");
        }
else if(i<0)
        {
            System.out.println("Given number is negative");
        }
else{
            System.out.println("Given number is zero");
        }

    }
}
