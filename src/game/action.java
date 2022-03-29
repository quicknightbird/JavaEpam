package game;

import java.util.Random;
import java.util.Scanner;

public class action {
    public void act() {
        Random rand = new Random();
        Gin FirstHero = new Gin();
        Gorgon SecondHero = new Gorgon();
        int whoseMove = 2;
        int actionSteps = 1;
        int rndUltGin = 5;
        int rndUltGor = 4;


        while (FirstHero.Health_Points > 0 & SecondHero.Health_Points > 0) {
            int int_random = rand.nextInt(whoseMove);
            int ultGin = rand.nextInt(rndUltGin);
            int ultGorgon = rand.nextInt(rndUltGor);

            Scanner x = new Scanner(System.in);
            System.out.println("Enter any symbol for start " + actionSteps + " action");
            int num = x.nextInt();

            System.out.println("Action " + actionSteps);
            System.out.println("  ");


            if (int_random == 0) {
                if (ultGin == 3) {
                    FirstHero.Ultimate(SecondHero);
                }
                if (ultGorgon == 3) {
                    SecondHero.Ultimate2();
                }
                System.out.println("First move Gin ");
                System.out.println("-----------------");
                FirstHero.run(SecondHero);
                FirstHero.attack(SecondHero);
                SecondHero.run2(FirstHero);
                SecondHero.attack2(FirstHero);
                System.out.println("  ");
            } else {
                System.out.println("First move Gorgon");
                System.out.println("------------------");
                SecondHero.run2(FirstHero);
                SecondHero.attack2(FirstHero);
                FirstHero.run(SecondHero);
                FirstHero.attack(SecondHero);
                System.out.println("  ");

            }

            if (FirstHero.Health_Points <= 0) {
                System.out.println("Gin is dead");
                break;

            } else if (SecondHero.Health_Points <= 0) {
                System.out.println("Gorgon is dead");
                break;
            }
            System.out.println("After action " + actionSteps++ + " Heroes has:  ");
            System.out.println(FirstHero.Name + ": Health: " + FirstHero.Health_Points + " and Armor: " + FirstHero.Defence);
            System.out.println(SecondHero.Name + ": Health: " + SecondHero.Health_Points + " and Armor: " + SecondHero.Defence);
            System.out.println(" ");

        }


    }
}
