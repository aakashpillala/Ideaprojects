package sorting;

public class sorting {
    int [] array = {5,3,2,7,9,1,6};
    public void sorting (int [] i){

        for(int j = 0 ; j < i.length ; j++){
            for(int x= j+1;x<i.length;x++){
                if (i[j]>i[x]){
                    int temp = i[j];
                    i[j] = i[x];
                    i[x] = temp;
                }

            }
        }
    }
    public static void main(String [] args){
        sorting obj = new sorting();
        obj.sorting(obj.array);
        for(int i: obj.array){
            System.out.println(i);
        }
    }
}
