package Es_1a4;

public class Product {
    private String id;
    private String name;
    private String category;
    private Double price;

    public Product(String id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter per 'category'
    public String getCategory() {
        return category;
    }

    // Getter per 'price'
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{---------------\n" +
                "  id='" + id + "',\n" +
                "  name='" + name + "',\n" +
                "  category='" + category + "',\n" +
                "  price=" + price + "\n" +
                "------------------}";
    }
}
