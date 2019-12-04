package com.sunderville.tanks.domain;

public class Bottom {

    private static final float rimWidth = 1.33f;

    public static float getBottomVolume(String diameter, String rim, String center) {

        return getCenterVolume(diameter, center) + getRimVolume(diameter, rim);
    }

    public static float getCenterVolume(String diameter, String center) {

        float diameter1 = Float.parseFloat(diameter);
        float diameter2center = diameter1 - rimWidth*2;

        float radiusCenter = diameter2center/2;

        float centerSquare = 3.14f * (radiusCenter * radiusCenter);

        return centerSquare * Float.parseFloat(center)/1000;
    }

    public static float getRimVolume(String diameter, String rim) {

        float diameter1 = Float.parseFloat(diameter);
        float diameter2center = diameter1 - rimWidth*2;

        float radiusBig = diameter1/2;
        float radiusCenter = diameter2center/2;

        float wholeSquare = 3.14f * (radiusBig * radiusBig);
        float centerSquare = 3.14f * (radiusCenter * radiusCenter);
        float rimSquare = wholeSquare - centerSquare;

        return rimSquare * Float.parseFloat(rim) / 1000;
    }
}