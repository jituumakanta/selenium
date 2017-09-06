package set_news_to_database;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jitu on 8/15/2017.
 */
public class setnews {
    public static void main(String args[]) throws IOException {

        //method1...........................................................................
       /* Document document = null;
        try {
            document = Jsoup.connect("http://www.deccanchronicle.com/world").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("tstry-feed-sml-a");
            for (Element e : content) {

                //System.out.println(e);
                //tstry-feed-sml-a
                //feedRight

                Element link = e.select("a").first();
                String pagelink = link.attr("abs:href");
                System.out.println(pagelink);

                Element linkk = e.select("img").first();
                String titlee = linkk.attr("abs:data-src");
                System.out.println(titlee);

                String txt = link.text();
                System.out.println(txt);

            }

        }*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Document document = null;
        try {
            document = Jsoup.connect("http://www.gadgetsnow.com").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element link = document.select("body").first();
        Elements links1 = link.select("a[href]");
        for (Element link1 : links1) {
            if (wordcount(link1.text()) > 3) {
                String mainlink = link1.attr("abs:href");
                Document page = Jsoup.connect(mainlink).timeout(100000).get();
                //getting the title
                String title = page.title();

                if (title.contains("Gadgets Now")) {
                //method2.....getting the image by providing class name............................................
                try {
                    Element src = page.getElementsByClass("highlight").first();//method1
                    //Element src = page.getElementById("highlight");//method2
                    Element src1 = src.select("img").last();
                    String imgsrc = src1.attr("abs:src");
                    System.out.println(mainlink);
                    System.out.println(title);
                    System.out.println(imgsrc);
                } catch (Exception e) {
                    System.out.println("imgsrc=null");
                }

                    /*//method3........getting the image by big image size..........................................
                    HashMap<String, Integer> map = new HashMap<String, Integer>();
                    int width = 1;
                    int height = 1;
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
                                width = image.getWidth();
                                height = image.getHeight();
                                //System.out.println("width: " + width + "height: " + height);
                                map.put(absHref, height * width);
                            }
                        } catch (Exception e) {

                        }
                        final URL url = new URL(absHref);
                        final int size = url.openConnection().getContentLength();
                        //System.out.println("kk" + " ---> " + size + " byte");

                    }
                    Object maxEntry1 = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
                    a = String.valueOf(maxEntry1);
                    System.out.println(mainlink);
                    System.out.println(title);
                    System.out.println(getKey(map, a));
                    map.clear();*/
                }
            }

        }
    }

    static int wordcount(String s) {

        int i, c = 0, res;
        char ch[] = new char[s.length()];      //in string especially we have to mention the () after length
        for (i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                c++;
        }
        return c;
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
