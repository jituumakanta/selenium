package programs;

/**
 * Created by jitu on 5/3/2017.
 */
public class sum_of_a_no_using_recurtion {


    public static void main(String[] args) {
        System.out.println(sumofno(5496));
    }

    static int sumofno(int no) {
        if (no == 0)
            return 1;
        else
            return ((no % 10) + sumofno(no / 10));
    }
}
