package programs;

import java.io.IOException;

/**
 * Created by jitu on 4/14/2017.
 */
public class fibonacci {


    public static void main(String[] args) throws IOException {
        int no=3;
        int first=1;
        int second=2;
        for(int i=1;i<10;i++){
            int third=first+second;
            first=second;
            second=third;
            if(no==third){
                System.out.println(no);
                break;
            }
            else {
                if(i==9) {
                    System.out.println("not");
                   // break;
                }
            }

        }



    }

}
