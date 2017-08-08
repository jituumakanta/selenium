package abstractclasstest;

/**
 * Created by jitu on 5/3/2017.
 */
public abstract class parentabstractclass {

    private int a;

    public parentabstractclass(int b) {
        a = 0;
        System.out.println("constructer");
    }

    public abstract void method1();

    public void method2() {
        System.out.println("method2");
    }

    private void method3() {
        System.out.println("method3");
    }
}
