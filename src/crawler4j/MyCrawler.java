package crawler4j;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by jitu on 8/14/2017.
 */
public class MyCrawler extends WebCrawler {

    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|gif|jpg" + "|png|mp3|mp4|zip|gz))$");
    LinkedList ln = new LinkedList();

    /**
     * This method receives two parameters. The first parameter is the page
     * in which we have discovered this new url and the second parameter is
     * the new url. You should implement this function to specify whether
     * the given url should be crawled or not (based on your crawling logic).
     * In this example, we are instructing the crawler to ignore urls that
     * have css, js, git, ... extensions and to only accept urls that start
     * with "http://www.ics.uci.edu/". In this case, we didn't need the
     * referringPage parameter to make the decision.
     */
    @Override
    public boolean shouldVisit(Page referringPage, WebURL url) {
        String href = url.getURL().toLowerCase();
       // System.out.println("href :: " + href);

        // return !FILTERS.matcher(href).matches() && href.startsWith("http://www.ics.uci.edu/");
        //return !FILTERS.matcher(href).matches() && href.startsWith("https://katmoviehd.co.in");
         return true;
    }

    /**
     * This function is called when a page is fetched and ready
     * to be processed by your program.
     */
    @Override
    public void visit(Page page) {
        //System.out.println("page: " + page);
        String url = page.getWebURL().getURL();
        //System.out.println("URL: " + url);

        getres(url);

        /*Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String title = doc.title();*/
        //Element link = doc.select("a").first();
        //String absHref = link.attr("abs:href");
       // System.out.println("title: "+title);
       // System.out.println("absHref: " + absHref);
        //System.out.println("txt" + link.text());

        ln.add(url);
        // System.out.println("ln" + ln);

       /* if (page.getParseData() instanceof HtmlParseData) {
            HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
            String text = htmlParseData.getText();
            String html = htmlParseData.getHtml();
            Set<WebURL> links = htmlParseData.getOutgoingUrls();

            System.out.println("Text length: " + text.length());
            System.out.println("Html length: " + html.length());
            System.out.println("Number of outgoing links: " + links.size());
        }*/
    }

    public synchronized void  getres(String url){
        if(url.contains("download")){
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("url: "+url);
        String title = doc.title();
        //Element link = doc.select("a").first();
        //String absHref = link.attr("abs:href");
        System.out.println("title: "+title);}
    }
}