package kiosk;

import java.util.ArrayList;

public class Branch {
    Print print = new Print();
    Input input = new Input();

    public int homeToSelectedMenu(int menu){
        if(menu == 1 || menu == 2 || menu == 3){
            return 1;
        }
        else if(menu == 4){
            return 2;
        }
        else if(menu == 5){
            return 0;
        }
            throw new IllegalArgumentException("Invalid menu");
    }

    public void DecideWhichCategoryToPrint(int menu){
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
}
