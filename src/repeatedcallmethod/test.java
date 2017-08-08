package repeatedcallmethod;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by jitu on 5/3/2017.
 */
public class test {
    public static void main(String[] args){
        Timer t = new Timer();

        t.scheduleAtFixedRate(
                new TimerTask()
                {
                    public void run()
                    {
                        System.out.println("hello");
                    }
                },
                0,      // run first occurrence immediatetly
                2000); //2sec interval
    }
}
