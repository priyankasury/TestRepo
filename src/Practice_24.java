public class Practice_24 {
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);
    }
}


