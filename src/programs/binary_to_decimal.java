package programs;

import static java.lang.StrictMath.abs;

/**
 * Created by jitu on 5/6/2017.
 */
public class binary_to_decimal {
    public static void main(String[] args) {

        int no = 10011011;
        float start = 0;
        int i = 0;
        do {
            int r = no % 10;
            float sum = start + (r * power1(2, i));
            //System.out.println(sum);
            no = no / 10;
            i++;
            start = sum;
            System.out.println(power1(-2, -1));
        }
        while (no > 0);
    }

    public static float power1(int no, int power) {
        float start = 1;
        float total = 1;
        if (power > -1) {
            for (int i = 0; i < power; i++) {
                total = start * no;
                start = total;
            }
        } else {
            power = -1 * power;
            for (int i = 0; i < power; i++) {
                total = start * no;
                start = total;
            }
            total = 1 / total;

        }

        return total;
    }
}
