package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ar")
public class AsianRestaurant implements Restaurant {

    private Chef chef;
    private SushiCourse course = new SushiCourse();

    @Autowired
    public AsianRestaurant(@Qualifier("kc") Chef chef) {
        this.chef = chef;
    }

    public void order() {
        System.out.println("스시를 만드는 중");
        course.combineMenu();
        chef.cook();
    }

}
