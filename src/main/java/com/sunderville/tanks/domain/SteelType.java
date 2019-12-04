package com.sunderville.tanks.domain;

public class SteelType {

    private static final float ST3SP = 7.87f;
    private static final float _09G2S = 7.85f;
    private static final float _12H18N10T = 7.9f;

    public static float getSteelType(String mark) {
        if (mark.equals("09Г2С")) {
            return _09G2S;
        }
        if (mark.equals("12Х18Н10Т")) {
            return _12H18N10T;
        }else return ST3SP;

    }

}
