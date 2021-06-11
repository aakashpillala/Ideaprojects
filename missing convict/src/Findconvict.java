public class Findconvict {
    public int findmissingconvictId(int[] convicts) {
        int endRange = convicts.length;
        int x=0;
       sorting(convicts);
        for (int i = 0; i < convicts.length; i++) {
            System.out.println(convicts[i]);
            if (convicts[i] - 1 != i) {
                x = convicts[i] - 1;
                break;
            }
        }

        return x;
    }
    public static void main(String[]args){
        Findconvict find = new Findconvict();
        int [] example = {4,3,2,1,6};
        int missing_number = find.findmissingconvictId(example);
        System.out.println("missing number in the given convicts list is :"+missing_number);
    }
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
        System.out.println(" Given convict is ");
        for(int k : i){
            System.out.println(i);
        }
    }
}
