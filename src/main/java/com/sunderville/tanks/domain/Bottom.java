package com.sunderville.tanks.domain;


public class Bottom {

    private static final long rimWidth = 1330;

    public static long getBottomVolume(Tank tank) {

        return getCenterVolume(tank.getDiameterText(), tank.getBottomCenterThiknessText()) +
                getRimVolume(tank.getDiameterText(), tank.getBottomRimThiknessText());
    }

    private static long getCenterVolume(String diameter, String center) {

        if(center.equals("")) center = "0";

        long diameter1 = Integer.parseInt(diameter);
        long diameter2center = diameter1 - rimWidth*2L;

        long radiusCenter = diameter2center/2L;

        long centerSquare = 3140L * (radiusCenter * radiusCenter);

        return centerSquare * Long.parseLong(center)/1000000L;
    }

    private static long getRimVolume(String diameter, String rim) {

        if(rim.equals("")) rim = "0";

        long diameter1 = Integer.parseInt(diameter);
        long diameter2center = diameter1 - rimWidth*2L;

        long radiusBig = diameter1/2L;
        long radiusCenter = diameter2center/2L;

        long wholeSquare = 3140L * (radiusBig * radiusBig);
        long centerSquare = 3140L * (radiusCenter * radiusCenter);
        long rimSquare = wholeSquare - centerSquare;

        return (rimSquare * Integer.parseInt(rim)) / 1000000L;
    }
}
