package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public int homeMenu() {
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        scanner.nextLine();

        if(menu >= 1 && menu <= 5) {
            return menu;
        }
        throw new IllegalArgumentException("Invalid menu");
    }

    public int foodMenu() {
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        scanner.nextLine();

        if(menu >= 0 && menu <= 6) {
            return menu;
        }
        throw new IllegalArgumentException("Invalid menu");
    }

    public int basketIndex(ArrayList<SelectedMenu> basket) {
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        scanner.nextLine();

        if(menu >= 0 && menu <= basket.size()) {
            return menu;
        }
        throw new IllegalArgumentException("Invalid menu");
    }

    public int whetherToDeleteOrNot() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.nextLine();

        if(value == 1 || value == 0) {
            return value;
        }
        throw new IllegalArgumentException("Invalid value");
    }

    public int amount(){
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        scanner.nextLine();

        if(amount >= 1 && amount <= 50){
            return amount;
        }
        throw new IllegalArgumentException("Amount must be between 1 and 50");
    }


}
