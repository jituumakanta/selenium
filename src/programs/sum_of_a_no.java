package programs;

/**
 * Created by jitu on 5/3/2017.
 */
public class sum_of_a_no {
    public static void main(String[] args) {
        int no = 407;
        int startsum = 0;
        int after;
        int sum;

        do {
            int reminder = no % 10;
            sum = startsum + reminder;
            startsum = sum;
            after = no / 10;
            no = after;
        } while (after > 0);

        System.out.println(sum);

    }
}
