package com.xworkz.basic.ironBox;

import com.xworkz.basic.ironBox.philipsironbox.PhilipsIronBox;

public class IronBoxRunner {

    public static void main(String[] args) {

        IronBox ironBox = new IronBox();
        ironBox.heatControl();
        ironBox.removeWrinkles();

        PhilipsIronBox philips = new PhilipsIronBox();
        philips.heatControl();
        philips.removeWrinkles();
    }
}
