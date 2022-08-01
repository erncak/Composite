package com.company;

public class Rock implements Music{
    private String name;
    private int reaDate;
    private String BandName;

    public Rock(String name, int reaDate, String bandName) {
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
        System.out.println("Rock music is a broad genre of popular music that originated as \"rock and roll\" in the United States in the late 1940s and early 1950s, developing into a range of different styles in the mid-1960s and later, particularly in the United States and the United Kingdom.");

    }
}
