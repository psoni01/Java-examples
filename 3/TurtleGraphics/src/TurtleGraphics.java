
import java.util.Scanner;

public class TurtleGraphics {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter command (9 to end input):");
        int choice = in.nextInt();
        while (choice != 9) {
            turtle.executeCommand(choice);
            System.out.print("Enter command (9 to end input):");
            choice = in.nextInt();
        }
    }

}
