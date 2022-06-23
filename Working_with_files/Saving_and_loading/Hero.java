package Working_with_files.Saving_and_loading;

import java.io.Serializable;

public class Hero implements Serializable{
        
    private static final long serialVersionUID = 1L;
    private String name;
    private int hp;
    private int lvl;
    private Weapon weapon;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
        this.lvl = 1;
        this.weapon = new Weapon("sword", 10);
    }

    public void restoreHp(int healingPotion) {
        hp += healingPotion;
    }

    public void takeDamage(int damage) {
        hp -= damage; 
    }

    public void showInformation(){
        System.out.println("HP: " + hp);
        System.out.println("Name: " + name);
        System.out.println("Level: " + lvl);
        System.out.println("Weapon " + weapon.getTitle());
        System.out.println("Damage " + weapon.getDamage());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLvl() {
        return lvl;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    
}
