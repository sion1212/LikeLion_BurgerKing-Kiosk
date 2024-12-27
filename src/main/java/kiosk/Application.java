package kiosk;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    public void run(){
        Print print = new Print();
        Input input = new Input();
        Branch branch = new Branch();

        int menu;
        boolean exit = false;
        while(true){
            //홈 화면 출력하는 부분
            print.home();
            menu = input.menuNumber();
                //1,2,3메뉴 선택 : 해당 메뉴 출력 > 메뉴선택 받기
                exit = branch.homeToSelectedMenu(menu);
                if(exit) break;
                    //메뉴를 고르면 장바구니에 담고, 메세지 출력하고 홈 화면으로 이동

                //4 장바구니 선택시 지금까지 담긴 메뉴, 선택가능한 메뉴, 총 금액 출력

                    //1 주문 완료 : "주문완료" 메세지 출력하고 exit

                    //2 수량 조절하기 : 현재 장바구니 출력 > 조절할 메뉴 번호 받고, 변경할 수량 입력받기

                    //3 삭제하기 : 장바구니 출력 > 삭제할 번호 받고, 정말 삭제할건지 물어보기
        }
    }
}