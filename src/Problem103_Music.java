/*
Create a class Music with below attributes:

playListNo - int
type -String
count - int
duration(minutes) -double.

The above attributes should be private.Write Getter and Setter and parametrized constructor as required.
Create class Solution with main method.
****************************************************************************
Implement two static methods: findAvgOfCount and sortTypeByDuration in Solution Class.

findAvgOfCount Method:
----------------------------------------
This method will take an array of Music objects and an int value as input parameters.The method will find out Average
(as int) of count for those objects whose count is more than the given Count(int parameter passed).This method will return
average if found.If there is no Type that matches then the method should return 0.

for this method- main method should print average ,if the returned value is not 0.If the returned value is 0 then main method
should print "No playlist found".

sortTypeByDuration method:
-----------------------------------------
This method will take an array of Music objects and an int value as input parameters.This method should return an array of
Music objects in an ascending order of their duration which are more than the given duration (int parameter passed) value.
If there are no such objects ,then the method should return null.

for this method-The main method should print the type from the returned Music object array if the returned value is not null.
If the returned value is null then the main method should print "No playlist found with mentioned attribute".

****************************************************************************

Consider the below input and output:

input1:
------------
111
WorkOut
10
15.2
321
Dance Party
20
55.500
721
Childhood Jams
6
50.60
521
Chill
30
78.89
15
20


output1:
--------------------
25
Childhood Jams
Dance Party
Chill



input2:
-----------------------
111
Oldies but Goodies
17
55
321
Guilty Pleasures
27
27
721
night drive
21
345
521
Rainy day
34
21
50
5000


output 2:
-----------------------
No playlist found.
No playlist found with mentioned attribute.

 */

import java.util.*;

class Music{
    private int playListNo;
    private String type;
    private int count;
    private double duration; // (minutes)

    public Music(int playListNo, String type, int count, double duration){
        this.playListNo = playListNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }

    public String getType(){
        return type;
    }
    public int getCount(){
        return count;
    }
    public double getDuration(){
        return duration;
    }

}

public class Problem103_Music {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of musics: ");
        Music[] musics = new Music[sc.nextInt()];
        for (int i = 0; i < musics.length; i++) {
            System.out.println("Enter music playlist no: ");
            int playListNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter music type: ");
            String type = sc.nextLine();
            System.out.println("Enter music count: ");
            int count = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter music duration: ");
            double duration = sc.nextDouble();
            sc.nextLine();

            musics[i] = new Music(playListNo , type , count, duration);
        }
        System.out.println("Enter music count parameter: ");
        int countParam = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter music duration parameter: ");
        double durationParam = sc.nextDouble();
        sc.nextLine();

        int avgCount = findAvgOfCount(musics , countParam);
        System.out.println(avgCount > 0 ? avgCount : "No playlist found");

        ArrayList<Music> musicByDuration = sortTypeByDuration(musics , durationParam);
        if(!musicByDuration.isEmpty()){
            for(Music music : musicByDuration){
                System.out.println(music.getType());
            }
        }else{
            System.out.println("No playlist found with mentioned attribute");
        }
    }
    public static int findAvgOfCount(Music[] musics, int countParam){
        int count = 0;
        int countSum = 0;
        for (Music music : musics) {
            if(music.getCount() > countParam){
                count++;
                countSum += music.getCount();
            }
        }
        return count > 0 ? countSum / count : 0;
    }
    public static ArrayList<Music> sortTypeByDuration(Music[] musics, double duration){
        ArrayList<Music> musicByDuration = new ArrayList<>();
        for (Music music : musics) {
            if(music.getDuration() > duration){
                musicByDuration.add(music);
            }
        }
        if (musicByDuration.isEmpty()) {
            return null;
        }

        musicByDuration.sort((s1, s2) -> Double.compare(s1.getDuration(), s2.getDuration()));
        return musicByDuration;
    }

}
