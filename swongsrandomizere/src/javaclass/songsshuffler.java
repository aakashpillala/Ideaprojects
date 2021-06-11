package javaclass;
import java.util.Random;
public class songsshuffler {
    //array is used to store the songs
    private String[] playlist;
    //this variable is used to keep track of pending songs
    private int pendingLotEndPoint;
    //creating an object of Random to generate random numbers
    private Random random = new Random();


    //constructor to initialize playlist and pending list
    public songsshuffler(String[] playlist) {
        this.playlist = playlist;
    //initially all the songs are unplayed
        //be outside of the array for now
        this.pendingLotEndPoint = playlist.length;
    }

    public String playRandomSong() {
        int songToReturnIdx;
        String songToReturn;
        //thsi returns as an index from (0 to pending lot -1)
        //(0 - to plep-1) --->pending lot -- it will keep shrinking
        //(plep to playlist.length) --> played songs -- keep growing
        songToReturnIdx = random.nextInt(pendingLotEndPoint);

       songToReturn = playlist[songToReturnIdx];
       //swap it to last entry
        swap(songToReturnIdx,pendingLotEndPoint-1);
        //shrink the index pool from where we want to run our random generator


        pendingLotEndPoint--;
        // all the songs are played so need to reset the pending slot
        if (pendingLotEndPoint == 0)
            pendingLotEndPoint = playlist.length;

        //return song id which is to be played next
        return songToReturn;
    }

    private void swap(int i, int j)
    {
        if(i==j)
            return;
        String temp = playlist[i];
        playlist[i] = playlist[j];
        playlist[j]=temp;
    }
    public static void main(String[] args){
        String[] songs ={"beliver","love me","ria","jaanam","sugar"};
        songsshuffler songsshuffler = new songsshuffler(songs);
        System.out.println("iteration-1");
        System.out.println("next song :"+songsshuffler.playRandomSong());
        System.out.println("next song :"+songsshuffler.playRandomSong());


    }
}


