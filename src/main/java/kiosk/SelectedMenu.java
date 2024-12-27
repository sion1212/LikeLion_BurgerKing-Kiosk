package kiosk;

public class SelectedMenu extends Menu{
    private int amount;
    private final int INTIAL = 1;

    public SelectedMenu(int category, String name, int price) {
        super(category, name, price);
        this.amount = INTIAL;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
