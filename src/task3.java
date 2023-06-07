public class task3 {
    public static void main(String[] args) {
        int hour = 0;
        while (hour < 3) {
            int minute = 0;
            while (minute < 60) {
                System.out.println(hour + " h " + minute + " min");
                minute++;
            }
            hour++;
        }
    }
}


