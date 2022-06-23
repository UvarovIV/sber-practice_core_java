package Working_with_files;

import java.io.*;

public class TestHero {
    public static void main(String[] args) {

        try (FileOutputStream fileoutputStream = new FileOutputStream("SaveHero.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileoutputStream);
                FileInputStream fileInputStream = new FileInputStream("SaveHero.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                Weapon newSword = new Weapon("Sword", 15);
                Hero Kirito = new Hero("Kirito");
                Kirito.showInformation();
                Kirito.setWeapon(newSword);
                objectOutputStream.writeObject(Kirito);
                Kirito = (Hero) objectInputStream.readObject();
                System.out.println();
                Kirito.showInformation();
                
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        } catch (ClassNotFoundException classNotFoundEx) {
            System.out.println(classNotFoundEx.getMessage());
        } 
    }
}

