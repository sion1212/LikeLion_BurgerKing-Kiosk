package kiosk;

import java.util.ArrayList;

public class Initialization {
    public ArrayList<Menu> burgers(){
        ArrayList<Menu> burgers = new ArrayList<>();
        burgers.add(new Menu(1, "와퍼", 6900));
        burgers.add(new Menu(1, "큐브 스테이크 와퍼", 8900));
        burgers.add(new Menu(1, "콰트로 치즈 와퍼", 7900));
        burgers.add(new Menu(1, "몬스터 와퍼", 9300));
        burgers.add(new Menu(1, "통새우 와퍼", 7900));
        burgers.add(new Menu(1, "블랙바베큐 와퍼", 9300));
        return burgers;
    }

    public ArrayList<Menu> sides(){
        ArrayList<Menu> sides = new ArrayList<>();
        sides.add(new Menu(1, "너겟킹", 2500));
        sides.add(new Menu(1, "해쉬 브라운", 1800));
        sides.add(new Menu(1, "치즈스틱", 1200));
        sides.add(new Menu(1, "어니언링", 2400));
        sides.add(new Menu(1, "바삭킹", 3000));
        sides.add(new Menu(1, "감자튀김", 2000));
        return sides;
    }

    public ArrayList<Menu> beverages(){
        ArrayList<Menu> beverages = new ArrayList<>();
        beverages.add(new Menu(1, "코카콜라", 2000));
        beverages.add(new Menu(1, "코카콜라 제로", 2000));
        beverages.add(new Menu(1, "펩시", 2000));
        beverages.add(new Menu(1, "펩시 제로", 2000));
        beverages.add(new Menu(1, "스프라이트", 2000));
        beverages.add(new Menu(1, "스프라이트 제로", 2000));
        return beverages;
    }
}