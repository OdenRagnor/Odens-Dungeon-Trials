import potions.*;
public class MainClass {
    public static void main(String[] args) {
        HeavyPotion heavyPotion = new HeavyPotion();
        
        // Access attributes and methods of the HeavyPotion object
        String name = heavyPotion.getName();
        int value = heavyPotion.getValue();
        
        System.out.println("Name: " + name);
        System.out.println("Value: " + value);
        
        // Modify attributes of the HeavyPotion object
        heavyPotion.setValue(40);
        value = heavyPotion.getValue();
        System.out.println("Updated Value: " + value);
        System.out.printf("%s%n", heavyPotion);
    }
}