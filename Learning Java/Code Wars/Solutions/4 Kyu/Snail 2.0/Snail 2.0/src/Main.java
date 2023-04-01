import java.util.Arrays;

public class Main {

    public static int[] snail(int[][] array) {

        int pos = 0;
        int[] finalArray = new int[array.length * array[0].length];

        // Bounds
        int startRow = 0;
        int endCol = array[0].length - 1;
        int startCol = 0;
        int endRow = array.length - 1;


        while(startRow <= endRow || startCol <= endCol){

            // Traverse right
            if(endCol >= startCol) {
                pos = traverseRight(array, finalArray, pos, startRow, startCol, endRow, endCol);
            }
            startRow++;

            // Traverse down
            if(endRow >= startRow) {
                pos = traverseDown(array, finalArray, pos, startRow, startCol, endRow, endCol);
            }
            endCol--;

            // Traverse left
            if(startCol <= endCol) {
                pos = traverseLeft(array, finalArray, pos, startRow, startCol, endRow, endCol);
            }
            endRow--;

            // Traverse up
            if(startRow <= endRow) {
                pos = traverseUp(array, finalArray, pos, startRow, startCol, endRow, endCol);
            }
            startCol++;

        }

        return finalArray;
    }

    private static int traverseRight(int[][] array, int[] finalArray, int pos, int startRow, int startCol, int endRow, int endCol) {
        for(int i = startCol; i <= endCol; i++) {
            finalArray[pos++] = array[startRow][i];
        }
        return pos;
    }

    private static int traverseDown(int[][] array, int[] finalArray, int pos, int startRow, int startCol, int endRow, int endCol) {
        for(int i = startRow; i <= endRow; i++) {
            finalArray[pos++] = array[i][endCol];
        }
        return pos;
    }

    private static int traverseLeft(int[][] array, int[] finalArray, int pos, int startRow, int startCol, int endRow, int endCol) {
        for(int i = endCol; i >= startCol; i--) {
            finalArray[pos++] = array[endRow][i];
        }
        return pos;
    }

    private static int traverseUp(int[][] array, int[] finalArray, int pos, int startRow, int startCol, int endRow, int endCol) {
        for(int i = endRow; i >= startRow; i--) {
            finalArray[pos++] = array[i][startCol];
        }
        return pos;
    }
}