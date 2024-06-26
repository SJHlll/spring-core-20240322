package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wr")
public class WesternRestaurant implements Restaurant {

    // 의존 객체
    private Chef chef;
    private WesternCourse course = new WesternCourse();

    @Autowired
    public WesternRestaurant(@Qualifier("jc") Chef chef) {
        this.chef = chef;
    }

    // 요리를 주문하는 기능
    public void order() {
        System.out.println("서양 요리를 만드는 중");
        // 요리 코스 메뉴 구성
        course.combineMenu();
        // 요리사에게 요리 명령 내리기
        chef.cook();
    }

}
