package kiosk;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    public void run(){
        Print print = new Print();
        Input input = new Input();
        Branch branch = new Branch();
        Initialization initialization = new Initialization();
        Operation operation = new Operation();

        int menu;
        int stateOfBranch;
        ArrayList<SelectedMenu> shoppingBasket = new ArrayList<>();

        while(true){
            //홈 화면 출력하는 부분
            print.home();
            menu = input.menuNumber();
                //1,2,3메뉴 선택 : 해당 메뉴 출력 > 메뉴선택 받기
                stateOfBranch = branch.homeToSelectedMenu(menu);
                if(stateOfBranch == 1){
                    branch.decideWhichCategoryToPrint(menu);
                    int selectedMenu = input.menuNumber();
                    if(selectedMenu == 0){ continue; }
                    operation.PutMenuInShoppingBasket(menu,selectedMenu,shoppingBasket);
                    continue;
                }
                else if(stateOfBranch == 2){ //4 장바구니 선택시 지금까지 담긴 메뉴, 선택가능한 메뉴, 총 금액 출력
                    int totalPrice = 0;
                    int selectedMenu;
                    System.out.println("===== 장바구니 =====\n");
                    for(SelectedMenu selectedMenu1 : shoppingBasket){ // 변수이름 바꿔야함
                        totalPrice += selectedMenu1.getPrice() * selectedMenu1.getAmount();
                        System.out.println(selectedMenu1.toString());
                    }
                    System.out.println("\n====================");
                    System.out.println("1. 주문하기 \n" +
                            "2. 수량 조절하기\n" +
                            "3. 삭제하기\n");
                    System.out.println("총 가격: "+totalPrice+"원\n");
                    System.out.println("메뉴선택 (0을 선택 시 홈으로):");
                    selectedMenu = input.menuNumber();

                    if(selectedMenu == 0){ continue; }
                    else if(selectedMenu == 1){
                        System.out.println("주문완료");
                        System.exit(0);
                    }
                    else if(selectedMenu == 2){
                        int index=-1;
                        int menuNumberToChangeAmount;
                        System.out.println("===== 수량 조절하기 =====\n" +
                                "\n" +
                                "현재 장바구니\n");
                        for(SelectedMenu selectedMenu1 : shoppingBasket){ // 변수이름 바꿔야함
                            index++;
                            System.out.println(index+". "+selectedMenu1.toString());
                        }
                        System.out.println();
                        System.out.print("수량을 조절할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로):");
                        menuNumberToChangeAmount = input.menuNumber();
                        System.out.print("변경할 수량을 입력하세요:");
                        int updateAmount = input.menuNumber(); // 이름 다른 메소드 하나 더 만들기 - 유효성검사 진행(클래스를 하나 만들자)
                        shoppingBasket = operation.updateAmount(menuNumberToChangeAmount,shoppingBasket,updateAmount);
                        System.out.println("수정완료");
                    }
                    else if(selectedMenu == 3){
                        int index=-1;
                        int menuNumberToDelete;
                        int sureToDelete;
                        System.out.println("===== 삭제하기 =====\n" +
                                "\n" +
                                "현재 장바구니\n");
                        for(SelectedMenu selectedMenu1 : shoppingBasket){ // 변수이름 바꿔야함
                            index++;
                            System.out.println(index+". "+selectedMenu1.toString());
                        }
                        System.out.println();
                        System.out.print("삭제할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로):");
                        menuNumberToDelete = input.menuNumber();
                        System.out.print("정말 삭제 하시겠습니까? (0: 취소 및 홈으로 1: 삭제):");
                        sureToDelete = input.menuNumber(); // 메소드 이름에 맞는거 하나 만들기
                        if(sureToDelete == 0){ continue; }
                        else if(sureToDelete == 1){
                            shoppingBasket = operation.delete(menuNumberToDelete, shoppingBasket);
                        }
                    }
                }
                else if(stateOfBranch == 3){
                    System.exit(0);
                }
                    //메뉴를 고르면 장바구니에 담고, 메세지 출력하고 홈 화면으로 이동

                //4 장바구니 선택시 지금까지 담긴 메뉴, 선택가능한 메뉴, 총 금액 출력

                    //1 주문 완료 : "주문완료" 메세지 출력하고 exit

                    //2 수량 조절하기 : 현재 장바구니 출력 > 조절할 메뉴 번호 받고, 변경할 수량 입력받기

                    //3 삭제하기 : 장바구니 출력 > 삭제할 번호 받고, 정말 삭제할건지 물어보기
        }
    }
}