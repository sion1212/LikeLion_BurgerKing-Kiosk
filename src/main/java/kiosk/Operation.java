package kiosk;

import java.util.ArrayList;

public class Operation {
    public ArrayList<SelectedMenu> PutMenuInShoppingBasket(int menu, int selectedMenu, ArrayList<SelectedMenu> shoppingBasket){
        Branch branch = new Branch();
        ArrayList<Menu> MENU = branch.initializeMenu(menu);
        int selectedMenuIndex = selectedMenu - 1;
        int duplicatedIndex;
        final int NONDUPLICATE = -1;

        SelectedMenu selectedFood = new SelectedMenu(MENU.get(selectedMenuIndex).getName(),MENU.get(selectedMenuIndex).getPrice());
        // 선택된 메뉴가 중복되었다면 수량을 올리고, 중복되지 않았다면 해당 객체를 추가한다
        duplicatedIndex = findDuplicatedIndex(selectedFood, shoppingBasket);
        if(duplicatedIndex == NONDUPLICATE){
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

    private ArrayList<SelectedMenu> updateAmountByOne(int index, ArrayList<SelectedMenu> shoppingBasket){
        SelectedMenu countUpMenu = shoppingBasket.get(index);
        countUpMenu.setAmount(countUpMenu.getAmount() + 1); // 유효성 검사 진행하기
        shoppingBasket.set(index, countUpMenu);
        return shoppingBasket;
    }

    private int findDuplicatedIndex(Menu food, ArrayList<SelectedMenu> shoppingBasket){
        int duplicatedIndex = -1;
        for(Menu foodInBasket : shoppingBasket){
            duplicatedIndex++;
            if(foodInBasket.getName().equals(food.getName())){
                break;
            }
        }
        return duplicatedIndex;
    }
}
