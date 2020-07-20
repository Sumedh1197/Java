package com.Sumedh;

public class Song {
    private String title;
    private double Duration;

    public Song(String title, double duration) {
        this.title = title;
        this.Duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return Duration;
    }

    @Override
    public String toString() {
        return this.title + this.Duration ;
    }
}
