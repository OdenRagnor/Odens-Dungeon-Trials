public class Items {
    //Potions
    class LightHealthPotion extends Items {
        String name = "Light Potion";
        String description = "A small vile with a red translucent liquid inside";
        int healthPoints = 10;
        int healthPointsMax = 0;
        int damageMin = 0;
        int damageMax = 0;
        int critChance = 0;
    }

    class MediumPotion extends Items {
        String name = "Medium Potion";
        String description = "A vile with a red translucent liquid inside";
        int healthPoints = 30;
        int healthPointsMax = 0;
        int damageMin = 0;
        int damageMax = 0;
        int critChance = 0;
    }

    class HeavyPotion extends Items {
        String name = "Heavy Potion";
        String description = "A large vile with a red translucent liquid inside";
        int healthPoints = 60;
        int healthPointsMax = 0;
        int damageMin = 0;
        int damageMax = 0;
        int critChance = 0;
    }

    //Equipment
    //Shields
    class  WoodenShield extends Items {
        String name = "Wooden Shield";
        String description = "A large rounded wooden shield. It is scared with heavy battle damage.";
        int healthPoints = 0;
        int maxHealthPoints = 5;
        int damageMin = 0;
        int damageMax = 0;
        int critChance = 0;
    }

    class Shield extends Items {
        String name = "Shield";
        String description = "A beaten metal shield. It is scared with heavy battle damage.";
        int healthPoints = 0;
        int maxHealthPoints = 10;
        int damageMin = 0;
        int damageMax = 0;
        int critChance = 0;
    }

    class LeatherShield extends Items {
        String name = "Leather Shield";
        String description = "A beaten leather shield. It is scared with heavy battle damage.";
        int healthPoints = 0;
        int maxHealthPoints = 7;
        int armor = 0;
        int damageMin = 0;
        int damageMax = 0;
        int critChance = 0;
    }

    class WarriorsShield extends Items {
        String name = "Warrior's Shield";
        String description = "A heavy and sturdy shield fit for a warrior.";
        int healthPoints = 0;
        int maxHealthPoints = 20;
        int armor = 0;
        int damageMin = 1;
        int damageMax = 2;
        int critChance = 0;
    }

    class OdensGuardsShield extends Items {
        String name = "Oden's Guard's Shield";
        String description = "A light and strong shield fit for a God.";
        int healthPoints = 0;
        int maxHealthPoints = 30;
        int armor = 0;
        int damageMin = 1;
        int damageMax = 2;
        int critChance = 1;
    }

    //Chest Armor
    class ClothShirt extends Items {
        String name = "Cloth Shirt";
        String description = "Light and soft shirt to help protect you from the elements.";
        int healthPoints = 0;
        int maxHealthPoints = 0;
        int armor = 1;
        int damageMin = 0;
        int damageMax = 0;
        int critChance = 0;
    }

    class wizardsTop extends Items {
        String name = "Wizards Top";
        String description = "Light and soft shirt to help protect you from the elements.";
        int healthPoints = 0;
        int maxHealthPoints = 0;
        int armor = 1;
        int damageMin = 2;
        int damageMax = 5;
        int critChance = 1;
    }

    class leatherChestArmor extends Items {
        String name = "Cloth Shirt";
        String description = "Light and soft shirt to help protect you from the elements.";
        int healthPoints = 0;
        int maxHealthPoints = 0;
        int armor = 2;
        int damageMin = 2;
        int damageMax = 5;
        int critChance = 1;
    }

}
