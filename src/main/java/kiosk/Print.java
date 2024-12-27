package kiosk;

import java.util.ArrayList;

public class Print {
    public void home(){
        System.out.println("=====홈=====\n");
        System.out.println("1. 햄버거\n" + "2. 사이드\n" + "3. 음료\n" + "4. 장바구니\n" + "5. 종료\n");
        System.out.print("메뉴선택:");
    }

    public void burgers (ArrayList<Menu> burgers){
        System.out.println("=====햄버거 메뉴=====\n");
        printElements(burgers);
        System.out.print("\n메뉴선택 (0을 선택 시 홈으로):");
    }

    public void sides (ArrayList<Menu> sides){
        System.out.println("=====햄버거 메뉴=====\n");
        printElements(sides);
        System.out.print("\n메뉴선택 (0을 선택 시 홈으로):");
    }

    public void beverages (ArrayList<Menu> beverages){
        System.out.println("=====햄버거 메뉴=====\n");
        printElements(beverages);
        System.out.print("\n메뉴선택 (0을 선택 시 홈으로):");
    }

    private void printElements(ArrayList<Menu> menus){
        int serialNumber = 1;
        for(Menu menu : menus){
            System.out.println(serialNumber + ". " + menu.toString());
            serialNumber++;
        }
    }
}
