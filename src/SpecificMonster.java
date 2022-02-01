public class SpecificMonster extends Monster {
    private int exp;
    private int hp;

    //Constructor
    public SpecificMonster(String name, int exp, int hp) {
        super(name);
        this.exp = exp;
        this.hp = hp;
    }

    @Override
    public void takeDamage(int dmg) {
        setHp(hp - dmg);
    }


    /** monster attack method */
    @Override
    public void giveDamage(int dmg, Player player) {
        player.setHp(player.getHp() - dmg);
        System.out.println("The monster hit you, dealing " + dmg + " damage");
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
}
