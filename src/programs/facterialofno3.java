package programs;

/**
 * Created by jitu on 5/2/2017.
 */
public class facterialofno3 {
    public static void main(String[] args) {
        int start = 5;
        int result = 1;
        int i = 4;
        do {
            result = start * i;
            start = result;
        }
        while (i > 0);

        System.out.println(result);
    }
}
