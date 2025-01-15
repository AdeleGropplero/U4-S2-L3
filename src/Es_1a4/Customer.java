package Es_1a4;

public class Customer {

    private String id;
    private String name;
    private int tier;


    public Customer(String id, String name, int tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    @Override
    public String toString() {
        return " {----------\n" +
                "  id='" + id + "',\n" +
                "  name='" + name + "',\n" +
                "  tier=" + tier + "\n" +
                "} ------------";
    }

}

