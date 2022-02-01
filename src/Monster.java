public abstract class  Monster {
private String name;


public Monster(String name){
        this.name = name;
}

public abstract void giveDamage(int dmg, Player player);

public abstract void takeDamage(int dmg);

public String getName() {
        return name;
        }
}
