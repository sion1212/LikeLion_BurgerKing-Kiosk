package kiosk;

import java.util.ArrayList;

public class Branch {
    Print print = new Print();
    Input input = new Input();

    public boolean homeToSelectedMenu(int menu){
        boolean isExit = false;
        int selectedMenu;

        if(menu == 1 || menu == 2 || menu == 3){
            DecideWhichCategoryToPrint(menu);
            selectedMenu = input.menuNumber();
        }
        else if(menu == 4){

        }
        else if(menu == 5){
            isExit = true;
        }
        return isExit;
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
