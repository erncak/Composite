package com.company;

public class Jazz implements Music{
    private String name;
    private int reaDate;
    private String BandName;

    public Jazz(String name, int reaDate, String bandName) {
        this.name = name;
        this.reaDate = reaDate;
        BandName = bandName;
    }

    @Override
    public void ShowDetail() {
        System.out.println(name+" recorded by "+BandName+ " in "+ reaDate );
    }

    @Override
    public void ShowGenree() {
        System.out.println("Jazz is a music genre that originated in the African-American communities of New Orleans, Louisiana, United States, in the late 19th and early 20th centuries, with its roots in blues and ragtime");

    }
}
