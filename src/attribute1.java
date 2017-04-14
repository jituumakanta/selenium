import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jitu on 4/14/2017.
 */
public class attribute1 {
    public static void main(String[] args) throws IOException {

        String d = "ddd jitu";
        String d1 = "sss jitu";
        if (d.contains("sss jitu")) {
            System.out.println("yes");
        }
        System.out.println(similarity("id=\"result_4\" data-asin=\"B06X3WR2P4\" class=\"s-result-item celwidget \"", "id=\"result_5\" data-asin=\"B01GRFC3E2\" class=\"s-result-item celwidget \""));


        Document document = Jsoup.connect("http://www.cricbuzz.com/cricket-news").userAgent("Mozilla/5.0 (Windows NT 6.2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.69 Safari/537.36")
                .maxBodySize(0)
                .get();

        // System.out.println(document);
        Elements links = document.select("body");
        int i = 1;
        HashMap<Integer, Element> hs = new HashMap();
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
                    hs.put(i, e1);
                }
                i++;
            }
        }


        for (Map.Entry m : hs.entrySet()) {


            Element al = (Element) m.getValue();
            Attributes at2 = al.attributes();
            String s1 = at2.toString();
            Elements all = al.siblingElements();
            for (Element o : all) {
                Attributes at1 = o.attributes();
                String s2 = at1.toString();
                //System.out.println(similarity(s1,s2));
                if (similarity(s1, s2) > .5 && noOfSiblingElements(al) > 4 && hasChild(al) == true && hasAHref(al) == true && hasImgSrc(al) == true && al.hasText() == true) {
                    System.out.println(at2 + "         " + at1);
                }


            }

            /*String ff = m.toString();
            //System.out.println(m);
            //System.out.println(similarity("id=\"result_4\" data-asin=\"B06X3WR2P4\" class=\"s-result-item celwidget \"",ff));
           if(similarity("id=\"post-12288\" class=\"post-12288 post type-post status-publish format-standard hentry category-alerts-information category-biomedical-jobs category-experienced-jobs category-jobs-in-bangalore category-jobs-in-pune\"",ff)>.5){
            System.out.println(m);}*/
        }


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

    public static boolean hasChild(Element e) {
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


    public static double similarity(String s1, String s2) {
        String longer = s1, shorter = s2;
        if (s1.length() < s2.length()) {
            longer = s2;
            shorter = s1;
        }
        int longerLength = longer.length();
        if (longerLength == 0) {
            return 1.0; /* both strings are zero length */
        }

        return (longerLength - editDistance(longer, shorter)) / (double) longerLength;

    }

    public static int editDistance(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] costs = new int[s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            int lastValue = i;
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0)
                    costs[j] = j;
                else {
                    if (j > 0) {
                        int newValue = costs[j - 1];
                        if (s1.charAt(i - 1) != s2.charAt(j - 1))
                            newValue = Math.min(Math.min(newValue, lastValue),
                                    costs[j]) + 1;
                        costs[j - 1] = lastValue;
                        lastValue = newValue;
                    }
                }
            }
            if (i > 0)
                costs[s2.length()] = lastValue;
        }
        return costs[s2.length()];
    }

}
