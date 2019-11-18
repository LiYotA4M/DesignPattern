package p17observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGeneratoe();
        Observer observer1 = new DigitalObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
