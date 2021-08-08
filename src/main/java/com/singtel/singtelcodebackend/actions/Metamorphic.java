package com.singtel.singtelcodebackend.actions;

import com.singtel.singtelcodebackend.model.Insect;

public interface Metamorphic<T extends Insect> {
    public T metamorphosis() throws Exception;
}
