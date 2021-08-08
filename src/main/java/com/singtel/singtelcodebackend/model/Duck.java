package com.singtel.singtelcodebackend.model;

import com.singtel.singtelcodebackend.actions.Swimmer;
import com.singtel.singtelcodebackend.enums.Sound;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Duck extends Bird implements Swimmer {


    public Duck() {
        super();
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public String sing() {
        log.info(Sound.DUCK.getSound());
        return Sound.DUCK.getSound();
    }

    @Override
    public boolean swim() {
        log.info("I am swimming");
        return true;
    }

}
