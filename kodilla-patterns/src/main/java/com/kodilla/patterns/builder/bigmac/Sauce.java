package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public final static String STANDARD = "Standard sauce";
    public final static String THOUSANDISLANDS = "1000 islands sauce";
    public final static String BARBECUE = "Barbecue sauce";
    private String sauce;

    public Sauce(String sauce) {
        if (STANDARD.equals(sauce) || THOUSANDISLANDS.equals(sauce)
                || BARBECUE.equals(sauce)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("There is no such sauce.");
        }
    }

    public String getSauce() {
        return sauce;
    }

    public static String getSTANDARD() {
        return STANDARD;
    }

    public static String getTHOUSANDISLANDS() {
        return THOUSANDISLANDS;
    }

    public static String getBARBECUE() {
        return BARBECUE;
    }

    @Override
    public String toString() {
        return  sauce;
    }
}
