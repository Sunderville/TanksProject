package com.sunderville.tanks.domain;

// Ready to use

public class Density {

    private static final long _ST3SP = 7870;
    private static final long _09G2S = 7850;
    private static final long _12H18N10T = 7900;

    public static long getDensityByString(String steelType) {
        if(steelType.equals("Ст3сп")) return _ST3SP;
        if(steelType.equals("09Г2С")) return _09G2S;
        if(steelType.equals("12Х18Н10Т")) return _12H18N10T;
        else return _ST3SP;
    }

}
