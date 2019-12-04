package com.sunderville.tanks.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellTest {

    @Test
    public void getShellVolume() {

        Shell shell = new Shell();
        float actualResult = shell.getShellVolume("10430", "5", "5", "5", "5", "5", "5",
                "5", "5", "0", "0", "0", "0");
        float expectedResult = 1.965012f;
        if(actualResult != expectedResult){
            System.out.println("Not working. It's " + actualResult);
        }


    }
}