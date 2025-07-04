public class Practice_28
{
    public static void main(String[] args) {
        int[] a={87,67,97,50,64};
        int min=min(a);
        System.out.println(min);
    }
    static int min(int[] a)
    {
        int min=a[0];
        for(int i=0; i< a.length;i++)
        {
            if(a[i]<min)

                min=a[i];
        }
        return min;
    }
}


