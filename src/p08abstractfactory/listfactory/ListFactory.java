package p08abstractfactory.listfactory;

import p08abstractfactory.factory.Factory;
import p08abstractfactory.factory.Link;
import p08abstractfactory.factory.Page;
import p08abstractfactory.factory.Tray;

public class ListFactory implements Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
