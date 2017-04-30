package fractrymethoddesignpattern;

/**
 * Created by jitu on 4/30/2017.
 */

import java.io.*;

abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
