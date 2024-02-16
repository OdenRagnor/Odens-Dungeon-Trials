package potions;

public class Potion {
    protected String name;
    protected int value;
    protected String description;

    public Potion() {
        name = "";
        value = 0;
        description = "";
    }
    
    // Shared getter/setter methods
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setDescription(String description) {
        this.description = String.format("a %s phial filled with a red irridescant liquid", description);
    }

    @Override
    public String toString() {
        return this.getDescription();
    }
}





