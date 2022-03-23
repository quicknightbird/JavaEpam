package game;

public class Gorgon extends hero {
    public Gorgon() {
        this.Name = "Gorgon";
        this.Range_Attack = 5;
        this.Defence = 20;
        this.Damage = 14;
        this.Health_Points = 70;
        this.Speed = 5;
        this.Ultimate = "None";
        this.x = 25;

    }


    @Override
    public void attack2(Gin gin) {
        if (Health_Points > 0 & gin.Health_Points > 0) {
            if (x - gin.x < Range_Attack & gin.Defence > 0) {
                gin.Defence -= Damage;
                System.out.println("Gorgon dealt damage to " + Damage);
                System.out.println("Minus armor from " + (gin.Defence + Damage) + " to " + gin.Defence);
                if (x - gin.x < Range_Attack & gin.Defence < 0) {
                    gin.Health_Points += gin.Defence;
                    System.out.println("No defence more");
                    System.out.println("Health enemy decreased from " + (gin.Health_Points - gin.Defence) + " to " + gin.Health_Points);
                    gin.Defence = 0;
                }


            } else if (x - gin.x < Range_Attack & gin.Defence == 0) {
                gin.Health_Points -= Damage;
                System.out.println("Gorgon dealt damage to " + Damage);
                System.out.println("Health enemy decreased from " + (gin.Health_Points + Damage) + " to " + gin.Health_Points);
            }
        }
    }

    @Override
    public void run2(Gin gin) {
        if (x - gin.x > Range_Attack) {
            x -= Speed;
            for (int i = 0; i < 26; i++) {
                if (i == x) {
                    System.out.print(")");
                } else if (i == gin.x) {
                    System.out.print("!");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println("");
            System.out.println("Gorgon move from " + (x + Speed) + " to " + x);
        }

    }

    @Override
    public void Ultimate(Gorgon gorgon) {

    }

    @Override
    public void Ultimate2() {
        Defence += 7;
        System.out.println("Gorgon used Ultimate and add +7 armor");

    }

    @Override
    public void attack(Gorgon gorgon) {

    }

    @Override
    public void run(Gorgon gorgon) {

    }

}
