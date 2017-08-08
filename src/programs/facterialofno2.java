package programs;

/**
 * Created by jitu on 5/2/2017.
 */
public class facterialofno2 {
    public static void main(String[] arg){
        int first=5;
        int result=1;
        for(int i=4;i>0;i--){
             result=first*i;
            first=result;
        }
        System.out.println(result);

    }
}
