package com.sunderville.tanks.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JustUniversalTest {


    public static void main(String[] args) {
        Tank tank = new Tank("10430",
                "8", "8", "6", "6", "5", "5",
                "5", "5", "0", "0", "0", "0",
                "8", "6", "6", "2", "2",
                "Other1", "1", "Other2", "2");

        Bottom.getBottomVolume(tank);


    }

    }



