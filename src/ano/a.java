package ano;

/**
 * Created by jitu on 6/5/2017.
 */
public class a implements b {
    public a(b obj) {
        obj.draw(10);
    }

    @Override
    public void draw(int a) {
        System.out.println("overide method");
    }

    public static void main(String[] args) {
        b obj=new b() {
            @Override
            public void draw(int a) {
                System.out.println("anonymous class");
            }
        };
        
        a obj1=new a(obj);
       
    }
}
