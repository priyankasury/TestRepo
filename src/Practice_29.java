import java.util.Scanner;

public class Practice_29
{
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int size=scanner.nextInt();

        int[] array= new int[size];


        for(int i=0; i<size;i++)
        {
            System.out.println("Enter the numbers =");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements=");
        for (int i=0; i<size;i++)
        {
            System.out.println(array[i]);
        }

    }
}
