package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PlayList playList= new PlayList();
        PlayList playListRock=new PlayList();
        PlayList RapList=new PlayList();
        Jazz jazz=new Jazz("Take the A train",1940,"Duke Ellington");
        Jazz jazz1=new Jazz("So What",1959,"Miles Davis");
        playList.addMusic(jazz);
        playList.addMusic(jazz1);
        playList.ShowGenree();
        playList.ShowDetail();

        playList.RemoveMusic(jazz1);
        Rock rock= new Rock("When the sun goes down", 2006,"Artic Monkey");
        Rock rock1 = new Rock("Obstacle ",2002,"Interpol");
        playListRock.addMusic(rock);
        playListRock.addMusic(rock1);
        playListRock.ShowGenree();
        playListRock.ShowDetail();

        Rap rap= new Rap("Cant Feel My Face",2015,"The weeknd");
        Rap rap1= new Rap("P.I.M.P",2003,"50 Cent");
        RapList.addMusic(rap);
        RapList.addMusic(rap1);
        RapList.ShowGenree();
        RapList.ShowDetail();

    }
}
