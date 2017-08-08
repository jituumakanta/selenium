package programs;

/**
 * Created by jitu on 5/2/2017.
 */
public class facterialofno1 {

    public static void main(String[] args){
        int first=1;
        for(int i=1;i<6;i++){
            int result=first*i;
            first=result;
            System.out.println(result);
        }

    }
}
