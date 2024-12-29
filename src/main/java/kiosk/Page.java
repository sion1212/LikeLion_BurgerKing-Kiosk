package kiosk;

import java.util.ArrayList;

public class Page {
    int GOHOME = 0;
    public int home(){
        Printing printing = new Printing();
        Input input = new Input();

        printing.home();

        return input.homeMenu();
    }

    public int basket(ArrayList<SelectedMenu> shoppingBasket) {
        Printing printing = new Printing();
        Input input = new Input();

        printing.shoppingBasketPage(shoppingBasket);
        return input.foodMenu();
    };

    public int selectFood(int menu) {
        Branch branch = new Branch();
        Input input = new Input();

        branch.decideWhichCategoryToPrint(menu);

        return input.foodMenu();
    }

    public ArrayList<SelectedMenu> controlAmount(ArrayList<SelectedMenu> shoppingBasket) {
        Printing printing = new Printing();
        Input input = new Input();
        Operation operation = new Operation();

        printing.amountControlPage(shoppingBasket);
        int menuIndexToChangeAmount = input.basketIndex(shoppingBasket);
        if(menuIndexToChangeAmount-- != GOHOME){
            System.out.print("변경할 수량을 입력하세요:");
            int updateAmount = input.amount();

            shoppingBasket = operation.updateAmount(menuIndexToChangeAmount,shoppingBasket,updateAmount);
            System.out.println("수정완료\n");
        }
        return shoppingBasket;
    }

    public ArrayList<SelectedMenu> delete(ArrayList<SelectedMenu> shoppingBasket) {
        Printing printing = new Printing();
        Input input = new Input();
        Operation operation = new Operation();
        int menuNumberToDelete;
        int sureToDelete;

        printing.deletePage(shoppingBasket);
        menuNumberToDelete = input.basketIndex(shoppingBasket);
        if(menuNumberToDelete != 0){
            System.out.print("정말 삭제 하시겠습니까? (0: 취소 및 홈으로 1: 삭제):");
            sureToDelete = input.whetherToDeleteOrNot(); // 메소드 이름에 맞는거 하나 만들기
            if(sureToDelete == 1){
                shoppingBasket = operation.delete(menuNumberToDelete, shoppingBasket);
                System.out.println("삭제완료\n");
            }
        }
        return shoppingBasket;
    }
}
