
public class MonsterClass {
    private String name = "";
    private String description = "";
    private int healthPoints = 100;
    private int healthPointsMax = 100;
    private int damageMin = 3;
    private int damageMax = 7;
    private int critChance = 10;

    public String getMonsterName(){
        return this.name;
    }

    public String getMonsterDescription(){
        return this.description;
    }

    public int getMonsterHealthPoints(){
        return this.healthPoints;
    }

    public int getMonsterHealthPointsMax(){
        return this.healthPointsMax;
    }
    
    public int getMonsterDamageMin(){
        return this.damageMin;
    }

    public int getMonsterDamageMax(){
        return this.damageMax;
    }

    public int getMonsterCritChance(){
        return this.critChance;
    }

}
