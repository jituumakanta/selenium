package programs;

/**
 * Created by jitu on 5/1/2017.
 */
public class factorialofno {

    public static void main(String[] args){
        int a=5;
        int result=1;
        int j;
        for( j=a;j>0;j--){
             result=a*j-1;
            a=result;
            System.out.println(result);
        }
        System.out.println(result);

    }
}
