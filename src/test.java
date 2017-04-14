import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by jitu on 4/9/2017.
 */
public class test {

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://www.rajnikantvscidjokes.in/").userAgent("Mozilla/5.0 (Windows NT 6.2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.69 Safari/537.36")
                .maxBodySize(0)
                .get();

        // System.out.println(document);
        Elements links = document.select("body");

        for(Element e:links){

            Elements el=e.getAllElements();
            for(Element ej:el){

                String f=ej.nodeName();
                System.out.println(ej.nodeName());
            }
            System.out.println(e.nodeName());
            System.out.println(e.parentNode().nodeName());
           // System.out.println(e.);
        }
    }




}
