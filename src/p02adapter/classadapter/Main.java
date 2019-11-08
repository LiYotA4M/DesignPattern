package p02adapter.classadapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello Clazz");
        p.printWeak();
        p.printStrong();
    }
}
