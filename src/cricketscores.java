import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by jitu on 5/6/2017.
 */
public class cricketscores {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("http://www.cricbuzz.com/live-cricket-scores/18165/dd-vs-mi-45th-match-indian-premier-league-2017").userAgent("Mozilla/5.0 (Windows NT 6.2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.69 Safari/537.36")
                .maxBodySize(0)
                .get();
        Elements links = document.select("body");
        for (Element link1 : links) {

            Elements content = link1.getElementsByClass("cb-col cb-col-67 cb-scrs-wrp");
            for (Element ee : content) {
                String title = ee.text();
                System.out.println(title);
            }
        }
    }
}
