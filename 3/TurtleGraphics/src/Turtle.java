
import java.util.Scanner;

public class Turtle {

    boolean isPenDown;
    int[][] floor = new int[20][20];
    int xPosition;
    int yPosition;
    int direction; // 1-north, 2- east, 3-south, 4-west

    Turtle() {
        isPenDown = false;
        xPosition = 0;
        yPosition = 0;
        direction = 2;
        for (int[] floor1 : floor) {
            for (int j = 0; j < floor1.length; j++) {
                floor1[j] = 0;
            }
        }
    }

    Scanner input = new Scanner(System.in);

    public void setDirection(String side) {
        if ("right".equals(side)) {
            if (direction == 4) {
                direction = 1;
            } else {
                direction++;
            }
        } else {
            if (direction == 1) {
                direction = 4;
            } else {
                direction--;
            }
        }
    }

    public void moveForward(int numOfSteps) {
        switch (direction) {
            case 1: {
                if (xPosition - numOfSteps < 0) {
                    System.out.println("Can't go out of the screen");
                } else {
                    if (isPenDown) {
                        for (int j = xPosition; j >= xPosition - numOfSteps; j--) {
                            floor[j][yPosition] = 1;
                        }
                    }
                    xPosition -= numOfSteps;
//                    System.out.printf("Current Position: (%d,%d)%n", xPosition, yPosition);
                }
                break;
            }
            case 2: {
                if (yPosition + numOfSteps > 19) {
                    System.out.println("Can't go out of the screen");
                } else {
                    if (isPenDown) {
                        for (int j = yPosition; j <= yPosition + numOfSteps; j++) {
                            floor[xPosition][j] = 1;
                        }
                    }
                    yPosition += numOfSteps;
//                    System.out.printf("Current Position: (%d,%d)%n", xPosition, yPosition);
                }
                break;
            }
            case 3: {
                if (xPosition + numOfSteps > 19) {
                    System.out.println("Can't go out of the screen");
                } else {
                    if (isPenDown) {
                        for (int j = xPosition; j <= xPosition + numOfSteps; j++) {
                            floor[j][yPosition] = 1;
                        }
                    }
                    xPosition += numOfSteps;
//                    System.out.printf("Current Position: (%d,%d)%n", xPosition, yPosition);
                }
                break;
            }
            case 4: {
                if (yPosition - numOfSteps < 0) {
                    System.out.println("Can't go out of the screen");
                } else {
                    if (isPenDown) {
                        for (int j = yPosition; j >= yPosition - numOfSteps; j--) {
                            floor[xPosition][j] = 1;
                        }
                    }
                    yPosition -= numOfSteps;
//                    System.out.printf("Current Position: (%d,%d)%n", xPosition, yPosition);
                }
                break;
            }
        }
    }

    public void displayFloor() {
        for (int[] floor1 : floor) {

            for (int j = 0; j < floor1.length; j++) {
                if (floor1[j] != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void executeCommand(int a) {
        switch (a) {
            case 1: {
                isPenDown = false;
                break;
            }
            case 2: {
                isPenDown = true;
                break;
            }
            case 3: {
                setDirection("right");
                break;
            }
            case 4: {
                setDirection("left");
                break;
            }
            case 5: {
                System.out.print("Enter forward spaces:");
                int steps = input.nextInt();
                moveForward(steps);
                break;
            }
            case 6: {
                displayFloor();
                break;
            }
        }

//        switch (direction) {
//            case 1: {
//                System.out.printf("North with pen %b%n", isPenDown);
//                break;
//            }
//            case 2: {
//                System.out.printf("East with pen %b%n", isPenDown);
//                break;
//            }
//            case 3: {
//                System.out.printf("South with pen %b%n", isPenDown);
//                break;
//            }
//            case 4: {
//                System.out.printf("West with pen %b%n", isPenDown);
//                break;
//            }
//        }
    }
}
