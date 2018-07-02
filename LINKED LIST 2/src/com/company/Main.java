package com.company;

import com.company.Album;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album>albums=new ArrayList<Album>();


    public static void main(String[] args) {


        Album album=new Album("LONELY","Selena Gomez");
        album.addSong("xxx1",1.2);
        album.addSong("xxx1",1.2);
        album.addSong("xxx3",1.3);
        album.addSong("xxx4",1.4);
        album.addSong("xxx5",1.5);
        album.addSong("xxx6",1.5);

        albums.add(album);

        //adding another album
        album=new Album("For those abou to rock","AC DC");
        album.addSong("yyy1",4.44);
        album.addSong("yyy2",4.42);
        album.addSong("yyy3",4.43);
        album.addSong("yyy4",4.44);
        album.addSong("yyy5",4.45);
        albums.add(album);
        LinkedList<com.company.Song>playList=new LinkedList<com.company.Song>();
        albums.get(0).addToPlaylist("xxx1",playList);
        albums.get(0).addToPlaylist("xxx2",playList);
        albums.get(0).addToPlaylist("xxx3",playList);

        albums.get(0).addToPlaylist("xxx4",playList);
        albums.get(0).addToPlaylist("xxx5",playList);
        play(playList);

    }

    private static void play(LinkedList<com.company.Song>playList){


        ListIterator<com.company.Song> listIterator=playList.listIterator();
        if(playList.size()==0){

            System.out.println("no song in the playlist");
        }
        else{

            System.out.println("now playin"+listIterator.next().toString());
        }

    }
}
