package com.company;

import com.company.Album;

import javax.jws.soap.SOAPBinding;
import java.util.*;

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
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;



        ListIterator<com.company.Song> listIterator=playList.listIterator();
        if(playList.size()==0){

            System.out.println("no song in the playlist");
        }
        else{

            System.out.println("now playin"+listIterator.next().toString());
            printMenu();

        }
while(!quit){

            int action=scanner.nextInt();
            scanner.nextLine();
            switch (action){

                case 0:
                    System.out.println("playlist complete");
                    quit=true;
                    break;
                case 1:
                    //if wwe arent going forward then we actuallt set it to go forward

                    if(!forward){

                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("now playin"+listIterator.next().toString());

                    }else{
                        System.out.println("we have reached the end");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward)
                    {
                        if(listIterator.hasPrevious()){

                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){

                        System.out.println("now playin"+listIterator.previous().toString());
                    }
                    else {
                        System.out.println("we are  at the start o the playlist");
                        forward=true;

                    }



                    break;
                case 3:
                    if(forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("now playin"+ listIterator.previous().toString());
                            forward=false;
                        }
                        System.out.println("we have reached the start");
                    }
                    else{
                        if(listIterator.hasNext()){
                            System.out.println("now playin"+listIterator.next().toString());
                            forward=true;

                        }
                        System.out.println("we have reached the end");
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
}
    }

    public static void printMenu(){

        System.out.println("0:quit,1:next,2:previous,3:replay the current,4:list songs,5:print avaalable actions");
    }
    private static void printList(LinkedList<com.company.Song>playList){

        Iterator<com.company.Song> iterator=playList.iterator();

        while ((iterator.hasNext()))
{
            System.out.println("========");
            System.out.println(iterator.next().toString());


        }
        System.out.println("=========");
    }
}
