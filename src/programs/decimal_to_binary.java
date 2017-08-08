package programs;

/**
 * Created by jitu on 5/7/2017.
 */
public class decimal_to_binary {
    public static void main(String[] args) {
        int no = 15908;
        int i = 0;
        long sum = 0;
        do {
            int binary = no % 2;
           // System.out.println(binary);
            sum = sum + (binary * (power1(10, i)));
            no = no / 2;
            i++;
          //  System.out.println(sum);
        } while (no > 0);
        System.out.println(sum);
    }

    public static long power1(int no, int power) {
        long start = 1;
        long total = 1;
        if (power > -1) {
            for (int i = 0; i < power; i++) {
                total = start * no;
                start = total;
            }
        }

        return total;
    }
}
