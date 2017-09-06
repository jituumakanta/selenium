package others;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jitu on 9/6/2017.
 */
public class sinlepage {
    public static void main(String args[]) throws IOException {
        Document page = Jsoup.connect("http://zeenews.india.com/west-bengal/after-mohan-bhagwat-amit-shah-denied-permission-for-kolkata-event-bjp-cries-conspiracy-2040009.html").timeout(100000).get();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int width = 1;
        Elements linkk = page.select("img");
        String a = null;
        for (Element links : linkk) {
            String absHref = links.attr("abs:src");
            //System.out.println(absHref);

           try {
                URL url = new URL(absHref);
                URLConnection conn = url.openConnection();

                // now you get the content length
                //  int contentLength = conn.getContentLength();
                // you can check size here using contentLength

                InputStream in = conn.getInputStream();
                BufferedImage image = ImageIO.read(in);
                if (image.getWidth() > width) {

                    // you can get size  dimesion
                    width = image.getWidth();
                    int height = image.getHeight();

                    System.out.println("width: " + width + "height: " + height);
                    map.put(absHref, width);
                }

            } catch (Exception e) {

            }


            final URL url = new URL(absHref);
            final int size = url.openConnection().getContentLength();

            //System.out.println("kk" + " ---> " + size + " byte");


            // System.out.println("Values before remove: "+ map);
            //Map.Entry<Integer,String > maxEntry =  getMaxEntry(map);

        }

        Object maxEntry1 = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        a = String.valueOf(maxEntry1);
        System.out.println("maxEntry = " + a);
        System.out.println(getKey(map, a));
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

