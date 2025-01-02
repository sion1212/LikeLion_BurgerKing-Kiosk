package kiosk;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.assertj.core.api.Assertions.*;

class ApplicationTest{
    @Test
    public void sumOfPriceWhenNullElement(){
        Operation operation = new Operation();
        ArrayList<SelectedMenu> result = setArray();

        Assertions.assertEquals(693400,operation.calTotalPriceOfBasket(result));
    }

    @Test
    public void findDuplicatedIndex(){
        Operation operation = new Operation();
        ArrayList<SelectedMenu> result = setArray();
        int DUMMY = 1000;
        final int INDEX_OF_test3 = 2;
        final int INDEX_OF_NONDUPLICATED = -1;

        Menu duplicatedMenu = new Menu("test3",DUMMY);
        Menu nonDuplicatedMenu = new Menu("nonDuplicate",DUMMY);

        Assertions.assertEquals(INDEX_OF_test3,operation.findDuplicatedIndex(duplicatedMenu,result));
        Assertions.assertEquals(INDEX_OF_NONDUPLICATED,operation.findDuplicatedIndex(nonDuplicatedMenu,result));
    }

    @Test
    public void updateAmountByOne(){
        Operation operation = new Operation();
        ArrayList<SelectedMenu> basket = new ArrayList<>();
        ArrayList<SelectedMenu> basketTest = new ArrayList<>();

        SelectedMenu testMenu = new SelectedMenu("testAmount",10000);
        testMenu.setAmount(2);
        basketTest.add(testMenu);

        basket.add(new SelectedMenu("testAmount",10000));
        operation.updateAmountByOne(0,basket);

        Assertions.assertEquals(basket.get(0).getAmount(),basketTest.get(0).getAmount());
    }



    public ArrayList<SelectedMenu> setArray(){
        SelectedMenu selectedMenu1 = new SelectedMenu("test1",2000);
        SelectedMenu selectedMenu2 = new SelectedMenu("test2",8900);
        SelectedMenu selectedMenu3 = new SelectedMenu("test3",1800);
        SelectedMenu selectedMenu4 = new SelectedMenu("test4",7900);
        SelectedMenu selectedMenu5 = new SelectedMenu("test5",3000);
        selectedMenu1.setAmount(14);
        selectedMenu2.setAmount(48);
        selectedMenu3.setAmount(33);
        selectedMenu4.setAmount(12);
        selectedMenu5.setAmount(28);

        ArrayList<SelectedMenu> result = new ArrayList<>();

        result.add(selectedMenu1);
        result.add(selectedMenu2);
        result.add(selectedMenu3);
        result.add(selectedMenu4);
        result.add(selectedMenu5);

        return result;
    }
}