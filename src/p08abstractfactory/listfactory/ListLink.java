package p08abstractfactory.listfactory;

import p08abstractfactory.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    @Override
    public String makeHTML() {
        return "    <li><a herf=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
