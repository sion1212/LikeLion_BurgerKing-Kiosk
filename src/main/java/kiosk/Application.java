package kiosk;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    public void run() {
        Branch branch = new Branch();
        Page page = new Page();

        ArrayList<SelectedMenu> basket = new ArrayList<>();

        while (true) {
            int selectedHomeMenu = page.home();
            int stateOfBranch = branch.homeToSelectedMenu(selectedHomeMenu);

            if (stateOfBranch == 1) {
                basket = branch.PutFoodInBasket(selectedHomeMenu, basket);
            } else if (stateOfBranch == 2) {
                basket = branch.shoppingBasket(basket);
            } else if (stateOfBranch == 3) {
                System.exit(0);
            }
        }
    }
}