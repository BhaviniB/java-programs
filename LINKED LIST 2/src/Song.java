package com.company;
public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {

        this.title = title;
        this.duration = duration;
    }


    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title+":"+this.duration; //print out the contents of the class's objects


    }
}
