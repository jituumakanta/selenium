package abstractclasstest;

/**
 * Created by jitu on 5/3/2017.
 */
public class extended_classof_abstract_class extends parentabstractclass {

    public extended_classof_abstract_class(){
        super(8);
    }

    @Override
    public void method1() {
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2.2");
    }
    public static void main(String[] args){
      /*  parentabstractclass obj=new parentabstractclass() {
            @Override
            public void method1() {
                System.out.println("method1.1");
            }
        };*/
        parentabstractclass obj1=new extended_classof_abstract_class();
        obj1.method2();

    }

}
