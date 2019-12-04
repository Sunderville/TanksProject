package com.sunderville.tanks.domain;

public class Roof {

    private static int thikness = 0;

    public static float getRoofWeight(String diameter, String roof_thikness) {

        float roofWeight = 0;

        if(diameter.equals("3800") || diameter.equals("4730") || diameter.equals("6630") || diameter.equals("15180") ||
                diameter.equals("18980") || diameter.equals("20920") || diameter.equals("22800") ||
                diameter.equals("28500") || diameter.equals("34200")){
            roofWeight = getRoofStandardWeigh(diameter)/4.0f * Float.parseFloat(roof_thikness);
        }
        if(diameter.equals("7580") || diameter.equals("8530") || diameter.equals("39900") || diameter.equals("45600") || diameter.equals("60700")){
            roofWeight = getRoofStandardWeigh(diameter)/5.0f * Float.parseFloat(roof_thikness);

        }
        if(diameter.equals("10430")){
            roofWeight = getRoofStandardWeigh(diameter)/6.0f * Float.parseFloat(roof_thikness);
        }

        return roofWeight;
    }

    private static float getRoofStandardWeigh(String diameter) {

        float roofWeight = 0;
        switch (diameter) {
            case "3800": roofWeight = 0.529f; break;  //4 mm
            case "4730": roofWeight = 0.767f; break;  //4 mm
            case "6630": roofWeight =  1.549f; break;  //4 mm
            case "7580": roofWeight =  2.715f; break;  //5 mm
            case "8530": roofWeight =  2.882f; break;  //5 mm
            case "10430": roofWeight =  5.379f; break;  //6 mm
            case "15180": roofWeight =  12.38f; break;  //4 mm
            case "18980": roofWeight =  19.35f; break;  //4 mm
            case "20920": roofWeight =  25.34f; break;  //4 mm
            case "22800": roofWeight =  31.7f; break;  //4 mm
            case "28500": roofWeight =  51.611f; break;  //4 mm
            case "34200": roofWeight =  78.619f; break;  //4 mm
            case "39900": roofWeight =  110.0f; break;  //5 mm
            case "45600": roofWeight =  136.2f; break;  //5 mm
            case "60700": roofWeight =  325.047f; break;  //5 mm
        }
        return roofWeight;


    }


}
