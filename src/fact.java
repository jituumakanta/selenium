import java.io.IOException;

/**
 * Created by jitu on 4/15/2017.
 */
public class fact {
    public static void main(String[] args) throws IOException {
        int n = 5;
        int f=5 ;
        for (int i = n; i > 1; i--) {
            f = f * (i - 1);
           // n = f;
            //n=n-1;
            // f1=f*(n-2);
            //f2=f1*(n-3);

        }
        System.out.println(f);
    }
}
