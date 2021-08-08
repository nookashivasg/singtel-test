package com.singtel.singtelcodebackend.model;

import com.singtel.singtelcodebackend.actions.Singer;
import com.singtel.singtelcodebackend.actions.Walker;
import com.singtel.singtelcodebackend.enums.Sound;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bird extends Animal implements Walker, Singer {

    public Bird() {
        super();
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public boolean walk() {
        log.info("I am walking");
        return true;
    }

    @Override
    public String sing() {
        log.info(Sound.BIRD.getSound());
        return Sound.BIRD.getSound();
    }

}
