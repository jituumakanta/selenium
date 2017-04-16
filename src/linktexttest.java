import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by jitu on 4/16/2017.
 */
public class linktexttest {

    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("http://www.amazon.in/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=computer").maxBodySize(0).get();
        Elements links = document.select("body");
       // System.out.println(links);
        for (Element el : links) {
            Elements ee = el.getElementsByClass("s-result-item celwidget");
            System.out.println(ee);
            for(Element e:ee){
                Element link = e.select("a").get(0);
                Element linkk = e.select("a").get(1);
                String linkHref = link.attr("href");
                String linkHreff = linkk.attr("href");
                System.out.println(linkHref);
                System.out.println(linkHreff);
                String linkText3 = e.text();
                System.out.println(linkText3);
            }
        }
    }


}
