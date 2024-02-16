
public class MonsterClass {

    class FrailMan extends MonsterClass {
        static String name = "Frail Man";
        static String description = "A frail old man.";
        static int healthPoints = 50;
        static int healthPointsMax = 100;
        static int damageMin = 1;
        static int damageMax = 3;
        static int critChance = 1;
    }

    class Zombie extends MonsterClass{
        static String name = "Zombie";
        static String description = "A being in a human form with no soul attached to it's body. With an endless hunger to replace what's missing.";
        static int healthPoints = 60;
        static int healthPointsMax = 120;
        static int damageMin = 2;
        static int damageMax = 4;
        static int critChance = 1;
    }

    class GiantWorm extends MonsterClass{
        static String name = "Giant Worm";
        static String description = "A worm the size of 4 men.";
        static int healthPoints = 80;
        static int healthPointsMax = 160;
        static int damageMin = 2;
        static int damageMax = 4;
        static int critChance = 1;
    }

    class Bandit extends MonsterClass{
        static String name = "Bandit";
        static String description = "A thief with a nack for murder.";
        static int healthPoints = 80;
        static int healthPointsMax = 160;
        static int damageMin = 2;
        static int damageMax = 4;
        static int critChance = 1;
    }

}