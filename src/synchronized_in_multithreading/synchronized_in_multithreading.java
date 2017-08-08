package synchronized_in_multithreading;

/**
 * Created by jitu on 5/6/2017.
 */
public class synchronized_in_multithreading {
    public static void main(String[] args){
        executeclass obj=new executeclass();
        class1 obj1=new class1(obj);
        class2 obj2=new class2(obj);
        obj1.start();
        obj2.start();

    }
}
