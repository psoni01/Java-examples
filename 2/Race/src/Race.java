
import java.util.Timer;
import java.util.TimerTask;
import java.util.Arrays;

public class Race {

    public static void main(String[] args) {

        Hare hare = new Hare();
        Tortoise tortoise = new Tortoise();
        System.out.println("BANG!!!!");
        System.out.println("AND THEY'RE OFF");

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                char[] chars = new char[70];
                Arrays.fill(chars, ' ');
                String str = new String(chars);
                int harePosition = hare.getNewPosition(), tortoisePosition = tortoise.getNewPosition();
                if (harePosition == 70 && tortoisePosition == 70) {
                    timer.cancel();
                    System.out.println("It's a tie");
                } else if (harePosition == 70 || tortoisePosition == 70) {
                    timer.cancel();
                    if (harePosition == 70) {
                        System.out.println("Hare Wins");
                    } else {
                        System.out.println("TORTOISE WINS!!! YAY!!!");
                    }
                } else if (harePosition == tortoisePosition) {
                    str = new StringBuilder(str).insert((harePosition - 1), "OUCH").toString();
                    System.out.println(str);
                } else {
                    str = new StringBuilder(str).insert((harePosition - 1), "H").toString();
                    str = new StringBuilder(str).insert((tortoisePosition - 1), "T").toString();
                    System.out.println(str);
                }
            }

        }, 0, 1000);
    }

}
