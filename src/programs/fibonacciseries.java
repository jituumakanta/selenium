package programs;

/**
 * Created by jitu on 5/8/2017.
 */
public class fibonacciseries {
    public static void main(String[] args){
        long first=1;
        long second=0;
        for(int i=1;i<50;i++){
            long sum=first+second;
            second=first;
            first=sum;

            System.out.println(sum);


        }
    }
}
