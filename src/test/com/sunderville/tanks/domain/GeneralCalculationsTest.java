package com.sunderville.tanks.domain;

import com.sunderville.tanks.MainWindowController;
import javafx.scene.control.MenuButton;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneralCalculationsTest {

//    TODO: реализовать через Reflection

    @Test
    public void resultMass() {
        Tank tank = new Tank("28500",
                "12", "12", "10", "10", "10", "10",
                "8", "8", "8", "8", "8", "8",
                "8", "6", "5", "5", "5",
                "Other1", "4", "Other2", "4");
//
//        Class mainWindow_reflected = Class.forName("MainWindowController");
//        Field steel_type_reflect = mainWindow_reflected.getDeclaredField("steel_type");
//
//        double actual = 0;
//
//        Method getText_reflect = null;
//        try {
//            steel_type_reflect = MainWindowController.class.getField("steel_type");
//            getText_reflect = MainWindowController.class.getMethod("javafx.scene.control.Labeled.getText()");
//        } catch (NoSuchFieldException | NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//
//
//
//        Assert.assertEquals(291.0d, actual);
    }

    @Test
    public void resultPrice() {
//        Tank tank = new Tank("10430",
//                "8", "8", "6", "6", "5", "5",
//                "5", "5", "0", "0", "0", "0",
//                "8", "6", "6", "2", "2",
//                "Other1", "1", "Other2", "2");
//        long actual = Bottom.getBottomVolume(tank);
//        Assert.assertEquals(588383, actual);
    }
}