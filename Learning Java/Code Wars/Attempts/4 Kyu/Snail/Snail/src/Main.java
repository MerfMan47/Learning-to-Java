import java.util.Arrays;

public class Main {

    public static int[] snail(int[][] array) {

        int columnLength = array.length;
        int rowLength = array[0].length;

        int x = 0;
        int y = 0;

        int pos = 0;

        int[] finalArray = new int[columnLength * rowLength];



//       while(pos<=finalArray.length){


        rowLength--;

        //right
        for(int i = 0; i<=rowLength; i++) {
            finalArray[pos] = array[y][x];
            pos++;
            x++;
        }
        columnLength--;
        x--;

        System.out.println("(x,y) after right: " + "(" + x + "," + y + ")");


        //down
        y++;
        for(int i = 0; y<=columnLength; i++){
            finalArray[pos] = array[y][x];
            pos++;
            y++;
        }
        rowLength--;
        y--;
        System.out.println("(x,y) after down: " + "(" + x + "," + y + ")");


        //right
        x--;
        for(int i = 0; i<=rowLength; i++){
            finalArray[pos] = array[y][x];
            pos++;
            x--;
        }
        columnLength--;
        x++;


        //up
        y--;
        for(int i = 0; i<columnLength; i++){
            finalArray[pos] = array[y][x];
            y--;
        }
        rowLength--;
        y++;






//       }


        System.out.println(Arrays.toString(finalArray));






//       while(pos < finalArray.length) {

//         //right
//         for(int i = x; i<=rowLength; i++) {
//           finalArray[pos] = array[y][x];
//           pos++;
//           x=i;
//         }

//         //down
//         for() {


//         }

//         //left
//         for() {


//         }

//         //up
//         for() {


//         }


//       }

        return finalArray;
    }
}