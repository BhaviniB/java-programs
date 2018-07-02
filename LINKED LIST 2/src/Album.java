package com.company;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<com.company.Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new ArrayList<com.company.Song>();
    }


    public boolean addSong(String title,double duration){

        if(findSong(title)==null){
            this.songs.add(new com.company.Song(title,duration));
            return true;
        }
        return false;
    }
    private com.company.Song findSong(String title){

        for(com.company.Song checkedSong:this.songs){

            if(checkedSong.getTitle().equals(title)){

                return checkedSong;
            }


        }
        return null;

    }

    public boolean addToPlayList(int trackNumber, LinkedList<com.company.Song>playList){


        int index=trackNumber-1;
        if(index>0 && index<this.songs.size()){

            playList.add(this.songs.get(index));
            return true;


        }
        System.out.println("this album doesnt have the track"+trackNumber);
        return false;

    }

    public boolean addToPlaylist(String title,LinkedList<com.company.Song>playList){

        com.company.Song checkedSong=findSong(title);

        if(checkedSong!=null){

            playList.add(checkedSong);
            return true;
        }
        System.out.println("this album doesnt have the track"+title);

        return false;

    }



}
