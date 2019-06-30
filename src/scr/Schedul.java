package scr;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedul {
    public static void main(String[] args) {
        DateNow date = new DateNow();
        ScheduledExecutorService schedulers = Executors.newScheduledThreadPool(1);
        schedulers.scheduleAtFixedRate(new Trunc1().runs, date.time(920),1440, TimeUnit.MINUTES);
        schedulers.scheduleAtFixedRate(new Trunc2().runs, date.time(1260),1440, TimeUnit.MINUTES);
        schedulers.scheduleAtFixedRate(new Trunc3().runs, date.time(600),1440, TimeUnit.MINUTES);
    }
}
