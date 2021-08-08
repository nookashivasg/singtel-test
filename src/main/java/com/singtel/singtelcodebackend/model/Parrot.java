package com.singtel.singtelcodebackend.model;

import com.singtel.singtelcodebackend.actions.Flyer;
import com.singtel.singtelcodebackend.actions.Imitator;
import com.singtel.singtelcodebackend.actions.Singer;
import com.singtel.singtelcodebackend.actions.Walker;
import com.singtel.singtelcodebackend.enums.Sound;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class Parrot extends Bird implements Flyer, Walker, Singer, Imitator {

    private String soundLearnt;

    public Parrot() {
        super();
    }

    public Parrot(String name) {
        super(name);
    }

    public Parrot(String name, String soundLearnt) {
        super(name);
        this.soundLearnt = soundLearnt;
    }

    @Override
    public boolean fly() {
        log.info("I am flying");
        return true;
    }

    @Override
    public boolean walk() {
        log.info("I am walking");
        return true;
    }

    @Override
    public String sing() {
        log.info(Sound.PARROT.getSound());
        return Sound.PARROT.getSound();
    }

    @Override
    public String mimicSound() {
        log.info(soundLearnt);
        return soundLearnt;
    }

}
