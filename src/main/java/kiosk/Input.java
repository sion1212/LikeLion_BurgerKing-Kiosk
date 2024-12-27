package kiosk;

import java.util.Scanner;

public class Input {
    public int menuNumber() {
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        scanner.nextLine();
        return menu;
    }


}
