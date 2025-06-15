public class Practice_6
{
    public static void main(String[] args) {

        int marks=30;


        String Grade= (marks>=90) ? "A+"
                     :(marks>=80) ? "A"
                    : (marks>=60) ? "B"
                    : (marks<=40) ? "C" :"Fail" ;

        System.out.println(Grade);
    }
}
