package kiosk;

public class SelectedMenu extends Menu{
    private int amount;
    private final int INTIAL = 1;

    public SelectedMenu(String name, int price) {
        super(name, price);
        this.amount = INTIAL;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return getName()+" "+getAmount()+"개";
    }
}
