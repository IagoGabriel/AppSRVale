package com.vale.srvale;

/**
 * Created by iago_ on 21/04/2017.
 */

public class LiderClass {

    private int liderResource;
    private String liderName;
    private String liderRamal;

    public LiderClass(int liderResource, String liderName, String liderRamal) {
        super();
        this.setLiderResource(liderResource);
        this.setLiderName(liderName);
        this.setLiderRamal(liderRamal);
    }

    public int getLiderResource() {
        return liderResource;
    }

    public void setLiderResource(int liderResource) {
        this.liderResource = liderResource;
    }

    public String getLiderName() {
        return liderName;
    }

    public void setLiderName(String liderName) {
        this.liderName = liderName;
    }

    public String getLiderRamal() {
        return liderRamal;
    }

    public void setLiderRamal(String liderRamal) {
        this.liderRamal = liderRamal;
    }
}
