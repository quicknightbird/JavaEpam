package game;

import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        action action = new action();

        System.out.println("------Menu-----");
        System.out.println("1. Start");
        System.out.println("2. Exit");
        System.out.println("------Pick number-----");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();

        switch (num) {
            case 1 -> {
                System.out.println("------Play-----");
                action.act();
            }
            case 2 -> System.out.println("------Good bye-----");
            default -> {
                System.out.println("Game over!");
                System.exit(0);
            }
        }

    }


}

