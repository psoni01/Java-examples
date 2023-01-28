/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Parthkumar Soni
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean[] seats = {false, false, false, false, false, false, false, false, false, false};
        int count = 0;
        while (count < 10) {
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            System.out.print("choice: ");
            int choice = input.nextInt();
            if (choice == 1) {
                if (!seats[4]) {
                    for (int i = 0; i < 5; i++) {
                        if (!seats[i]) {
                            seats[i] = true;
                            System.out.printf("First Class, Seat #%d%n%n", i + 1);

                            count++;
                            break;
                        }
                    }
                } else if (!seats[9]) {
                    System.out.println("First Class is full, Economy class?");
                    System.out.print("1. Yes, 2. No. Your choice: ");
                    int change = input.nextInt();
                    if (change == 1) {
                        for (int i = 5; i < 10; i++) {
                            if (!seats[i]) {
                                seats[i] = true;
                                System.out.printf("Economy Class, Seat #%d%n%n", i + 1);

                                count++;
                                break;
                            }
                        }
                    } else if (change == 2) {
                        System.out.println("Next flight leaves in 3 hours");
                        System.out.println();
                    }
                }

            } else if (choice == 2) {
                if (!seats[9]) {
                    for (int i = 5; i < 10; i++) {
                        if (!seats[i]) {
                            seats[i] = true;
                            System.out.printf("Economy Class, Seat #%d%n%n", i + 1);

                            count++;
                            break;
                        }
                    }
                } else if (!seats[4]) {
                    System.out.println("Economy Class is full, First class?");
                    System.out.print("1. Yes, 2. No. Your choice: ");
                    int change = input.nextInt();
                    if (change == 1) {
                        for (int i = 0; i < 5; i++) {
                            if (!seats[i]) {
                                seats[i] = true;
                                System.out.printf("First Class, Seat #%d%n%n", i + 1);

                                count++;
                                break;
                            }
                        }
                    } else if (change == 2) {

                        System.out.println("Next flight leaves in 3 hours");
                        System.out.println();
                    }
                }

            } else {
                System.out.println("Please enter a valid choise");
                System.out.println();
            }
        }
        System.out.println("The plane is now full.");
    }

}
