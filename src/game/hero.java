package game;

abstract public class hero {
    protected String Name;
    protected Integer Range_Attack;
    protected Integer Defence;
    protected Integer Damage;
    protected Integer Health_Points;
    protected Integer Speed;
    protected String Ultimate;
    protected Integer x; // coordinates


    public abstract void attack(Gorgon gorgon);

    public abstract void run(Gorgon gorgon);

    public abstract void attack2(Gin gin);

    public abstract void run2(Gin gin);

    public abstract void Ultimate(Gorgon gorgon);

    public abstract void Ultimate2();


}

