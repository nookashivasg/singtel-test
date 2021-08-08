package com.singtel.singtelcodebackend;

import com.singtel.singtelcodebackend.actions.Flyer;
import com.singtel.singtelcodebackend.actions.Swimmer;
import com.singtel.singtelcodebackend.enums.Sound;
import com.singtel.singtelcodebackend.model.Bird;
import com.singtel.singtelcodebackend.model.Chicken;
import com.singtel.singtelcodebackend.model.Duck;
import com.singtel.singtelcodebackend.model.Rooster;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Slf4j
public class TestScenario1 {

    Bird bird;
    Duck duck;
    Chicken chicken;
    Rooster rooster;

    @Before
    public void setUp() throws Exception {
        bird = new Bird();
        duck = new Duck();
        chicken = new Chicken();
        rooster = chicken.grow();
    }

    @After
    public void tearDown() throws Exception {
        bird = null;
        duck = null;
        chicken = null;
    }

    // Test A1
    @Test
    public void testBirdSings() {
        log.info("--- test Bird Sings ---");
        assertEquals(bird.sing(), Sound.BIRD.getSound());
    }

    @Test
    public void testBirdFlies() {
        log.info("--- test Bird Flies ---");
        assertTrue(!(bird instanceof Flyer));// Not All birds can Fly
        log.info("Not every bird can fly");
    }

    // Scenario 2
    @Test
    public void testDuckSings() {
        log.info("--- testDuckSings ---");
        assertEquals(duck.sing(), Sound.DUCK.getSound());
    }

    @Test
    public void testDuckSwims() {
        log.info("--- testDuckSwims ---");
        assertTrue(duck instanceof Swimmer);
        assertTrue(duck.swim());
    }

    @Test
    public void testChickenSings() {
        log.info("--- testChickenSings ---");
        assertEquals(chicken.sing(), Sound.CHICKEN.getSound());
    }

    @Test
    public void testChickenCannotFly() {
        log.info("--- testChickenCannotFly ---");
        assertTrue(!(chicken instanceof Flyer));
        log.info("Chicken cannot fly");
    }

    @Test
    public void testRoosterSings() {
        log.info("--- testRoosterSings ---");
        assertEquals(rooster.sing(), Sound.ROOSTER.getSound());
    }
}
