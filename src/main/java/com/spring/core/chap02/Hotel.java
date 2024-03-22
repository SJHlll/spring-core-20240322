package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component를 지정한 클래스는
// 스프링 컨테이너(빈을 저장하는 공간)에 객체가 생성되고 관리된다
@Component
public class Hotel {

    // 의존관계 : 어떤 객체가 정상 동작을 위해 다른 객체를 필요로 하는 값
    private Restaurant restaurant;
    private Chef chef;

    @Autowired // 스프링에 빈으로 등록된 의존 객체를 알아서 넣어주는 기능
    public Hotel(@Qualifier("wr") Restaurant restaurant, @Qualifier("jc") Chef chef) {
        this.restaurant = restaurant;
        this.chef = chef;
    }

    // 레스토랑 예약 기능
    public void reserve() {
        // 예약을 수행하려면 레스토랑에 연락해서 예약을 넣어야 한다
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 쉐프는 %s입니다.\n",
                restaurant.getClass().getSimpleName(), chef.getClass().getSimpleName());
        restaurant.order();
    }

}
