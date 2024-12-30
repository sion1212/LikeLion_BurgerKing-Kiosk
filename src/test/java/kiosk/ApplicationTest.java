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

//        @Test
//    void 평점평균_계산() {
//        run("데이타구조-3-A0,자바프로그래밍언어-3-B+,컴퓨터구조-3-C0,컴퓨터네트워크-3-D+",
//                "미술의이해-3-P,교양특론3-1-NP,기독교의이해-2-F");
//        assertThat(output()).contains(
//                "<과목 목록>",
//                "[전공] 데이타구조,3,A0",
//                "[전공] 자바프로그래밍언어,3,B+",
//                "[전공] 컴퓨터구조,3,C0",
//                "[전공] 컴퓨터네트워크,3,D+",
//                "[교양] 미술의이해,3,P",
//                "[교양] 교양특론3,1,NP",
//                "[교양] 기독교의이해,2,F",
//                "<취득학점>",
//                "15학점",
//                "<평점평균>",
//                "2.36 / 4.5",
//                "<전공 평점평균>",
//                "2.75 / 4.5"
//        );
//    }
//
//    @Test
//    void 예외처리_잘못된_성적_입력() {
//        assertThatIllegalArgumentException()
//                .isThrownBy(() -> {
//                    run("자바프로그래밍언어-3-E0", "한동인성교육-1-P");
//                    run("자바프로그래밍언어-3-A+", "한동인성교육-1-PD");
//                });
//    }
//
//    @Test
//    void 예외처리_잘못된_학점_입력() {
//        assertThatIllegalArgumentException()
//                .isThrownBy(() -> {
//                    run("프로그래밍언어론-5-A0", "한동인성교육-1-P");
//                    run("프로그래밍언어론-3-A0", "한동인성교육-0-P");
//                });
//    }
//
//    @Override
//    protected void runMain() {
//        Application.main(new String[]{});
//    }
}