package p20flyweight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        BigString bigString = new BigString(string);
        bigString.print();
    }
}
