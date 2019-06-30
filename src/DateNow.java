import java.time.LocalDateTime;


public class DateNow {
    public static void main(String[] args) {

    }
    public int time(int mins){
        int curHour = LocalDateTime.now().getHour();
        int curMin = LocalDateTime.now().getMinute();
        curMin = (curHour * 60) + curMin;

        if (curMin < mins){
            return mins - curMin;
        }
        else {
            return 1440 - curMin + mins;
        }
    }

}
