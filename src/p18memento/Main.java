package p18memento;

import p18memento.game.Game;
import p18memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(100);
        Memento memento = game.createMemento();
        for (int i = 0; i < 100; i ++) {
            System.out.println("====" + i);
            System.out.println("当前状态: " + game);
            game.bet();
            System.out.println("所持金钱为：" + game.getMoney());
            if (game.getMoney() > memento.getMoney()) {
                System.out.println("所持金钱增加，保存当前游戏状态");
                memento = game.createMemento();
            } else if (game.getMoney() < memento.getMoney() / 2) {
                System.out.println("所持金钱过少，恢复至之前的状态");
                game.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
