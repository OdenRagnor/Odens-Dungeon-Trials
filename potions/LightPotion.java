
/*
public class LightPotion {
    public static String name = "Light Potion";
    public static String description = "A small vile with a red translucent liquid inside";
    public static int healthPoints = 10;
    public static int healthPointsMax = 0;
    public static int damageMin = 0;
    public static int damageMax = 0;
    public static int critChance = 0;
}
*/
package potions;

public class LightPotion extends Potion {

    public LightPotion() {
        super();
        this.name = "Light Potion";
        this.value = 10;
    }
}


