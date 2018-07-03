package ua.vmurol;

import java.util.ArrayList;
import java.util.List;

public class Model {
    // Data
    private int minBarrier;
    private int maxBarrier;

    private int secretValue;

    private List<Integer> yourWay = new ArrayList<Integer>();


    public void setSecretValue(){
        secretValue = (int)Math.ceil(Math.random()* (maxBarrier - minBarrier - 1) + minBarrier);
    }


    public boolean checkValue (int value){
        yourWay.add(value);
        if (value == secretValue){
            return true;
        } else if (value > secretValue){
            maxBarrier = value;
        } else {
            minBarrier = value;
        }
        return false;
    }


    public void setPrimaryBarrier(int minBarrier, int maxBarrier){
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public int getSecretValue() {
        return secretValue;
    }
    public int getMinBarrier() {
        return minBarrier;
    }
    public int getMaxBarrier() {
        return maxBarrier;
    }
    public List<Integer> getYourWay() {
        return yourWay;
    }
}
