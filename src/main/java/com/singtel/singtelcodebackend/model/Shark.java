package com.singtel.singtelcodebackend.model;

import com.singtel.singtelcodebackend.actions.Carnivore;
import com.singtel.singtelcodebackend.enums.Color;
import com.singtel.singtelcodebackend.enums.Size;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Shark extends Fish implements Carnivore {

    public Shark() {
        super();
    }

    public Shark(String name) {
        super(name, Color.GREY, Size.LARGE);
    }

    @Override
    public boolean prey() {
        log.info("I hunt and eat other fish");
        return true;
    }

}
