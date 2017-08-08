package interfacetest;

/**
 * Created by jitu on 4/30/2017.
 */
public class test {

    int a = 8;

    public static void main(String[] arg) {
        //System.out.println(a);
        test t=new test();
        t.ddd();
        t.aa();

    }

    public void ddd(){
        System.out.println(a);
        shape s = new shape() {
            @Override
            public void shape() {
                 a = 9;
                System.out.println(a);
            }
        };
        s.shape();

    }
    public void aa(){
        System.out.println(a);
    }
}
