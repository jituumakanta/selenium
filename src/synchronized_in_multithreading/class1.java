package synchronized_in_multithreading;

/**
 * Created by jitu on 5/6/2017.
 */
public class class1 extends Thread{
    executeclass obj;
    public class1(executeclass obj) {
        this.obj=obj;
    }

    public void run(){
        /*for(int i=1;i<11;i++ ){
            System.out.println("firstclass"+i);
        }*/
        obj.method();
    }
}
