package game;

public class Gin extends hero {
    public Gin() {
        this.Name = "Gin";
        this.Range_Attack = 5;
        this.Defence = 20;
        this.Damage = 12;
        this.Health_Points = 70;
        this.Speed = 6;
        this.Ultimate = "None";
        this.x = 0;
    }


    @Override
    public void attack(Gorgon gorgon) {
        if (Health_Points > 0 & gorgon.Health_Points > 0) {
            if (gorgon.x - x < Range_Attack & gorgon.Defence > 0) {
                gorgon.Defence -= Damage;
                System.out.println("Gin dealt damage to " + Damage);
                System.out.println("Minus armor from " + (gorgon.Defence + Damage) + " to " + gorgon.Defence);
                if (gorgon.x - x < Range_Attack & gorgon.Defence < 0) {
                    gorgon.Health_Points += gorgon.Defence;
                    System.out.println("No defence more");
                    System.out.println("Health enemy decreased from " + (gorgon.Health_Points - gorgon.Defence) + " to " + gorgon.Health_Points);
                    gorgon.Defence = 0;
                }


            } else if (gorgon.x - x < Range_Attack & gorgon.Defence == 0) {
                gorgon.Health_Points -= Damage;
                System.out.println("Gin dealt damage to " + Damage);
                System.out.println("Health enemy decreased from " + (gorgon.Health_Points + Damage) + " to " + gorgon.Health_Points);
            }
        }

    }

    @Override
    public void run(Gorgon gorgon) {
        if (gorgon.x - x > Range_Attack) {
            x += Speed;
            for (int i = 0; i < 26; i++) {
                if (i == x) {
                    System.out.print("!");
                } else if (i == gorgon.x) {
                    System.out.print(")");
                } else {
                    System.out.print("_");
                }

            }
            System.out.println("");
            System.out.println("Gin move from " + (x - Speed) + " to " + x);
        }
    }

    @Override
    public void attack2(Gin gin) {

    }

    @Override
    public void run2(Gin gin) {

    }

    @Override
    public void Ultimate(Gorgon gorgon) {
        Health_Points += 5;
        gorgon.Health_Points -= 5;
        System.out.println("Gin steal Gorgon 5 health ");
    }

    @Override
    public void Ultimate2() {

    }
}

