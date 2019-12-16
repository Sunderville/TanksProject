package com.sunderville.tanks.domain;

import java.util.ArrayList;
import java.util.List;

public class JustTest {

        private static final int PI = 3140;


        public static int getShellVolume(Tank tank) {

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

            System.out.println(allRingsTextList);

            int allRingsVolume = 0;
                for (String s : allRingsTextList) {
                    if (s == null) s = "0";
                    int sI = 1500 * perimeter * Integer.parseInt(s)/1000;
                    allRingsVolume = allRingsVolume + sI;
                    System.out.println(s + " " + sI + " " + perimeter);
        }

            return 0;

//        int allRingsVolume = 0;
//        for (String s : allRingsTextList) {
//            if (s == null) s = "0";
//            int sI = Integer.parseInt(s)/1000 * 1500 * perimeter;
//            allRingsVolume = allRingsVolume + sI;
//        }
//
//        return allRingsVolume;


//            int allRingsVolume = 0;
//            for (int i = 0; i < allRingsTextList.size(); i++) {
//                if(allRingsTextList.get(i) == null) allRingsTextList.set(i, "0");
//                int sI = Integer.parseInt(allRingsTextList.get(i))/1000 * 1500 * perimeter;
//                allRingsVolume += sI;
//            }
//            return allRingsVolume;


//        int ring1volume = perimeter * 1500 * Integer.parseInt(tank.getRing1Text())/1000;
//        int ring2volume = perimeter * 1500 * Integer.parseInt(tank.getRing2Text())/1000;
//        int ring3volume = perimeter * 1500 * Integer.parseInt(tank.getRing3Text())/1000;
//        int ring4volume = perimeter * 1500 * Integer.parseInt(tank.getRing4Text())/1000;
//        int ring5volume = perimeter * 1500 * Integer.parseInt(tank.getRing5Text())/1000;
//        int ring6volume = perimeter * 1500 * Integer.parseInt(tank.getRing6Text())/1000;
//        int ring7volume = perimeter * 1500 * Integer.parseInt(tank.getRing7Text())/1000;
//        int ring8volume = perimeter * 1500 * Integer.parseInt(tank.getRing8Text())/1000;
//        int ring9volume = perimeter * 1500 * Integer.parseInt(tank.getRing9Text())/1000;
//        int ring10volume = perimeter * 1500 * Integer.parseInt(tank.getRing10Text())/1000;
//        int ring11volume = perimeter * 1500 * Integer.parseInt(tank.getRing11Text())/1000;
//        int ring12volume = perimeter * 1500 * Integer.parseInt(tank.getRing12Text())/1000;
//
//        //cm
//        return ring1volume + ring2volume + ring3volume + ring4volume + ring5volume + ring6volume + ring7volume + ring8volume + ring9volume + ring10volume + ring11volume + ring12volume;


        }

    public static void main(String[] args) {

        Tank tank = new Tank("10430",
                "8", "8", "6", "6", "5", "5",
                "5", "5", "0", "0", "0", "0",
                "8", "6", "6", "2", "2",
                "Other1", "1", "Other2", "2");

        JustTest.getShellVolume(tank);

    }



    }



