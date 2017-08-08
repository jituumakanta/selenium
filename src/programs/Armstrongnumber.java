package programs;

/**
 * Created by jitu on 5/3/2017.
 */
public class Armstrongnumber {

    public static void main(String[] args) {
        int no = 407;
        int no1=no;
        int startsum = 0;
        int after;
        int sum;

        do {
            int reminder = no % 10;
            sum = startsum + (reminder * reminder * reminder);
            startsum = sum;
            after = no / 10;
            no = after;


        } while (after > 0);
        if (no1 == sum) {
            System.out.println("yes");
        } else {
            System.out.println("not");
        }
    }
}
