public class Vis_nuvaerende_tid {

    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        Nuvarendetid(1000000000);
    }
    public static void Nuvarendetid(long totalMilliseconds) {

        long totalSeconds   = totalMilliseconds / 1000;
        long currentSecond  = totalSeconds % 60;
        long totalMinutes   = totalSeconds / 60;
        long currentMinute  = totalMinutes % 60;
        long totalHours     = totalMinutes / 60;
        long currentHour    = totalHours % 24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");

    }
}