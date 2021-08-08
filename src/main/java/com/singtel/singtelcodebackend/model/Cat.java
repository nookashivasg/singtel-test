package com.singtel.singtelcodebackend.model;

import com.singtel.singtelcodebackend.actions.Onomatopoeic;
import com.singtel.singtelcodebackend.actions.Walker;
import com.singtel.singtelcodebackend.enums.Sound;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat extends Animal implements Walker, Onomatopoeic {

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean walk() {
        log.info("I am walking");
        return true;
    }

    @Override
    public String sound() {
        log.info(Sound.CAT.getSound());
        return Sound.CAT.getSound();
    }

}
