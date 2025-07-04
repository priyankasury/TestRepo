import java.util.Arrays;

public class Practice_22_arrays {
    public static void main(String[] args) {

        int[] marks = {89, 98, 56, 84, 94, 59};

        Arrays.sort(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }

        int output = maximum_number(marks);
        System.out.println("Max number is = " +output);



    }

    static int maximum_number(int[] marks) {
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;

    }
}