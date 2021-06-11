package practice;

public class temp {

    public int timetotype(String keyboard, String text){
        //assume the char set as ascii
        int [] invertedindex = new int[256];
        //computing the inverted map to store the position of
        //
        for(int i=0;i<keyboard.length();i++){
            invertedindex[keyboard.charAt(i)] = i;
        }
        int total_time = 0, previouslytyped , nexttotype;
        for(int chartotype=1;chartotype<text.length();chartotype++){
            nexttotype = invertedindex[text.charAt(chartotype)];
            previouslytyped = invertedindex[text.charAt(chartotype-1)];
            total_time += Math.abs(-nexttotype+previouslytyped);
        }
        return total_time;
    }

    public static void main(String[] args) {
        String keyboard1 = "qwertyuiopasdfghjklzxcvbnm";
        String text1 = "aakash";
        temp temp = new temp();
        System.out.println(temp.timetotype(keyboard1,text1));
    }

}
