package kiosk;

public class Menu {
    private int category;
    private String name;
    private int price;

    public Menu(int category, String name, int price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (" + price + "원)";
    }
}
