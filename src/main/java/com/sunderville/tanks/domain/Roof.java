package com.sunderville.tanks.domain;

import com.sunderville.tanks.config.Config;

import static com.sunderville.tanks.domain.Checkings.defineTankType;


public class Roof {

// Теряется некоторая точность при делении
    public static long getActualRoofMass(Tank tank) {
        long roofMass = 0;

        int localRoofThikness;
        if(tank.getRoofThiknessText().equals("")) localRoofThikness = 0;
        else localRoofThikness = Integer.parseInt(tank.getRoofThiknessText());

        switch (defineTankType(tank)) {
            case "РВС-50":
                roofMass = Long.parseLong(Config.getProp("roof50")) / 4 * localRoofThikness;
                break;
            case "РВС-100":
                roofMass = Long.parseLong(Config.getProp("roof100")) / 4 * localRoofThikness;
                break;
            case "РВС-200":
                roofMass = Long.parseLong(Config.getProp("roof200")) / 4 * localRoofThikness;
                break;
            case "РВС-300":
                roofMass = Long.parseLong(Config.getProp("roof300")) / 5 * localRoofThikness;
                break;
            case "РВС-400":
                roofMass = Long.parseLong(Config.getProp("roof400")) / 5 * localRoofThikness;
                break;
            case "РВС-500":
                roofMass = Long.parseLong(Config.getProp("roof500")) / 5 * localRoofThikness;
                break;
            case "РВС-700":
                roofMass = Long.parseLong(Config.getProp("roof700")) / 5 * localRoofThikness;
                break;
            case "РВС-1000":
                roofMass = Long.parseLong(Config.getProp("roof1000")) / 6 * localRoofThikness;
                break;
            case "РВС-2000":
                roofMass = Long.parseLong(Config.getProp("roof2000")) / 4 * localRoofThikness;
                break;
            case "РВС-3000":
                roofMass = Long.parseLong(Config.getProp("roof3000")) / 4 * localRoofThikness;
                break;
            case "РВС-5000-12":
                roofMass = Long.parseLong(Config.getProp("roof5000_12")) / 4 * localRoofThikness;
                break;
            case "РВС-5000-15":
                roofMass = Long.parseLong(Config.getProp("roof5000_15")) / 4 * localRoofThikness;
                break;
            case "РВС-10000-12":
                roofMass = Long.parseLong(Config.getProp("roof10000_12")) / 4 * localRoofThikness;
                break;
            case "РВС-10000-18":
                roofMass = Long.parseLong(Config.getProp("roof10000_18")) / 4 * localRoofThikness;
                break;
            case "РВС-20000":
                roofMass = Long.parseLong(Config.getProp("roof20000")) / 5 * localRoofThikness;
                break;
            case "РВС-30000":
                roofMass = Long.parseLong(Config.getProp("roof30000")) / 5 * localRoofThikness;
                break;
            case "РВС-50000":
                roofMass = Long.parseLong(Config.getProp("roof50000")) / 5 * localRoofThikness;
                break;
        }

        return roofMass;
    }






    public static long getRegularRoofMass(Tank tank) {

        String roofMass = "";

        switch (defineTankType(tank)) {
            case "РВС-50":
                roofMass = Config.getProp("roof50");
                break;
            case "РВС-100":
                roofMass = Config.getProp("roof100");
                break;
            case "РВС-200":
                roofMass = Config.getProp("roof200");
                break;
            case "РВС-300":
                roofMass = Config.getProp("roof300");
                break;
            case "РВС-400":
                roofMass = Config.getProp("roof400");
                break;
            case "РВС-500":
                roofMass = Config.getProp("roof500");
                break;
            case "РВС-700":
                roofMass = Config.getProp("roof700");
                break;
            case "РВС-1000":
                roofMass = Config.getProp("roof1000");
                break;
            case "РВС-2000":
                roofMass = Config.getProp("roof2000");
                break;
            case "РВС-3000":
                roofMass = Config.getProp("roof3000");
                break;
            case "РВС-5000-12":
                roofMass = Config.getProp("roof5000_12");
                break;
            case "РВС-5000-15":
                roofMass = Config.getProp("roof5000_15");
                break;
            case "РВС-10000-12":
                roofMass = Config.getProp("roof10000_12");
                break;
            case "РВС-10000-18":
                roofMass = Config.getProp("roof10000_18");
                break;
            case "РВС-20000":
                roofMass = Config.getProp("roof20000");
                break;
            case "РВС-30000":
                roofMass = Config.getProp("roof30000");
                break;
            case "РВС-50000":
                roofMass = Config.getProp("roof50000");
                break;
        }

        return Long.parseLong(roofMass);

    }
}










//    private static int thikness = 0;
//
//    public static float getRoofWeight(String diameter, String roof_thikness) {
//
//        float roofWeight = 0;
//
//        if(diameter.equals("3800") || diameter.equals("4730") || diameter.equals("6630") || diameter.equals("15180") ||
//                diameter.equals("18980") || diameter.equals("20920") || diameter.equals("22800") ||
//                diameter.equals("28500") || diameter.equals("34200")){
//            roofWeight = getRoofStandardWeigh(diameter)/4.0f * Float.parseFloat(roof_thikness);
//        }
//        if(diameter.equals("7580") || diameter.equals("8530") || diameter.equals("39900") || diameter.equals("45600") || diameter.equals("60700")){
//            roofWeight = getRoofStandardWeigh(diameter)/5.0f * Float.parseFloat(roof_thikness);
//
//        }
//        if(diameter.equals("10430")){
//            roofWeight = getRoofStandardWeigh(diameter)/6.0f * Float.parseFloat(roof_thikness);
//        }
//
//        return roofWeight;
//    }