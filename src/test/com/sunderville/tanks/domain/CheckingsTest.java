package com.sunderville.tanks.domain;

import com.sunderville.tanks.exceptions.DefineTankTypeException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingsTest {

    @Test
    public void defineTankType() throws DefineTankTypeException {
        Tank tank = new Tank("10430",
                "8", "8", "6", "6", "5", "5",
                "5", "5", "0", "0", "0", "0",
                "8", "6", "6", "2", "2",
                "Other1", "1", "Other2", "2");
        String actual = Checkings.defineTankType(tank);
        Assert.assertEquals("РВС-1000", actual);

    }

    @Test
    public void ringsNumber() {
        Tank tank = new Tank("10430",
                "8", "8", "6", "6", "5", "5",
                "5", "5", "0", "0", "0", "0",
                "8", "6", "6", "2", "2",
                "Other1", "1", "Other2", "2");
        int actual = Checkings.ringsNumber(tank);
        Assert.assertEquals(8, actual);

    }
}