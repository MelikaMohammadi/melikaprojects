package EmploeeControler;
import java.util.concurrent.TimeUnit;

public class Time {

    public static String Time(long diff){
        String res;
        long hours = TimeUnit.MILLISECONDS.toHours(diff);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff)
                - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(diff));
        long seconds = TimeUnit.MILLISECONDS.toSeconds(diff)
                - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(diff));

            res = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        return res;
    }


}
