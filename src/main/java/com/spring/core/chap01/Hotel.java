package com.spring.core.chap01;

public class Hotel {

    // 의존관계 : 어떤 객체가 정상 동작을 위해 다른 객체를 필요로 하는 값
    private Restaurant restaurant;
    private Chef chef;

    public Hotel(Restaurant restaurant, Chef chef) {
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
