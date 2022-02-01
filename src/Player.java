public class Player {
    public String getName() {
        return name;
    }

    private String name;
    private int level;
    private int exp;
    private int hp;
    private int maxHp = 100;
    private int expRequired;

//Constructor
    public Player(String name){
        this.name = name;
        this.level = 1;
        this.exp = 0;
        this.hp = 100;
        this.expRequired = 200;
    }

    /** player attack method **/
    public int attack(SpecificMonster m1) {
        int baseDmg = 4;
        int finalDmg;
        finalDmg = baseDmg * level;
        m1.takeDamage(finalDmg);
        System.out.println("You hit the monster, dealing " + finalDmg + " damage");
        return finalDmg;
    }

    /** handles the gain exp logic **/
    public int gainExp(int exp) {
        setExp(getExp() + exp);
        if(getExp() >= expRequired) {
            setLevel(getLevel() +1);
            setExp(0);
        }

        return 100;
    }

    /** A toString Method for show details about character **/
    public static void toString(Player player) {
        System.out.println("* * * * * * * *");
        System.out.println("Name: " + player.getName());
        System.out.println("Level: " + player.getLevel());
        System.out.println("Hp: " + player.getHp() + "/" + player.getMaxHp());
        System.out.println("Exp: " + player.getExp());
        System.out.println("* * * * * * * *");
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        setExpRequired(getExpRequired() * level);
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMaxHp() {
        return maxHp;
    }

    public int getExpRequired() {
        return expRequired;
    }
    public void setExpRequired(int expRequired) {
        this.expRequired = expRequired;
    }
}
