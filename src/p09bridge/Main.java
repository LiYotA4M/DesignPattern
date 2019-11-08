package p09bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello world."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello second world."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello third world."));

        d1.display();
        d2.display();
        d3.multiDisplay(3);
    }
}
