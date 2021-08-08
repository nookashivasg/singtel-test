package com.singtel.singtelcodebackend.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sound {

    BIRD("I am singing"),
    CHICKEN("Cluck Cluck"),
    DUCK("Quack Quack");
    private String sound;

}
