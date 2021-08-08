package com.singtel.singtelcodebackend.application;

import com.singtel.singtelcodebackend.model.Bird;
import com.singtel.singtelcodebackend.model.Chicken;
import com.singtel.singtelcodebackend.model.Duck;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {

    public static void main(String[] args) {
        try {
            log.info("--- Bird ---");
            Bird bird = new Bird();
            bird.walk();
            //  bird.fly();// All birds cannot Fly
            bird.sing();

            log.info("--- Chicken ---");
            Chicken chicken = new Chicken();
            chicken.walk();
            chicken.sing();
//            chicken.fly();// Chicken cannot fly

            log.info("--- Duck ---");
            Duck duck = new Duck();
            duck.walk();
            duck.swim();
            duck.sing();

        } catch (Exception e) {
            log.error("Exception : {}", e);
        }
    }
}
