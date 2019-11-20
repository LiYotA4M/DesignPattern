package p21proxy;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrintProxy("Alice");
        System.out.println("现在名字是" + p.getPrintName());
        p.setPrintName("Bob");
        System.out.println("现在名字是" + p.getPrintName());
        p.print("Hello World!");
    }
}
