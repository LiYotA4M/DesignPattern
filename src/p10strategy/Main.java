package p10strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int seed1 = new Scanner(System.in).nextInt();
        int seed2 = new Scanner(System.in).nextInt();
        Player player1 = new Player("Tara", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));
        for (int i = 0; i < 1000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even ... ");
                player1.even();
                player2.even();
            }
            System.out.println("Total Result: ");
            System.out.println(player1.toString());
            System.out.println(player2.toString());
        }
    }
}
