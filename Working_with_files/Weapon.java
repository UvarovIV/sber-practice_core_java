package Working_with_files;

import java.io.Serializable;

public class Weapon implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String title;
    private int damage;
    
    public Weapon(String title, int damage) {
        this.title = title;
        this.damage = damage;
    }

    public String getTitle() {
        return title;
    }

    public int getDamage() {
        return damage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
