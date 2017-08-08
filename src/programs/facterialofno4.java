package programs;

/**
 * Created by jitu on 5/2/2017.
 */
public class facterialofno4 {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }

    static public int fact(int no) {


        if (no == 0)
            return 1;
        else
            return (no * fact(no - 1));
    }

}
