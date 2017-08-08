package testfornewstest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by jitu on 5/1/2017.
 */
public class testnews {

    public static void main(String[] args) throws IOException {
        NewsCricketIndianExpress();

    }




    public static void NewsEntIndianExpress() {

        Document document = null;
        try {
            document = Jsoup.connect("http://indianexpress.com/section/entertainment/").maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("articles");
            for (Element e : content) {
                Element link = e.select("a").last();
                String linkHref = link.attr("abs:href"); // "http://example.com/"
                String linkText = link.text();
                System.out.println(linkHref);
                System.out.println(linkText);

                Element link2 = e.select("img").first();
                String linkHref2 = link2.attr("abs:src");
                System.out.println(linkHref2);


            }

        }

    }


    public static void NewsSportsIndianExpress() {

        Document document = null;
        try {
            document = Jsoup.connect("http://indianexpress.com/section/sports/").maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("articles");
            for (Element e : content) {
                Element link = e.select("a").last();
                String pagelink = link.attr("abs:href");
                System.out.println(pagelink);


                Element link2 = e.select("img").first();
                String imagelink = link2.attr("abs:src");
                System.out.println(imagelink);


                String title = link.text();
                System.out.println(title);
                // VolleyUpload(pagelink, "indianexpress", title, imagelink, REGISTER_URL_z_set_news_india);
            }

        }

    }


   /* public static void NewsCricketCricbuzz() {

        Document document = null;
        try {
            document = Jsoup.connect("http://www.cricbuzz.com/cricket-news/latest-news").maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("cb-col cb-col-100 cb-lst-itm cb-lst-itm-lg");
            for (Element e : content) {
                Element link = e.select("a").last();
                String pagelink = link.attr("abs:href");
                System.out.println(pagelink);


                Element link2 = e.select("img").first();
                String imagelink = link2.attr("abs:src");
                System.out.println(imagelink);


                String title = link.text();
                System.out.println(title);
            }

        }

    }*/


    public static void NewsEntPinkvilla() {

        Document document = null;
        try {
            document = Jsoup.connect("https://www.pinkvilla.com/").maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("front-page-promoted-item");
            for (Element e : content) {
                Element link = e.select("a").last();
                String pagelink = link.attr("abs:href");
                System.out.println(pagelink);


                Element link2 = e.select("img").first();
                String imagelink = link2.attr("abs:src");
                System.out.println(imagelink);


                String title = link.text();
                System.out.println(title);
            }

        }

    }

    public static void NewsEnttoi() {

        Document document = null;
        try {
            document = Jsoup.connect("http://www.hindustantimes.com/bollywood/top-news").maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("media");
            for (Element e : content) {
                Element link = e.select("a").last();
                String pagelink = link.attr("abs:href");
                System.out.println(pagelink);


                Element link2 = e.select("img").first();
                String imagelink = link2.attr("abs:src");
                System.out.println(imagelink);


                String title = e.text();
                System.out.println(title);
            }

        }

    }


    public static synchronized void NewsIndiaIndianExpress() {

        Document document = null;
        try {
            document = Jsoup.connect("http://indianexpress.com/section/india/").maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("articles");
            for (Element e : content) {
                Element link = e.select("a").first();
                String pagelink = link.attr("abs:href");
                System.out.println(pagelink);
                Elements contentt = e.getElementsByClass("articles");

                    Element link2 = e.select("img").first();
                    String imagelink = link2.attr("abs:data-lazy-src");
                    System.out.println(imagelink);


                String title = link.text();
                System.out.println(title);

                // VolleyUpload(pagelink, "indianexpress", title, imagelink, REGISTER_URL_z_set_news_india);
                //   VolleyUpload_India(pagelink, "indianexpress", title, imagelink);
                //insertUser_india(pagelink, "indianexpress", title, imagelink);
            }

        }
        //try{Thread.sleep(10000);}catch(InterruptedException e){System.out.println(e);}
    }

    public static synchronized void NewsWorldHindustantimes() {

        Document document = null;
        try {
            document = Jsoup.connect("http://www.hindustantimes.com/world-news/").maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("media");
            for (Element e : content) {
                System.out.println(e);
                Element link = e.select("a").last();
                String pagelink = link.attr("abs:href");
                System.out.println(pagelink);


                Element link2 = e.select("img").first();
                String imagelink = link2.attr("abs:src");
                System.out.println(imagelink);



                String title = e.text();
                System.out.println(title);
               // insertUser_world(pagelink, "hindustantimes", title, imagelink);

            }

        }

    }


    public static synchronized void NewsCricketCricbuzz() {

        Document document = null;
        try {
            document = Jsoup.connect("http://www.cricbuzz.com/cricket-news/latest-news").maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("cb-col cb-col-100 cb-lst-itm cb-lst-itm-lg");
            for (Element e : content) {
                Element link = e.select("a").last();
                String pagelink = link.attr("abs:href");
                System.out.println(pagelink);


                Element link2 = e.select("img").first();
                String imagelink = link2.attr("abs:src");
                System.out.println(imagelink);


                String title = link.text();
                System.out.println(title);
                // VolleyUpload(pagelink, "cricbuzz", title, imagelink, REGISTER_URL_z_set_news_cricket);
                //  VolleyUpload_Cricket(pagelink, "cricbuzz", title, imagelink);
                //insertUser_cricket(pagelink, "cricbuzz", title, imagelink);
            }

        }
        // try {Thread.sleep(10000);} catch (InterruptedException e) {System.out.println(e);}
    }


    public static synchronized void NewsCricketIndianExpress() {

        Document document = null;
        try {
            document = Jsoup.connect("http://indianexpress.com/section/sports/cricket/").maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("body");
        for (Element link1 : links) {
            Elements content = link1.getElementsByClass("articles");
            for (Element e : content) {
                Element link = e.select("a").last();
                String pagelink = link.attr("abs:href");
                System.out.println(pagelink);


                Element link2 = e.select("img").first();
                String imagelink = link2.attr("abs:data-lazy-src");
                System.out.println(imagelink);


                String title = link.text();
                System.out.println(title);
                // VolleyUpload(pagelink, "indianexpress", title, imagelink, REGISTER_URL_z_set_news_cricket);
                //  VolleyUpload_Cricket(pagelink, "indianexpress", title, imagelink);
                //insertUser_cricket(pagelink, "indianexpress", title, imagelink);
            }

        }
        //try{Thread.sleep(10000);}catch(InterruptedException e){System.out.println(e);}
    }


}
