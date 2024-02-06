package potions;

public class Potion {
    protected String name;
    protected int value;
    
    public Potion(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    // Shared getter/setter methods
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }
}





