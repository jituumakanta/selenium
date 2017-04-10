/**
 * Created by jitu on 4/11/2017.
 */

import java.util.*;

class TestCollection2 {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        String[] strings = al.stream().toArray(String[]::new);
        for(int i=0;i<3;i++){
        System.out.println(strings[i]);
        String f=strings[i];
        }

        for (String obj : al) {
            //System.out.println(obj);

        }
    }}