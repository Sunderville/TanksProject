package com.sunderville.tanks.domain;

public class Consolidation {

    private static float shell = 0;
    private static float bottom = 0;
    private static float roof = 0;
    private static float etc = 0;
    private static float steelType;



    public static float getResultMass(String diameter, String ring1, String ring2, String ring3, String ring4, String ring5, String ring6,
                                      String ring7, String ring8, String ring9, String ring10, String ring11, String ring12, String bottom_center_thikness,
                                      String bottom_rim_thikness, String roof_thikness, String insulation_weight, String heater_weight, String other_weight1_name,
                                      String other_weight1, String other_weight2_name, String other_weight2, String steelMark, String ton_price) {


        float shellVolume = Shell.getShellVolume(diameter, ring1, ring2, ring3, ring4, ring5, ring6,
                ring7, ring8, ring9, ring10, ring11, ring12);
        float bottomVolume = Bottom.getBottomVolume(diameter, bottom_center_thikness, bottom_rim_thikness);
        float roof = Roof.getRoofWeight(diameter, roof_thikness);
//        float etc = Etc.getEtcMass();
        float steelType = SteelType.getSteelType(steelMark);



        return (shellVolume + bottomVolume) * steelType + roof + etc +
                Float.parseFloat(heater_weight) + Float.parseFloat(insulation_weight) +
                Float.parseFloat(other_weight1) + Float.parseFloat(other_weight2);
    }



}
