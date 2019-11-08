package p10strategy;

public class Hand {
    private int handValue;
    private Hand(int handValue) {
        this.handValue = handValue;
    }
    public static Hand getHand(int handValue) {
        return HandValue.hands[handValue];
    }
    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }
    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }
    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }
    private interface HandValue {
        int GUU = 0, CHO = 1, PAA = 2;
        String[] name = { "石头","剪刀","布" };
        Hand[] hands = { new Hand(GUU), new Hand(CHO), new Hand(PAA) };
    }
    @Override
    public String toString() {
        return HandValue.name[handValue];
    }
}
