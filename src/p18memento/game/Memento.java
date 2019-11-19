package p18memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    public int money;
    public ArrayList<String> fruits;
    public int getMoney() {
        return money;
    }
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }
    public void addFruit(String fruit) {
        fruits.add(fruit);
    }
    public List<String> getFruits() {
        return (List<String>) fruits.clone();
    }
}
