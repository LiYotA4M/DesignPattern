package p08abstractfactory;

import p08abstractfactory.factory.Factory;
import p08abstractfactory.factory.Link;
import p08abstractfactory.factory.Page;
import p08abstractfactory.factory.Tray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factory factory = Factory.getFactory(scanner.next());

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link usYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jpYahoo = factory.createLink("Yahoo!jp", "http://www.yahoo.co.jp");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(usYahoo);
        trayYahoo.add(jpYahoo);

        Page page = factory.createPage("LinkPage","authorA");
        page.add(trayNews);
        page.add(trayYahoo);
        page.output();
    }
}
