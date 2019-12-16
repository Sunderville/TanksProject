package com.sunderville.tanks.domain;

import java.util.ArrayList;
import java.util.List;

public class Shell {

    private static final int PI = 3140;


    public static long getShellVolume(Tank tank) {

        int perimeter = (2*PI) * (Integer.parseInt(tank.getDiameterText())/2)/1000;

        List<String> allRingsTextList = new ArrayList<>();
        allRingsTextList.add(tank.getRing1Text());
        allRingsTextList.add(tank.getRing2Text());
        allRingsTextList.add(tank.getRing3Text());
        allRingsTextList.add(tank.getRing4Text());
        allRingsTextList.add(tank.getRing5Text());
        allRingsTextList.add(tank.getRing6Text());
        allRingsTextList.add(tank.getRing7Text());
        allRingsTextList.add(tank.getRing8Text());
        allRingsTextList.add(tank.getRing9Text());
        allRingsTextList.add(tank.getRing10Text());
        allRingsTextList.add(tank.getRing11Text());
        allRingsTextList.add(tank.getRing12Text());

        int allRingsVolume = 0;
        for (String s : allRingsTextList) {
            if (s.equals("")) s = "0";
            int sI = 1500 * perimeter * Integer.parseInt(s)/1000;
            allRingsVolume = allRingsVolume + sI;
        }

        return allRingsVolume;
    }

}
