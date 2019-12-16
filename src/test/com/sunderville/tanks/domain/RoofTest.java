package com.sunderville.tanks.domain;

import org.junit.Assert;
import org.junit.Test;

public class RoofTest {

    @Test
    public void getActualRoofMass() {
        Tank tank = new Tank("10430",
                "8", "8", "6", "6", "5", "5",
                "5", "5", "0", "0", "0", "0",
                "8", "6", "6", "2", "2",
                "Other1", "1", "Other2", "2");
        long actual = Roof.getActualRoofMass(tank);
        Assert.assertEquals(5379, actual);
    }

    @Test
    public void getRegularRoofMass() {
        Tank tank = new Tank("10430",
                "8", "8", "6", "6", "5", "5",
                "5", "5", "0", "0", "0", "0",
                "8", "6", "6", "2", "2",
                "Other1", "1", "Other2", "2");
        long actual = Roof.getRegularRoofMass(tank);
        Assert.assertEquals(5379, actual);
    }
}