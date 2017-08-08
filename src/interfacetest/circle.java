package interfacetest;

/**
 * Created by jitu on 4/30/2017.
 */
public class circle  {
//    @Override
//    public void shape() {
//        System.out.println("circle implements from shape");
//    }

    public void test5(){
        shape s= new shape() {
            @Override
            public void shape() {
                System.out.println("hello");
            }
        };
        ddd(s);

    }

    public void ddd(shape s) {

    }

}
