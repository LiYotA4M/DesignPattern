package p02adapter.objectadpater;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello Object");
        p.printWeak();
        p.printStrong();
    }
}
