package com.Sumedh;

import java.util.*;

public class Main {
    public static ArrayList<Album> albums= new ArrayList<Album>();

    public static void main(String[] args) {

        Album album= new Album("Suncity","Khalid");
        album.addSong("Better",3.45);
        album.addSong("Vetigo",2.49);
        album.addSong("Suncity",3.21);
        album.addSong("Saturday nights",4.02);
        albums.add(album);

        album= new Album("Greatest Hits","Enrique");
        album.addSong("Hero",4.45);
        album.addSong("Be with you",3.40);
        album.addSong("Somebody's me",3.50);
        album.addSong("Escape",4.25);
        albums.add(album);

        LinkedList<Song> playlist= new LinkedList<Song>();
        albums.get(0).addToPlaylist("Saturday nights",playlist);
        albums.get(0).addToPlaylist("Vetigo",playlist);
        albums.get(0).addToPlaylist("Better",playlist);
        albums.get(0).addToPlaylist("Without you",playlist);
        albums.get(0).addToPlaylist(3,playlist);
        albums.get(1).addToPlaylist("Hero",playlist);
        albums.get(1).addToPlaylist("Be with you",playlist);
        albums.get(1).addToPlaylist("Escape",playlist);
        albums.get(1).addToPlaylist(15,playlist); //should fail

        play(playlist);
    }
    private static void play(LinkedList<Song> playlist){
        Scanner scanner= new Scanner(System.in);
        boolean quit=false;
        boolean goingForward=true;
        ListIterator<Song> listIterator= playlist.listIterator();
        if(playlist.size()==0){
            System.out.println("No songs in the playlist");
        }else{
            System.out.println("Now playing: " +listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action= scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: " +listIterator.next().toString());
                    }
                    else{
                        System.out.println("End of list");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing: " +listIterator.previous().toString());
                    }
                    else{
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    if(goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing:" + listIterator.previous().toString());
                            goingForward=false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                            if(listIterator.hasNext()){
                                System.out.println("Now playing: " +listIterator.next().toString());
                                goingForward=true;
                            }else{
                                System.out.println("We are at the end of the list");
                            }
                        }

                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing: " +listIterator.next().toString());
                        }
                        else if(listIterator.hasPrevious()){
                            System.out.println("Now playing: " +listIterator.previous().toString());
                        }
                    }
            }
        }
    }
    private static void printMenu() {
        System.out.println("\n Available actions are : \n");
        System.out.println("0 - to quit \n" +
                "1- to play next song \n" +
                "2- to play previous song \n" +
                "3- to replay current song \n" +
                "4- list song in playlist \n" +
                "5 - print available action \n"+
                "6- delete current song from playlist");

    }
    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator= playlist.iterator();
        System.out.println("-------------------");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("====================");
    }
}
