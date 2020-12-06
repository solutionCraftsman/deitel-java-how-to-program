package tv;

import java.util.Scanner;

public class TelevisionSetTest {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        TelevisionSet tv = new TelevisionSet("Fresh Teevee!");
        System.out.println(tv.getName() + " unboxxeedd .. as e dey fresh!");

        int choice;

        tv.printDetails();

        while (true) {
            if(tv.isOn()) {
                System.out.println("1. Set Volume\n" +
                                    "2. Increase Volume\n" +
                                    "3. Decrease Volume\n" +
                                    "4. Set Channel\n" +
                                    "5. Next Channel\n" +
                                    "6. Previous Channel\n" +
                                    "7. Turn Off TV\n" +
                                    "8. End Program\n");
                choice = userInput.nextInt();
                if(choice == 1) {
                    System.out.println("Enter Volume (0 - 100): ");
                    tv.setVolume(userInput.nextInt());
                } else if(choice == 2) {
                    tv.increaseVolume();
                } else if(choice == 3) {
                    tv.decreaseVolume();
                } else if(choice == 4) {
                    System.out.println("Enter Channel (1 - 1000): ");
                    tv.setChannel(userInput.nextInt());
                } else if(choice == 5) {
                    tv.nextChannel();
                } else if(choice == 6) {
                    tv.previousChannel();
                } else if(choice == 7) {
                    tv.setOn(false);
                } else if(choice == 8) {
                    break;
                } else {
                    System.out.println("Invalid option ogbeni .. ");
                }

            } else {
                System.out.println("1. Turn on\n" +
                                    "2. End Program\n");
                choice = userInput.nextInt();

                if(choice == 1) {
                    tv.setOn(true);
                } else if (choice == 2) {
                    break;
                }
                else {
                    System.out.println("Invalid option ogbeni .. ");
                }

            }

            tv.printDetails();
        }

    }

}
