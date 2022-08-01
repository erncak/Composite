package com.company;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements Music{
    private List<Music> musicList = new ArrayList<Music>();



    @Override
    public void ShowDetail() {
        for(Music music:musicList)
        {
            music.ShowDetail();
        }
    }

    @Override
    public void ShowGenree() {
        musicList.get(0).ShowGenree();
    }

    public void addMusic(Music music){
        musicList.add(music);

    }
    public void RemoveMusic(Music music){
        musicList.remove(music);
    }
}
