package stark;
/**
 *given a n*m  matrix,i want to find whether it is toeplize matrix
 * or not
 * 1 2 3 4
 * 5 1 2 3
 * 9 5 1 2 is toeplitz matrix
 * 1 2 3 4
 * 2 3 4 5
 * 2 3 4 5 is nor toeplitz matrtix
 */

public class Main {
    public boolean istoepliotzmatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                if (matrix[row][col] != matrix[row + 1][col + 1])
                    return false;
            }
        }
        return true;
    }
    private static void print2dmatrix(int[][]matrix){
        System.out.println("test matrix: \n");
        for(int[] row:matrix){
            for(int valInRow:row){
                System.out.print(valInRow+"  ");
            }
            System.out.println();
        }
    }
        public static void main (String[] args){


            Main toeplitzmatrix = new Main();
            int[][] test_case1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            print2dmatrix(test_case1);
            System.out.println("is  matrix test case1 a toeplitz :"+ toeplitzmatrix.istoepliotzmatrix(test_case1));
            int[][] test_case2 = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
            print2dmatrix(test_case2);
            System.out.println("is matrix test case 2 a toeplitz matrix:"+ toeplitzmatrix.istoepliotzmatrix(test_case2));
        }
    }

