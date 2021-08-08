package com.singtel.singtelcodebackend.actions;

import com.singtel.singtelcodebackend.model.Animal;

public interface Grower<T extends Animal> {
    public T grow() throws Exception;
}
