public class Main {

    public int solution(int number) {

        int total = count(number);

        return (int)total;
    }

    public static int count (int target) {

        int sum = 0;

        for(int i = 0; i < target; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}