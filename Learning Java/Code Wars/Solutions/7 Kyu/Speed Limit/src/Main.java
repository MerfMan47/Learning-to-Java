import java.util.Arrays;

public class Main {
    private static final int MAX_FINE = 500;
    private static final int MID_FINE = 250;
    private static final int MIN_FINE = 100;

    private static final int MAX_DIFF = 30;
    private static final int MID_DIFF = 20;
    private static final int MIN_DIFF = 10;



    public static int speedLimit(final int speed, final int[] signals) {

       if (signals == null || signals.length == 0) {
         throw new IllegalArgumentException("Signals array cannot be empty or null");
       }

        int totalFine = 0;

        for (int limit : signals) {
            int diff = speed - limit;

            if (diff >= MAX_DIFF) {
                totalFine += MAX_FINE;
            } else if (diff >= MID_DIFF) {
                totalFine += MID_FINE;
            } else if (diff >= MIN_DIFF) {
                totalFine += MIN_FINE;
            }
        }

        return totalFine;
    }
}
