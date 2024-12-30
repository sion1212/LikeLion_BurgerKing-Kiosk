package kiosk;

import java.time.temporal.ValueRange;
import java.util.ArrayList;

public class Operation {
    public ArrayList<SelectedMenu> PutMenuInShoppingBasket(int menu, int selectedMenu, ArrayList<SelectedMenu> shoppingBasket){
        Branch branch = new Branch();
        ArrayList<Menu> MENU = branch.initializeMenu(menu);
        int selectedMenuIndex = selectedMenu - 1;
        int duplicatedIndex;
        final int NON_DUPLICATE = -1;

        SelectedMenu selectedFood = new SelectedMenu(MENU.get(selectedMenuIndex).getName(),MENU.get(selectedMenuIndex).getPrice());

        duplicatedIndex = findDuplicatedIndex(selectedFood, shoppingBasket);
        if(duplicatedIndex == NON_DUPLICATE){
            shoppingBasket.add(selectedFood);
        }
        else{
            shoppingBasket = updateAmountByOne(duplicatedIndex, shoppingBasket);
        }
        return shoppingBasket;
    }

    public ArrayList<SelectedMenu> updateAmount(int index, ArrayList<SelectedMenu> shoppingBasket, int updateAmount){
        SelectedMenu countUpMenu = shoppingBasket.get(index);
        countUpMenu.setAmount(updateAmount); // 유효성 검사 진행하기
        shoppingBasket.set(index, countUpMenu);
        return shoppingBasket;
    }

    public ArrayList<SelectedMenu> delete(int index, ArrayList<SelectedMenu> shoppingBasket){
        shoppingBasket.remove(index);
        return shoppingBasket;
    }

    public ArrayList<SelectedMenu> updateAmountByOne(int index, ArrayList<SelectedMenu> shoppingBasket){
        Validation validation = new Validation();

        SelectedMenu selectedMenu = shoppingBasket.get(index);
        int OneIncreasedAmount = selectedMenu.getAmount() + 1;
        if(validation.amount(OneIncreasedAmount)){
            selectedMenu.setAmount(selectedMenu.getAmount() + 1); // 유효성 검사 진행하기
        }
        else{
            throw new IllegalArgumentException("Too Many Amount");
        }
        shoppingBasket.set(index, selectedMenu);
        return shoppingBasket;
    }

    public int findDuplicatedIndex(Menu food, ArrayList<SelectedMenu> shoppingBasket){
        final int NON_DUPLICATE = -1;
        int duplicatedIndex = NON_DUPLICATE;
        boolean duplicated = false;
        for(Menu foodInBasket : shoppingBasket){
            duplicatedIndex++;
            if(foodInBasket.getName().equals(food.getName())){
                duplicated = true;
                break;
            }
        }
        if(!duplicated){
            return NON_DUPLICATE;
        }
        else{
            return duplicatedIndex;
        }
    }

    public int calTotalPriceOfBasket(ArrayList<SelectedMenu> shoppingBasket){
        int totalPrice = 0;
        for(SelectedMenu selectedMenu : shoppingBasket){
            totalPrice += selectedMenu.getPrice() * selectedMenu.getAmount();
        }
        return totalPrice;
    }

    public void orderCompleted(){
        System.out.println("주문완료\n");
        System.exit(0);
    }
}
