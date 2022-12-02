import java.util.ArrayList;
import java.util.Arrays;
public abstract class Base{
    private int attack;
    private int protection;
    private int shoot;
    private int[] damage;
    private double health;
    private double maxHealth;
    private int speed;
    private boolean delivery;
    private boolean magic;
    private String name;
    private static int idCounter;
    private int playerID;

    protected ArrayList<Base> team;

    public Base (int attack, int protection, int shoot, int[] damage, double health, int speed, boolean delivery, boolean magic, String name){
        this.attack=attack;
        this.protection=protection;
        this.shoot=shoot;
        this.damage=damage;
        this.health=health;
        this.speed=speed;
        this.delivery=delivery;
        this.magic=magic;
        this.name=name;
        playerID=idCounter++;
        this.maxHealth=maxHealth;

    }
    public int getPlayerId(){
        return playerID;
    }

    public int getAttack(){
        return attack;
    }

    public int getPritection(){
        return protection;
    }

    public int getShoot(){
        return shoot;
    }

    public int[] getDamage(){
        return damage;
    }
    public double getHealth(){
        return health;
    }
    public double getMaxHealth(){
        return maxHealth;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean isDelivery(){
        return delivery;
    }
    public boolean isMagic(){
        return magic;
    }

    public String getName(){
        return name;
    }

    public void setAttack (int attack){
        if (attack>=0){
            this.attack=attack;
        }
    }

    public void setProtection(int protection){
        if (protection>=0){
            this.protection=protection;
        }
    }

    public void setShoot(int shoot){
        if (shoot>=0){
            this.shoot=shoot;
        }
    }

    public void setDamage(int[] damage){
        this.damage=damage;
    }

    public void setHealth (double health){
        if (health>=0){
            this.health=health;
        }
    }

    public void setMaxHealth (double maxHealth){
        if (maxHealth>=0){
            this.maxHealth=maxHealth;
        }
    }

    public void setSpeed(int speed){
        if (speed>=0){
            this.speed=speed;
        }
    }
     public void setDelivery (boolean delivery){
         this.delivery=delivery;
     }

     public void setMagic (boolean magic){
         this.magic=magic;
     }

     public void setName (String name){
         this.name=name;
     }

     @Override
     public String toString() {
        return getClass().getSimpleName()+" : "+playerID+" attack=" + attack +
                ", protection=" + protection +
                ", shoot=" + shoot +
                ", damage=" + Arrays.toString(damage) +
                ", health=" + health +
                ", speed=" + speed +
                ", delivery=" + delivery +
                ", magic=" + magic;
    }
    public String getInfo() {
        return null;
    }



}