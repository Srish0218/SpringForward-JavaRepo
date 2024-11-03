/*
create the class Song with below attributes.

songId - int
title - String
artist -  String
duration-double

The above attributes should be private, getters, setters and parameterized constructor as required.

Create class MyClass with main method. Implement two static methods - findSongDurationForArtist and
getSongsInAscendingOrder in MyClass class.

findSongDurationForArtist method:
----------------------------------------------------
This method will take two input parameters of Song objects and String parameter.
The method will return the sum of song duration from array of Song object for the given artist (String parameter passed).

If no Song with the given artist is present in the array of Song objects, then the method should return zero.

getSongsInAscendingOrder method:
----------------------------------------------------
This method will take input parameters array, of Song objects and String parameter.The method will return Song objects array
in an ascending order of their duration, from the array of Song objects whose artist attribute matches with the input String
parameter.

If no Song with the given artist is present in the array of Song objects, then the method should return null.

Note:
----------
1. No two Song object would have the same songid.
2. Combination of artist and duration should be unique.
3. All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For getfindSongDuration ForArtist method - in method should print the sum of duration of artist as it is, if the returned
value is greater than 0 or it should print "There are no songs with given artist".

For getSongsinAscendingOrder method - The main method should print the song id and title from the returned song object array
if the returned value is not null. If the returned value is null then it should print "There are no songs with given artist".


For Example,

112
ABC

where 112 is song ld. ABC is song title.

Before calling these static methods in main, use. Scanner object to read the values of five Song objects referring attributes
in the above mentioned attribute sequence. Next, read two String values for capturing artists.

*****************************************************************



Sample Input 1:
------------------

2150
In time
Justin Timberlake
4
250
Cry Me
Justin Timberlake
3
1200
Mirrors
Justin Timberlake
5
1300
That's the way it is
celion dion
5
500
Ashes
celion dion
3
celion dion
Justin Timberlake


Sample output1:
------------------------

8.0
250
Cry Me
2150
In time
1200
Mirrors



Sample Input 2:
----------------------

2150
Cry Me
Justin Timberlake
3
1000
Why Not
Enrique Iglesius
5
1200
Mirrors
Justin Timberlake
5
1300
That's the way it is
Celion Dion
5
500
Ashes
celion Dion
3
Bryan Adams
Michael Larkson


Output 2:
-----------------------

There are no songs with given artist
There are no songs with given artist
 */
import java.util.*;
class Song{
    private int songId;
    private String title;
    private String artist;
    private double duration;
    public Song(int songId, String title, String artist, double duration){
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public int getSongId(){
        return songId;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public double getDuration(){
        return duration;
    }
}

public class Problem108_Song {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of songs: ");
        Song[] songs = new Song[sc.nextInt()];
        for(int i = 0; i < songs.length; i++){
            System.out.println("Enter the song ID: ");
            int songId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the title: ");
            String title = sc.nextLine();
            System.out.println("Enter the artist: ");
            String artist = sc.nextLine();
            System.out.println("Enter the duration: ");
            double duration = sc.nextDouble();
            sc.nextLine();
            songs[i] = new Song(songId, title, artist, duration);
        }
        System.out.println("Enter song artist Parameter 1: ");
        String artistParameter1 = sc.nextLine();
        System.out.println("Enter song artist Parameter 2: ");
        String artistParameter2 = sc.nextLine();

        double totalDurationByArtist = findSongDurationForArtist(songs , artistParameter1);
        System.out.println(totalDurationByArtist > 0 ? totalDurationByArtist : "There are no songs with given artist");

        ArrayList<Song> songDetailsByArtist = getSongsInAscendingOrder(songs , artistParameter2);
        if(songDetailsByArtist != null){
            for(Song song : songDetailsByArtist){
                System.out.println(song.getSongId() + "\n"  + song.getTitle());
            }
        }else{
            System.out.println("There are no songs with given artist");
        }


    }
    public static double findSongDurationForArtist(Song[] songs, String artistParameter1){
        double totalDuration = 0;
        for(Song song : songs){
            if(song.getArtist().equalsIgnoreCase(artistParameter1)){
                totalDuration += song.getDuration();
            }
        }
        return totalDuration;
    }
    public static ArrayList<Song> getSongsInAscendingOrder(Song[] songs, String artistParameter2){
        ArrayList<Song> songDetails = new ArrayList<>();
        for(Song song : songs){
            if(song.getArtist().equalsIgnoreCase(artistParameter2)){
                songDetails.add(song);
            }
        }
        if(songDetails.isEmpty())
            return null;
        songDetails.sort((Comparator.comparing(Song::getDuration)));
        return songDetails;
    }
}
