package com.singtel.singtelcodebackend.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Size {
    LARGE("Large"),
    SMALL("Small");

    private String value;
}
