package com.spring.core.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void lombokTest() {
        Person p1 = new Person();
        p1.setName("김철수");
        p1.setAge(30);

        String name = p1.getName();

        System.out.println("p1 = " + p1);

        Person p2 = new Person("박영희", 35);

    }

}