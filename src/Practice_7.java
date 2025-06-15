public class Practice_7
{
    public static void main(String[] args)
    {
        /*int a = 5;

        int b = a++;

        System.out.println("a: " + a + ", b: " + b);


        int i = 1;

        i = i++ + ++i;

        System.out.println(i);


        int x = 5;
         System.out.println(x++ + ++x);


        int x = 5;

        System.out.println(++x);

        System.out.println(x++);

        System.out.println(x);


        int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
*/
        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y);
    }
}
