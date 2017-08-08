import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.net.www.protocol.http.HttpURLConnection;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;

/**
 * Created by jitu on 8/2/2017.
 */
public class xxx {


    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.gecko.driver", "D:/android/driver/geckodriver-v0.18.0-win64/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","D:/odds/chromedriver_win32/chromedriver.exe");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "D:/android/driver/phantomjs-2.1.1-windows/bin/phantomjs.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com");
        String a=driver.getPageSource();
        Document d=Jsoup.parse(a);
        System.out.println(d);
        System.out.println("title"+driver.getTitle());


       /* Document doc = Jsoup.connect("https://www.flipkart.com")

                .get();
        System.out.println("////////////////////////////////////////////////////////////////////////" +
                "//////////////////////////////////////////////////////////////////////////////////" +
                "/////////////////////////////////////////////////////////////////////////////" +
                "////////////////////////////////////////////////////////////////////////////////////////////" +
                "///////////////////////////////////////////////////////////////////////////////" +
                "////////////////////////////////////////////////////////////");
        System.out.println(doc);*/
/*

.userAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2") //
                .header("Content-Language", "en-US") //

*/













      /*  System.setProperty("https.proxyHost", "127.0.0.1.87878798");
        System.setProperty("https.proxyPort", "8080");
        Proxy proxy = new Proxy(                                      //
                Proxy.Type.HTTP,                                      //
                InetSocketAddress.createUnresolved("127.0.0.1", 8080) //
        );*/

        /*Document doc = Jsoup.connect("https://www.moviespur.in/category/new-bollywood-movies-146.html")
                .userAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2") //
                .header("Content-Language", "en-US") //
                .get();

        Elements link = doc.getElementsByClass("touch");
        for (Element e : link) {
            String absHref = e.attr("abs:href"); // "http://jsoup.org/"
            String linkText = e.text();
            System.out.println(linkText);
            //System.out.println(absHref);


            Document doc1 = Jsoup.connect(absHref)
                    .userAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2") //
                    .header("Content-Language", "en-US") //
                    .get();
            Element link1 = doc1.getElementsByClass("touch").last();
            String absHref1 = link1.attr("abs:href");
            Document doc2 = Jsoup.connect(absHref1)
                    .userAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2") //
                    .header("Content-Language", "en-US") //
                    .get();
            Element link2 = doc2.getElementsByClass("downloadbutton").first();
            String absHref2 = link2.attr("abs:href");
            System.out.println(absHref2);*/


        /*try{

            Response response =
                    Jsoup.connect("https://clicknupload.org/qxtd6fnop6m3")
                            .userAgent("Mozilla/5.0")
                            .timeout(10 * 1000)
                            .method(Method.POST)
                            .data("op", "download1")
                            .data("usr_login", "s65c7oaxxocg")
                            .data("id", "qxtd6fnop6m3")
                            .data("fname", "Jab 2017 [ Bolly4u.org ] 400mb Hindi 480p.mkv")
                            .data("referer", "https://bolly4u.org/jab-harry-met-sejal-2017-pre-dvdrip-400mb-hindi-movie-480p/")
                            .data("method_free","Free Download >>")
                            .followRedirects(true)
                            .execute();

            //parse the document from response
            Document document = response.parse();
            System.out.println(document);
            //get cookies
            Map<String, String> mapCookies = response.cookies();

            *//*
             * You may need to send all the cookies you received
             * from the post response to the subsequent requests.
             *
             * You can do that using cookies method of Connection
             *//*



        }catch(IOException ioe){
            System.out.println("Exception: " + ioe);
        }
*/


       /* Document doc = Jsoup.connect("https://uploadbaz.net/f/WEF-ejCg3a-").get();
        Elements e = doc.getElementsByTag("a");
        for (Element s : e) {
            String s1 = s.attr("abs:href");
            System.out.println(s1);
        }


        String url = "https://uploadbaz.net/download/WEF-ejCg3a-.mkv?st=43ea03b84baf4f574d220d1815c6af38&e=1502163838";

        FileSize(url);
        System.out.println(FileSize(url));
    }


    *//*

            Document doc = Jsoup.connect("http://bluedeserts.com/")
                    .userAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2") //
                    .header("Content-Language", "en-US") //
                    .get();

            Elements link = doc.getElementsByClass("more-link");
            for(Element e:link){
                String absHref1 = e.attr("abs:href");
                //System.out.println(absHref1);

                Document doc2 = Jsoup.connect(absHref1)
                        .userAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2") //
                        .header("Content-Language", "en-US") //
                        .get();
                System.out.println(doc2.title());
                Element link2 = doc2.getElementsByAttribute("action").first();
                //System.out.println(link2);
                System.out.println(link2.attr("action"));
               *//*
*//* for (Element e2 : link2) {
                String absHref2 = e2.attr("abs:href"); // "http://jsoup.org/"
                String linkText2 = e2.text();
                System.out.println(e2);
                System.out.println(absHref2);

            }*//**//*


*//*
    private static int FileSize(String url) {

        // this is the method and it get the url as a parameter.

        // this java class will allow us to get the size of the file.

        URLConnection con;

        // its in a try and catch incase the url given is wrong or invalid

        try {

            // we open the stream

            con = new URL(url).openConnection();

            return con.getContentLength();
        } catch (Exception e) {

            e.printStackTrace();

            // this is returned if the connection went invalid or failed.

            return 0;
        }*/
    }


}




