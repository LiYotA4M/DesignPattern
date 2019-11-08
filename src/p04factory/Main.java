package p04factory;

import p04factory.framework.Factory;
import p04factory.framework.Product;
import p04factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明", "A");
        Product card2 = factory.create("小红", "B");
        Product card3 = factory.create("小刚", "A");

        card1.use();
        card2.use();
        card3.use();
        System.out.println(((IDCardFactory)factory).getOwners());
    }
}
