package com.sunderville.tanks.domain;

// Ready to use

import com.sunderville.tanks.MainWindowController;

import static com.sunderville.tanks.domain.Bottom.getBottomVolume;
import static com.sunderville.tanks.domain.Density.getDensityByString;
import static com.sunderville.tanks.domain.Etc.getEtcMass;
import static com.sunderville.tanks.domain.Roof.getActualRoofMass;
import static com.sunderville.tanks.domain.Shell.getShellVolume;

public class GeneralCalculations {


    public static double resultMass(Tank tank, String steelType) {

        double density = getDensityByString(steelType) / 1000.0;

        return (getShellVolume(tank) + getBottomVolume(tank))/100000.0 * density + getActualRoofMass(tank)/1000.0 + getEtcMass(tank)/1000.0;
    }



    public static long resultPrice(Tank tank, String ton_price) {

        if (ton_price.equals("")) ton_price = "0";

        return 0;
//        return resultMass(tank, MainWindowController.getSteel_type().getText()) * Integer.parseInt(ton_price);
    }

}
