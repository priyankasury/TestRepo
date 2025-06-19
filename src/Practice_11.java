import java.util.Scanner;

public class Practice_11
{
    public static void main(String[] args)
{
  //  int leapyear;
    int input;

    Scanner scanner =new Scanner (System.in);
    System.out.println("Enter the year =");

    input= scanner.nextInt();

    if(input%4==0)
    {
        System.out.println("This is leap year");
    } else if (input%400==0)
    {
        System.out.println("This is leap year");

    }
    else
    {
        System.out.println("This is not leap year");
    }
    {

    }

}
}
