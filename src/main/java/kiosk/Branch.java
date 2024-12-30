package kiosk;

import java.util.ArrayList;

public class Branch {
    Printing print = new Printing();
    int GOHOME = 0;

    public int homeToSelectedMenu(int menu){
        if(menu == 1 || menu == 2 || menu == 3){
            return 1;
        }
        else if(menu == 4){
            return 2;
        }
        else if(menu == 5){
            return 3;
        }
            throw new IllegalArgumentException("Invalid menu");
    }

    public void decideWhichCategoryToPrint(int menu){
        Initialization initialization = new Initialization();

        if(menu == 1){
            print.burgers(initialization.burgers());
        }
        else if(menu == 2){
            print.sides(initialization.sides());
        }
        else if(menu == 3){
            print.beverages(initialization.beverages());
        }
    }

    public ArrayList<Menu> initializeMenu(int menu){
        Initialization initialization = new Initialization();
        if(menu == 1){
            return initialization.burgers();
        }
        else if(menu == 2){
            return initialization.sides();
        }
        else if(menu == 3){
            return initialization.beverages();
        }
        return null;
    }

    public ArrayList<SelectedMenu> shoppingBasket(ArrayList<SelectedMenu> shoppingBasket){
        Page page = new Page();
        Operation operation = new Operation();
        int selectedMenu = page.basket(shoppingBasket);

        if(selectedMenu == 1){
            operation.orderCompleted();
        }
        else if(selectedMenu == 2){
            shoppingBasket = page.controlAmount(shoppingBasket);
        }
        else if(selectedMenu == 3){
            shoppingBasket = page.delete(shoppingBasket);
        }
        return shoppingBasket;
    }

    public ArrayList<SelectedMenu> PutFoodInBasket(int menu, ArrayList<SelectedMenu> shoppingBasket){
        Operation operation = new Operation();
        Page page = new Page();

        int selectedMenu = page.selectFood(menu);
        if (selectedMenu != GOHOME) {
            shoppingBasket = operation.PutMenuInShoppingBasket(menu, selectedMenu, shoppingBasket);
        }

        return shoppingBasket;
    }
}
