package com.sunderville.tanks.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShellTest {

    @Test
    public void getShellVolume() {
        Tank tank = new Tank("10430",
                "8", "8", "6", "6", "5", "5",
                "5", "5", "0", "0", "0", "0",
                "8", "6", "6", "2", "2",
                "Other1", "1", "Other2", "2");
        long actual = Shell.getShellVolume(tank);
        Assert.assertEquals(2358000, actual);
    }
}