public class Compaction {
    private void swap(int [] num, int i ,int j){
        if (i==j) {
            return;
        }
      int temp = num[i];
       num [i] = num [j];
       num [j] = temp;

    }
    public void shufflememory(int [] memory){
        int nonzerocollector = -1;
        for(int traversalpointer=0; traversalpointer < memory.length;traversalpointer++){
            if(memory[traversalpointer] != 0){
               swap(memory,++nonzerocollector,traversalpointer);
            }
        }
        for (int i: memory) {
            System.out.println(i);

        }
    }
    public static void main(String [] args){
        int [] alloc = {1,0,2,3,0,3,0,0};
        Compaction obj = new Compaction();
        obj.shufflememory(alloc);
    }
}
