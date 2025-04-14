package com.xworkz.basic.ironBox;

import com.xworkz.basic.ironBox.philipsironbox.PhilipsIronBox;

public class IronBoxRunner {

    public static void main(String[] args) {

        IronBox ironBox = new PhilipsIronBox();
        PhilipsIronBox philips = (PhilipsIronBox)ironBox;
        ironBox.heatControl();
        ironBox.removeWrinkles();
        philips.heatControl();
        philips.removeWrinkles();
    }
}
