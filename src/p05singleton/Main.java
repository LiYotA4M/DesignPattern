package p05singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 == obj2 ? "实例相同。" : "实例不同。");
        System.out.println("End.");
    }
}
