package com.singtel.singtelcodebackend.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sound {

    BIRD("I am singing"),
    CHICKEN("Cluck Cluck"),
    DUCK("Quack Quack"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof woof"),
    CAT("Meow meow"),
    PARROT("Squawk squawk"),
    PHONE_RINGTONE("Ring ring"),
    DOLPHIN("Squeak squeak");

    private String sound;

}
