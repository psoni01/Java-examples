
import java.util.Random;

public class Hare {

    int position = 1;
    final int sleep = 0;
    final int bigHop = 9;
    final int bigSlip = -12;
    final int smallHop = 1;
    final int smallSlip = -2;

    Random rand = new Random();

    int getMove() {
        int a = rand.nextInt((10 - 1) + 1) + 1;
        switch (a) {
            case (1):
            case (2): {
                return sleep;
            }
            case (3):
            case (4): {
                return bigHop;

            }
            case (5): {
                return bigSlip;

            }
            case (6):

            case (7):
            case (8): {
                return smallHop;
            }
            case (9):
            case (10): {
                return smallSlip;
            }
        }
        return 0;
    }

    int getNewPosition() {
        int move = getMove();
        int currentPosition = position + move;
        if (currentPosition < 1) {
            position = 1;
            return 1;
        } else if (currentPosition > 70) {
            position = 70;
            return 70;
        } else {
            position = currentPosition;
            return currentPosition;
        }
    }
}
