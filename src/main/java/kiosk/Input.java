package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    Validation validation = new Validation();
    public int homeMenu() {
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        scanner.nextLine();

        if(validation.homeMenu(menu)) {
            return menu;
        }
        throw new IllegalArgumentException("Invalid menu");
    }

    public int foodMenu() {
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        scanner.nextLine();

        if(validation.IndexOfFoodMenu(menu)) {
            return menu;
        }
        throw new IllegalArgumentException("Invalid menu");
    }

    public int basketIndex(ArrayList<SelectedMenu> basket) {
        Scanner scanner = new Scanner(System.in);
        int serial = scanner.nextInt();
        scanner.nextLine();

        if(validation.indexOfBasket(serial, basket)) {
            return serial;
        }
        throw new IllegalArgumentException("Invalid menu");
    }

    public int whetherToDeleteOrNot() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.nextLine();

        if(validation.confirm(value)) {
            return value;
        }
        throw new IllegalArgumentException("Invalid value");
    }

    public int amount(){
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        scanner.nextLine();

        if(validation.amount(amount)) {
            return amount;
        }
        throw new IllegalArgumentException("Amount must be between 1 and 50");
    }


}
