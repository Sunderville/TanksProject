package com.sunderville.tanks.domain;


// Возможно, стоит переделать на BigDecimal


public class Bottom {

    private static final double rimWidth = 1.33;

    public static double getBottomVolume(Tank tank) {

        return getCenterVolume(tank.getDiameterText(), tank.getBottomCenterThiknessText()) +
                getRimVolume(tank.getDiameterText(), tank.getBottomRimThiknessText());
    }

    private static double getCenterVolume(String diameter, String center) {

        if(center.equals("")) center = "0";

        double diameter1 = Double.parseDouble(diameter)/1000d;
        double diameter2center = diameter1 - rimWidth*2d;

        double radiusCenter = diameter2center/2d;

        double centerSquare = 3.14d * (radiusCenter * radiusCenter);

        return centerSquare * Double.parseDouble(center)/1000d;
    }

    private static double getRimVolume(String diameter, String rim) {

        if(rim.equals("")) rim = "0";

        double diameter1 = Double.parseDouble(diameter)/1000d;
        double diameter2center = diameter1 - rimWidth*2d;

        double radiusBig = diameter1/2d;
        double radiusCenter = diameter2center/2d;

        double wholeSquare = 3.14d * (radiusBig * radiusBig);
        double centerSquare = 3.14d * (radiusCenter * radiusCenter);
        double rimSquare = wholeSquare - centerSquare;

        return (rimSquare * Double.parseDouble(rim)/1000d);
    }
}
