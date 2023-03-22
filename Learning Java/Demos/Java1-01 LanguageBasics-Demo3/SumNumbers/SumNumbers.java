
/**
 * WSums up numbers in a sequence
 *
 * @author Joshua McGregor
 * @version 3/21/2023
 */
public class SumNumbers
{
    public static void main(String[] args){
        System.out.println("Sum through 3" + sumNums(3));
        System.out.println("Sum of 2 through 5 = " + sumNums(2,5));
        System.out.println("Sum of 3 through 11 by 2's = " + sumNums(3,11,2));
        System.out.println("Sum of 2.4 through 3.8 by .2's = " + sumNums(2.4, 3.8, 0.2));
    }
    
    private static int sumNums(int highestNum){
        int sum = 0;
        for(int i = 1; i<=highestNum; i++){
            sum += i;
        }
        return sum;
    }
    
    public static int sumNums(int lowestNum, int highestNum){
        int sum = 0;
        for(int i = lowestNum; i<=highestNum; i++){
            sum += i;
        }
        return sum;
    }
    
    public static double sumNums(double lowestNum, double highestNum, double increment){
        double sum = 0.0;
        for(double i = lowestNum; i<=highestNum; i+= increment){
            sum += i;
        }
        return sum;
    }
}
