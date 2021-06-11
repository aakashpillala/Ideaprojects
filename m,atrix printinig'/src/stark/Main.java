package stark;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// printing matrix
        /**
         *  for(int []row:matrix){
         *  for(int valInRow:row){
         *  System.out.print(valInRow+" ");
         *    }
         *  System.out.println(" ");
         *   }
         */
        int[][] matrix={{1,2,3},{1,2,3},{2,3,4},{2,3,4}};
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"   ");
            } System.out.println(" ");
        }
        for(int []row:matrix){
          for(int valInRow:row)
          {
           System.out.print(valInRow+"     ");
           }
           System.out.println("   ");
        }

    }
}




































