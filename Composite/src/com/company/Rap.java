package com.company;

public class Rap  implements  Music{
    private String name;
    private int reaDate;
    private String BandName;

    public Rap(String name, int reaDate, String bandName) {
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
        System.out.println("Hip hop music or hip-hop music, also known as rap music,[5][6] is a genre of popular music developed in the United States by inner-city African Americans.");

    }
}
