import java.util.Scanner;

public class Practice_9
{
    public static void main(String[] args)
    {
        int side1 ;

        int side2;
        int side3;


        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the side1 =");
        side1= scanner.nextInt();

        System.out.println("Enter the side2 =");
        side2= scanner.nextInt();

        System.out.println("Enter the side3 =");
        side3= scanner.nextInt();




        if (side1==side2 && side2==side3)
        {
            System.out.println("This is Equilateral Triangle");
        }
else if(side1==side2 || side2==side3 || side1==side3)
    {
            System.out.println("This is Isoceles Triangle");
        }
else {
            System.out.println("Not defined");
        }
    }
}
