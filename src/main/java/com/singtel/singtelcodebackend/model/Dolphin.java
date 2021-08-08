package com.singtel.singtelcodebackend.model;

import com.singtel.singtelcodebackend.actions.Onomatopoeic;
import com.singtel.singtelcodebackend.actions.Swimmer;
import com.singtel.singtelcodebackend.enums.Sound;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dolphin extends Animal implements Swimmer, Onomatopoeic {

    public Dolphin() {
        super();
    }

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public boolean swim() {
        log.info("I am really good at swimming!");
        return true;
    }

    @Override
    public String sound() {
        log.info(Sound.DOLPHIN.getSound());
        return Sound.DOLPHIN.getSound();
    }
}
