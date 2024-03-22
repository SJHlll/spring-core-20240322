package com.spring.core.chap01;

public class AsianRestaurant implements Restaurant {

    private Chef chef;
    private SushiCourse course = new SushiCourse();

    public void order() {
        System.out.println("스시를 만드는 중");
        course.combineMenu();
        chef.cook();
    }

}
