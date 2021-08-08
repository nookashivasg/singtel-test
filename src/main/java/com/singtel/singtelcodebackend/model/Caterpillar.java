package com.singtel.singtelcodebackend.model;

import com.singtel.singtelcodebackend.actions.Metamorphic;
import com.singtel.singtelcodebackend.actions.Walker;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
public class Caterpillar extends Insect implements Walker, Metamorphic<Butterfly> {

    public Caterpillar() {
    }

    public Caterpillar(String name) {
        super(name);
    }

    @Override
    public boolean walk() {
        log.info("I can walk. I meant I can crawl!");
        return true;
    }

    @Override
    public Butterfly metamorphosis() throws Exception {
        return new Butterfly(this);
    }

}
