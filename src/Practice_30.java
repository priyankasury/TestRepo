public class Practice_30
{
    public static void main(String[] args) {

        int[] a={87,65,59,94,70};

        for (int i=0;i<5;i++){
            System.out.println(a[i]);
        }

        System.out.println("Reversed array =");
        for (int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }

    }
}
