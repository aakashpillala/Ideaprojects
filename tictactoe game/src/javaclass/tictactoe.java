package javaclass;

public class tictactoe {
    //initialiaze arraysa for user 1
  private  int [] Rowmarkingfor_1,colmarkingfor_1,Rowmarkingfor_2,colmarkingfor_2;
  private int adplayer_1, pdplayer_1,ad_2,pd_2;
  private int size;
  private char [][]Board;
 public tictactoe(int size){
     Rowmarkingfor_1 = new int[size];
     Rowmarkingfor_2=new int[size];
     colmarkingfor_1=new int [size];
     colmarkingfor_2=new int [size];
     ad_2=adplayer_1=pdplayer_1=pd_2=0;
     Board=new char [size][size];
     this.size=size;
 }
 public boolean makemove(char ch , int row,int col){
     if(row<0 || col<0 || row>=size || col>=size){
         throw new RuntimeException("out of bounce of board ");
     }
     if(ch != 'X' && ch !='O' ){
         throw new RuntimeException("invalid character");
     }
     if(Board[row][col] != 0){
         throw new RuntimeException("invalid step ");
     }
     if(ch=='X'){
         Board[row][col] = 'X';
         return markplace(Rowmarkingfor_1,colmarkingfor_1,pdplayer_1,adplayer_1,row,col);
     }
     else {
         Board[row][col] = 'O';
         return markplace(Rowmarkingfor_2,colmarkingfor_2,pd_2,ad_2,row,col);
     }

 }
    private boolean markplace(int [] rw , int[] cl , int adg , int maindg , int rwplace , int clplace)
    {
        if(++rw[rwplace] == size || ++cl[clplace] == size || rwplace==clplace && ++maindg==size || rwplace + clplace == size-1 && ++adg == size){
            return true;
        }
        return false;
    }


}
