package javabeantest;

/**
 * Created by jitu on 6/16/2017.
 */
public class bank {
    static bean obj;
    public static void main(String[] args){
        obj=new bean();
        obj.setA(4);
        sbi a=new sbi();
        System.out.println(a.output());
    }

}
