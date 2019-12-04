package com.sunderville.tanks.domain;

public class Shell {

    private static final float PI = 3.14f;


    public static float getShellVolume(String diameter, String ring1, String ring2, String ring3, String ring4, String ring5, String ring6,
                                       String ring7, String ring8, String ring9, String ring10, String ring11, String ring12) {

        float perimeter = (2.0f*PI) * (Float.parseFloat(diameter)/2.0f)/1000.f;

        float ring1volume = perimeter * 1.5f * Float.parseFloat(ring1)/1000.0f;
        float ring2volume = perimeter * 1.5f * Float.parseFloat(ring2)/1000.0f;
        float ring3volume = perimeter * 1.5f * Float.parseFloat(ring3)/1000.0f;
        float ring4volume = perimeter * 1.5f * Float.parseFloat(ring4)/1000.0f;
        float ring5volume = perimeter * 1.5f * Float.parseFloat(ring5)/1000.0f;
        float ring6volume = perimeter * 1.5f * Float.parseFloat(ring6)/1000.0f;
        float ring7volume = perimeter * 1.5f * Float.parseFloat(ring7)/1000.0f;
        float ring8volume = perimeter * 1.5f * Float.parseFloat(ring8)/1000.0f;
        float ring9volume = perimeter * 1.5f * Float.parseFloat(ring9)/1000.0f;
        float ring10volume = perimeter * 1.5f * Float.parseFloat(ring10)/1000.0f;
        float ring11volume = perimeter * 1.5f * Float.parseFloat(ring11)/1000.0f;
        float ring12volume = perimeter * 1.5f * Float.parseFloat(ring12)/1000.0f;

        float allRingsVolume = ring1volume + ring2volume + ring3volume + ring4volume + ring5volume + ring6volume + ring7volume + ring8volume + ring9volume + ring10volume + ring11volume + ring12volume;

        return allRingsVolume;

    }
}
