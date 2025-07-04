public class Practice_27 {
    public static void main(String[] args) {

        int[] marks = {78, 89, 65, 96, 93};

        int max = max(marks);
        System.out.println(max);
    }


    int min = 0;

    static int max(int[] marks) {
        int max = marks[0];

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > max)
                max = marks[i];
        }
        return max;
    }
}





