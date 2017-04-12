import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jitu on 4/12/2017.
 */
public class jsontest {
    //JSONObject obj;
    //static jsontest1 f;
    public static void main(String args[]) {
/*
        JSONObject obj=new JSONObject();
        obj.put("name","sonoo");
        obj.put("age",new Integer(27));
        obj.put("salary",new Double(600000));

        JSONArray arr = new JSONArray();
        arr.add(obj);
        arr.add(new Integer(27));
        arr.add(new Double(600000));

        JSONObject obj1=new JSONObject();
        obj1.put("nameeeeee",arr);

        System.out.print(obj1);*/



/*

        JSONObject obj=new JSONObject();
        obj.put("name","sonoo");
        obj.put("age",new Integer(27));
        obj.put("salary",new Double(600000));

        JSONObject obj3=new JSONObject();
        obj3.put("name","mmk");
        obj3.put("age",new Integer(27));
        obj3.put("salary",new Double(600000));

        JSONObject obj2=new JSONObject();
        obj2.put("name","jjjjj");
        obj2.put("age",new Integer(27));
        obj2.put("salary",new Double(600000));

        JSONArray arr = new JSONArray();
        arr.add(obj);
        arr.add(obj3);
        arr.add(obj2);

        JSONObject obj1=new JSONObject();
        obj1.put("nameeeeee",arr);

        System.out.print(obj1);
*/
       /* JSONArray arr = new JSONArray();
        ArrayList a = new ArrayList();
        for (int i = 0; i < 10; i++) {


            JSONObject obj = new JSONObject();
            obj.put("name", "sonoo");
            obj.put("age", new Integer(27));
            obj.put("salary", new Double(600000));
            a.add(obj);

            //arr.add(obj);
            for (Object s : a) {
                arr.add(obj);
            }
        }


        JSONObject obj1 = new JSONObject();
        obj1.put("nameeeeee", arr);*/



        /*for (int i = 1; i < 5; i++) {
            JSONObject m=new JSONObject();
            m.put("name", "sonoo");
            m.put("age", new Integer(27));
            m.put("salary", new Double(600000));


            JSONObject m1=new JSONObject();
            m1.put("name", "ghhhhhhhhh");
            m1.put("age", new Integer(87));
            m1.put("salary", new Double(600000));

            JSONArray arr = new JSONArray();
            arr.add(m);
            arr.add(m1);

        }*/


        JSONArray arr = new JSONArray();
        String s[]={"aa","ss","ff","tt","gg","ag"};
        for (int i = 1; i < 5; i++) {
            JSONObject m=new JSONObject();

            m.put("name", s[i]);
            m.put("age", new Integer(27));
            m.put("salary", new Double(600000));

            arr.add(m);


        }
        System.out.println(arr);





    }


   /* public void t(){
        new JSONObject();
        obj.put("name","sonoo");
        obj.put("age",new Integer(27));
        obj.put("salary",new Double(600000));
        System.out.print(obj);
    }*/
}
