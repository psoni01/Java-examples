
import java.util.Random;

public class Tortoise {

    int position = 1;
    final int fastPlod = 3;
    final int slip = -6;
    final int slowPlod = 1;

    Random rand = new Random();

    int getMove() {
        int a = rand.nextInt((10 - 1) + 1) + 1;
        switch (a) {
            case (1):
            case (2):
            case (3):
            case (4):
            case (5): {
                return fastPlod;

            }
            case (6):

            case (7): {
                return slip;
            }
            case (8):
            case (9):
            case (10): {
                return slowPlod;
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
