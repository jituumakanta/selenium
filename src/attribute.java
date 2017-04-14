/**
 * Created by jitu on 3/29/2017.
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.StringWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by volmopc1 on 29-03-2017.
 */
public class attribute {

    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("http://www.shopclues.com/search?q=computer&sc_z=4444&z=1").userAgent("Mozilla/5.0 (Windows NT 6.2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.69 Safari/537.36")
                .maxBodySize(0)
                .get();

       // System.out.println(document);
        Elements links = document.select("body");
        int i = 1;
        HashMap<Integer, String> hs = new HashMap();
        Map<String, Integer> result = new TreeMap<String, Integer>();
        HashSet<String> set2 = new HashSet<>();
        HashSet<String> set3 = new HashSet<>();
        HashSet<String> set4 = new HashSet<>();

        //ADDING TOTAL ATTRIBUTE IN HASHMAP
        for (Element e : links) {
            //System.out.println(e);
            Elements at = e.getAllElements();
            for (Element e1 : at) {
                Attributes at1 = e1.attributes();
                String ff = at1.toString();
               // System.out.println(e1);
                if (ff != null && !ff.trim().isEmpty() && !ff.equals("")) {
                    hs.put(i, ff);
                }
                i++;
            }
        }




        //GETTING HOWMANY SAME ATTRIBUTES IN THE DOCUMENT
        for (Map.Entry m : hs.entrySet()) {
            String value = (String) m.getValue();
            Integer count = result.get(value);
            //System.out.println(value+count);
            if (count == null)
                result.put(value, new Integer(1));
            else
                result.put(value, new Integer(count + 1));

        }


        result.values().removeAll(Collections.singleton(1));
        result.values().removeAll(Collections.singleton(2));
        result.values().removeAll(Collections.singleton(3));
        result.values().removeAll(Collections.singleton(4));
        result.values().removeAll(Collections.singleton(5));


        for (Map.Entry m1 : result.entrySet()) {
            // int occurance = (int) m1.getValue();
            String attribute = (String) m1.getKey();
            Elements ell1 = document.getElementsByAttributeValue(attributename(attribute), attributevalue(attribute));//.....PASSING ATTRIBUTE AND ATTRIBUTE VALUE  TO GET ALL THE ELEMENTS
            for (Element so : ell1) {
                if (isSiblingsAttributeValueSame(so) == true && hasChild(so) == true&& hasAHref(so) == true && hasImgSrc(so) == true && so.hasText() == true) {
                    set2.add(attribute);
                }
            }
        }

        System.out.println(set2);
        System.out.println(set3);
       /* String[] strings = set2.stream().toArray(String[]::new);
        for(int i5=0;i5<1;i5++){
            System.out.println(strings[i5]);
            String f=strings[i5];

            Elements ell = document.getElementsByAttributeValue(attribute.attributename(strings[i5]), attribute.attributevalue(strings[i5]));
            JSONArray arr = new JSONArray();
            for (Element at : ell) {
                if (attribute.hasAHref(at) == true && attribute.hasImgSrc(at) == true && at.hasText() == true) {

                    Elements links1 = at.getElementsByTag("a");
                    for (Element link : links1) {
                        String linkHref = link.attr("abs:href");
                        System.out.println(linkHref);
                        String linkText = link.text();
                        System.out.println(linkText);

                        JSONObject m=new JSONObject();
                        m.put("name", linkHref);
                        m.put("text", linkText);
                        arr.add(m);
                    }
                    Elements links2 = at.getElementsByTag("img");
                    for (Element link : links2) {
                        String linkHref = link.attr("src");
                        System.out.println(linkHref);
                    }

                    System.out.println("+++++++++++++++++++++++");
                }
            }
            System.out.println(arr);
        }*/

    }

















    public static String attributename(String s) {
        String subString1 = null;
        String subString = "noo";
        int iend = s.indexOf("=");
        if (iend > 0) {
            subString = s.substring(0, iend);
        }
        if (!subString.equals("") && !subString.trim().isEmpty() && !subString.equals(null)) {
            subString1 = subString;
        } else {
            subString1 = "noo";
        }
        // System.out.println(subString1.length());
        return subString1;
    }

    public static String attributevalue(String s) {
        String attvalue = "noAttributeValue";
        String attvalue1 = "noAttributeValue";
        Pattern p = Pattern.compile("\"([^\"]*)\"");
        Matcher m = p.matcher(s);
        if (m.find()) {
            attvalue = m.group(1);
        }
        if (!attvalue.equals("") && !attvalue.trim().isEmpty() && !attvalue.equals(null)) {
            attvalue1 = attvalue;
        }
        return attvalue1;
    }

    public static boolean hasChild(Element e)  {
        boolean b;
        ArrayList al = new ArrayList();

        Elements children = e.children();
        for (Element child : children) {
            al.add(child);
            // System.out.println(child);
            // System.out.println("+++++++");


        }


        if (al.isEmpty() == true) {
            b = false;
            // System.out.println("empty");
        } else {
            b = true;
            // System.out.println("not empty");
        }

        //System.out.println(b);
        return b;


    }

    public static boolean hasAHref(Element e) {
        ArrayList l = new ArrayList();
        Boolean b;
        Elements links1 = e.getElementsByTag("a");
        for (Element link : links1) {
            String linkHref = link.attr("abs:href");
            //System.out.println(linkHref);
            l.add(linkHref);

        }
        if (l.isEmpty() == true) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public static boolean hasImgSrc(Element e) {
        ArrayList l = new ArrayList();
        Boolean b;
        Elements links1 = e.getElementsByTag("img");
        for (Element link : links1) {
            String linkHref = link.attr("src");
            //System.out.println(linkHref);
            l.add(linkHref);

        }
        if (l.isEmpty() == true) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public static int noOfSiblingElements(Element e) {
        int i;
        ArrayList al = new ArrayList();
        Elements all = e.siblingElements();
        for (Element e1 : all) {
            al.add(e1);
        }
        i = al.size();
        return i;
    }

    public static boolean isSiblingsAttributeValueSame(Element e) {
        boolean b = false;
        String k2 = "noo";
        Attributes attributes = e.attributes();//...GETTING THE ATTRIBUTES OF ELEMENT
        String ff = attributes.toString();

        Elements siblingElements = e.siblingElements();
        for (Element e5 : siblingElements) {
            Attributes at2 = e5.attributes();//getting the attributes of sibling
            String ff1 = at2.toString();
            if (ff.equals(k2)) {
                // System.out.println("yes");
                b = true;

                break;
            } else {
                // System.out.println("no");
                b = false;
            }
            k2 = ff1;

        }

        return b;
    }

}
//&& !ff.matches("href?") && !ff.matches("html?")
//LOGIC OF THE PROGRAM
/*
OTH STEP-FIND THE ELEMENT BY BODY OF THE DOCUMENT
1ST STEP -GET ALL THE ELEMENTS OF THE BODY.
2ND STEP-GET ALL THE ATTRIVUTES OF THE ELEMENTS
3RD STEP-CONVERT ALL THE ATTRIBUTES OF EACH ELEMENT TO ONE STRING
4TH STEP-COUNT DOWN THE TOTAL STRINGS IN THE WHOLE BODY
5TH STEP-CONDITION TO PASS THE STRING-TOTAL NO OF STRING SHOULD NOT LESS THAN 5
                                      SHOULD NOT CONTAIN "NULL/BLANK"
                                      SHOULD NOT CONTAIN "HREF"
6TH STEP-SEPERATE ATTRIBUTE AND ARRTIBUTE VALUE FROM STRING
7TH STEP-FIND THE ELEMENTS ACCORDING TO THE ATTRIBUTE AND ATTRIBUTE VALUE.
8TH STEP-FIND THE SIBILINGS OF THE ELEMENTS  IF THE SIBILING ATTRINUTE VALUE
9TH STEP-IF SAME FINDOUT THE ATTRIBUTE AND ATTRIBUTE VALUE


 */



 /*  Elements ell = document.getElementsByAttributeValue("class","cb-col cb-col-100 cb-lst-itm cb-lst-itm-lg");
        for (Element at : ell) {
            String vv = at.className();
            System.out.println(vv);
            System.out.println("+++++++++++++++++++++++");
        }*/


  /* Elements ell = document.getElementsByAttributeValue(attribute.attributename(sr), attribute.attributevalue(sr));
            for (Element at : ell) {
                if (attribute.hasAHref(at) == true && attribute.hasImgSrc(at) == true && at.hasText() == true) {
                    Elements links1 = at.getElementsByTag("a");
                    Elements links2 = at.getElementsByTag("img");
                    for (Element link : links1) {
                        String linkHref = link.attr("abs:href");
                        System.out.println(linkHref);
                        String linkText = link.text();
                        System.out.println(linkText);
                    }
                    for (Element link : links2) {
                        String linkHref = link.attr("src");
                        System.out.println(linkHref);
                    }
                    System.out.println("+++++++++++++++++++++++");
                }
            }*/


  /*for (String sr : set2) {
            Elements ell = document.getElementsByAttributeValue(attributename(sr),attributevalue(sr));
            for (Element at : ell) {
                if (hasAHref(at) == true && hasImgSrc(at) == true && at.hasText() == true) {
                    set3.add(sr);
                }

            }*/















/*
public class googleandyahoourl {

    public static void main(String[] args) throws IOException {
        //String url = "http://stackoverflow.com/questions/3152138";
        //	String url = "https://www.google.co.in/search?site=webhp&source=hp&q=rapidprototyping&oq=a&gs_l=hp.3..35i39k1l2j0i67k1j46i67k1l2j0i67k1l3j0i46i67k1j0i67k1.3088.3088.0.3459.2.2.0.0.0.0.151.279.0j2.2.0....0...1c.1.64.hp..0.1.150.0.Bx_QF_6TFUA";
        String url="https://in.search.yahoo.com/search?p=javatutorial&fr=yfp-t-704";
        Document document = Jsoup.connect(url).get();

		*/
/*Element question = document.select("#question .post-text p").first();
		System.out.println("Question: " + question.text());
*//*

        //Elements answerers = document.select(".r");
        Elements answerers = document.select(".td-u");
        for (Element answerer : answerers) {
            Elements links = answerer.getElementsByTag("a");
            for (Element link : links) {
                String linkHref = link.attr("href");
                //String linkText = link.text();
                System.out.println(linkHref);
            }
            //System.out.println("Answerer: " + answerer.text());
        }
    }


}*/




/*
import org.json.simple.JSONObject;

        import java.io.IOException;
        import java.io.StringWriter;

class java_to_json {

    public static void main(String[] args) throws IOException {

        JSONObject obj = new JSONObject();

        obj.put("name","foo");
        obj.put("num",new Integer(100));
        obj.put("balance",new Double(1000.21));
        obj.put("is_vip",new Boolean(true));

        StringWriter out = new StringWriter();
        obj.writeJSONString(out);

        String jsonText = out.toString();
        System.out.print(jsonText);
    }
}*/
