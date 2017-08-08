package programs;

/**
 * Created by jitu on 5/8/2017.
 */
public class fibonacciseries_by_recurtion {
    static int n3 = 0;
    static int n2 = 1;
    static int n1 = 0;

    public static void main(String[] args) {
        fiv(20);
        System.out.println();
    }

    public static int fiv(int no) {
        if (no >0) {


            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            fiv(no - 1);
        }

        return n3;
    }
}
