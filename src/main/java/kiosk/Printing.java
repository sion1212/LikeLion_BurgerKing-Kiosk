package kiosk;

import java.util.ArrayList;

public class Printing {
    public void home(){
        System.out.println("=====홈=====");
        System.out.println();
        System.out.println("1. 햄버거");
        System.out.println("2. 사이드");
        System.out.println("3. 음료");
        System.out.println("4. 장바구니");
        System.out.println("5. 종료");
        System.out.println();
        System.out.print("메뉴선택:");
    }

    public void burgers (ArrayList<Menu> burgers){
        System.out.println("=====햄버거 메뉴=====");
        System.out.println();
        printElements(burgers);
        System.out.println();
        System.out.print("메뉴선택 (0을 선택 시 홈으로):");
    }

    public void sides (ArrayList<Menu> sides){
        System.out.println("=====햄버거 메뉴=====");
        System.out.println();
        printElements(sides);
        System.out.println();
        System.out.print("메뉴선택 (0을 선택 시 홈으로):");
    }

    public void beverages (ArrayList<Menu> beverages){
        System.out.println("=====햄버거 메뉴=====");
        System.out.println();
        printElements(beverages);
        System.out.println();
        System.out.print("메뉴선택 (0을 선택 시 홈으로):");
    }

    public void shoppingBasketPage(ArrayList<SelectedMenu> shoppingBasket){
        Operation operation = new Operation();
        Printing printing = new Printing();

        System.out.println("===== 장바구니 =====");
        System.out.println();
        printing.printBasket(shoppingBasket);
        System.out.println();
        System.out.println("====================");
        System.out.println("1. 주문하기");
        System.out.println("2. 수량 조절하기");
        System.out.println("3. 삭제하기");
        System.out.println();
        int totalPrice = operation.calTotalPriceOfBasket(shoppingBasket);
        System.out.println("총 가격: "+totalPrice+"원\n");
        System.out.print("메뉴선택 (0을 선택 시 홈으로):");
    }

    private void printElements(ArrayList<Menu> menus){
        int serialNumber = 1;
        for(Menu menu : menus){
            System.out.println(serialNumber + ". " + menu.toString());
            serialNumber++;
        }
    }

    private void printBasket(ArrayList<SelectedMenu> basket){
        for(SelectedMenu menu : basket){
            System.out.println("- " + menu.toString());
        }
    }

    public void amountControlPage(ArrayList<SelectedMenu> shoppingBasket){
        Printing printing = new Printing();
        System.out.println("===== 수량 조절하기 =====");
        System.out.println();
        System.out.println("현재 장바구니");
        System.out.println();
        printing.printBasketWithIndex(shoppingBasket);
        System.out.println();
        System.out.print("수량을 조절할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로):");
    }

    private void printBasketWithIndex(ArrayList<SelectedMenu> shoppingBasket){
        int serial=1;
        for(SelectedMenu selectedMenu : shoppingBasket){ // 변수이름 바꿔야함
            System.out.println(serial+". "+selectedMenu.toString());
            serial++;
        }
    }

    public void deletePage(ArrayList<SelectedMenu> shoppingBasket){
        System.out.println("===== 삭제하기 =====");
        System.out.println();
        System.out.println("현재 장바구니");
        System.out.println();
        printBasketWithIndex(shoppingBasket);
        System.out.println();
        System.out.print("삭제할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로):");
    }
}
