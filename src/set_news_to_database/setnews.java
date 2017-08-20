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

/**
 * Created by jitu on 8/15/2017.
 */
public class setnews {
    public static void main(String args[]) throws IOException {
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


        ////////////////////////////////////////////////

       /* Document document = null;
        try {
            document = Jsoup.connect("http://timesofindia.indiatimes.com/business").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element link = document.select("body").first();
        Elements links1 = link.select("a[href]");
        for (Element link1 : links1) {
            if (wordcount(link1.text()) > 3) {
                // System.out.println("\nlink : " + link1.attr("abs:href"));
                //System.out.println("text : " + link1.text());
                //System.out.println(wordcount(link1.text()));
                String mainlink = link1.attr("abs:href");
                Document page = Jsoup.connect(mainlink).timeout(100000).get();
                String title = page.title();
                String imgsrc;
                try {
                    Element src = page.getElementsByClass("highlight").first();
                    Element src1 = src.select("img").last();
                    imgsrc = src1.attr("abs:src");
                    System.out.println(title.replace("Times of India","hook"));
                    System.out.println(mainlink);
                    System.out.println(imgsrc);
                    //if( src.toLowerCase().endsWith(".jpg") ) // only needed if you want to check only jpegs
                   // {
                        final URL url = new URL(imgsrc);
                        final long size = url.openConnection().getContentLength();

                        System.out.println("kk" + " ---> " + size + " byte");
                    //}
                } catch (Exception e) {
                    imgsrc = null;
                    System.out.println(imgsrc);
                }
            }
        }
*/


        //////////////////////////////////////////////////////////////////////

        int width = 1;
        Document document = null;
        try {
            document = Jsoup.connect("http://timesofindia.indiatimes.com/india/war-wont-give-china-any-clear-gain-only-cause-casualties-assesses-govt/articleshow/60149769.cms").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements link = document.select("img");
        for (Element links : link) {
            String absHref = links.attr("abs:src");
            System.out.println(absHref);

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

                }

            } catch (Exception e) {

            }



            /*final URL url = new URL(absHref);
            final long size = url.openConnection().getContentLength();

            System.out.println("kk" + " ---> " + size + " byte");*/

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


}
