package innerclasstest;

/**
 * Created by jitu on 5/25/2017.
 */
public class class2 {

    public static void main(String args[]) {
        class1 inner = new class1() {

            public void mymethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        //inner.mymethod();
    }
}
