package others;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by jitu on 9/6/2017.
 */
public class maxkey {
    public static void main (String args[]){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("hh",39369);
        map.put("ll", 90);
        map.put("lj", 56);
        map.put("i", 393);
        System.out.println("Values before remove: "+ map);
        //Map.Entry<Integer,String > maxEntry =  getMaxEntry(map);
        Object maxEntry1 = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        String a= String.valueOf(maxEntry1);
        System.out.println("maxEntry = " + a);
        System.out.println( getKey(map,a));
    }



    public static String getKey(Map<String, Integer> mapref, String value) {
        String key = "";
        for (Map.Entry<String, Integer> map : mapref.entrySet()) {
            if (map.getValue().toString().equals(value)) {
                key = map.getKey();
            }
        }
        return key;
    }
}
