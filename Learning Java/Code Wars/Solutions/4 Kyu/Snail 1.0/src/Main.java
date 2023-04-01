import java.util.Arrays;

public class Main {

    public static int[] snail(int[][] array) {

        int columnLength = array.length;
        int rowLength = array[0].length;

        int pos = 0;
        int[] finalArray = new int[array.length * array[0].length];

        // Bounds
        int startRow = 0;
        int endCol = array[0].length-1;
        int startCol = 0;
        int endRow = array.length - 1;


        while(startRow <= endRow || startCol <= endCol){

         //traverse right
         if(endCol >= startCol){
           for(int i = startCol; i <= endCol; i++){
             finalArray[pos++] = array[startRow][i];
           }
         }
         startRow++;

         //traverse down
         if(endRow >= startRow){
           for(int i = startRow; i <= endRow; i++){
             finalArray[pos++] = array[i][endCol];
           }
         }
         endCol--;

         //traverse left
         if(startCol <= endCol){
           for(int i = endCol; i >= startCol; i--){
             finalArray[pos++] = array[endRow][i];
           }
         }
         endRow--;

         //traverse up
         if(startRow <= endRow){
           for(int i = endRow; i >= startRow; i--){
             finalArray[pos++] = array[i][startCol];
           }
         }
         startCol++;
        }

        return finalArray;
    }
}