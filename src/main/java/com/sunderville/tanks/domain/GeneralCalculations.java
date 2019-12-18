package com.sunderville.tanks.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.sunderville.tanks.domain.Bottom.getBottomVolume;
import static com.sunderville.tanks.domain.Density.getDensityByString;
import static com.sunderville.tanks.domain.Etc.getEtcMass;
import static com.sunderville.tanks.domain.Roof.getActualRoofMass;
import static com.sunderville.tanks.domain.Shell.getShellVolume;

public class GeneralCalculations {


    public static double resultMass(Tank tank, String steelType) {

        double density = getDensityByString(steelType);

        double heaterWeight = tank.getHeaterWeightText().equals("") ? 0d : Double.parseDouble(tank.getHeaterWeightText());
        double insulationWeight = tank.getInsulationWeightText().equals("") ? 0d : Double.parseDouble(tank.getInsulationWeightText());
        double otherWeight1 = tank.getOtherWeight1Text().equals("") ? 0d : Double.parseDouble(tank.getOtherWeight1Text());
        double otherWeight2 = tank.getOtherWeight2Text().equals("") ? 0d : Double.parseDouble(tank.getOtherWeight2Text());

        double EtcMass = getEtcMass(tank);
        if(getBottomVolume(tank) == 0 || getActualRoofMass(tank) == 0) EtcMass = 0;

        double result = (getShellVolume(tank) + getBottomVolume(tank)) * density + getActualRoofMass(tank) + EtcMass +
                heaterWeight + insulationWeight + otherWeight1 + otherWeight2;

        return new BigDecimal(result).setScale(1, RoundingMode.UP).doubleValue();
    }



    public static int resultPrice(Tank tank, String steelType, String ton_price) {

        if (ton_price.equals("")) ton_price = "0";

        return (int)resultMass(tank, steelType) * Integer.parseInt(ton_price);
    }

}
