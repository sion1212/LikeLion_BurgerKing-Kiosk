package kiosk;

import java.util.ArrayList;

public class Validation {
    final int GO_TO_HOME_NUMBER = 0;
    final int MAX_VALUE_OF_FOOD_MENU = 6;

    public boolean amount(int amount){
        return amount >= 1 && amount <= 50;
    }

    public boolean confirm(int confirm){
        return confirm == 1 || confirm == 0;
    }

    public boolean indexOfBasket(int serial, ArrayList<SelectedMenu> basket){
        return serial >= GO_TO_HOME_NUMBER && serial <= basket.size();
    }

    public boolean homeMenu(int menu){
        return menu >= 1 && menu <= 5;
    }

    public boolean IndexOfFoodMenu(int menu){
        return menu >= GO_TO_HOME_NUMBER && menu <= MAX_VALUE_OF_FOOD_MENU;
    }
}
