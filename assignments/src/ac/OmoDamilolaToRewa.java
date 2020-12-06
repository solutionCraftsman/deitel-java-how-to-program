package ac;

import java.util.Scanner;

public class OmoDamilolaToRewa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AirConditioner ac = new AirConditioner("LG, Life is Good!");      

        System.out.printf("AC is on: %b%n", ac.isOn());
        System.out.printf("Temperature: %d%n%n", ac.getTemperature());
        
        System.out.print("To turn on, press 1: ");
        int choice = input.nextInt();

        if(choice == 1) {
            ac.setOn(true);
            
            System.out.println();            

            System.out.print("Set initial temperature (16 degrees - 30 degrees): ");
            choice = input.nextInt();
            ac.setTemperature(choice);              

            System.out.printf("AC is on: %b%n", ac.isOn());
            System.out.printf("Temperature: %d%n%n", ac.getTemperature());

            System.out.println("1. Turn off");
            System.out.println("2. Decrease temperature");
            System.out.println("3. Increase temperature");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if(choice == 1) {
                ac.setOn(false);
            }

            if(choice == 2) {
                ac.decreaseTemperature();                
            }

            if(choice == 3) {
                ac.increaseTemperature();                
            }

            System.out.println();

            System.out.printf("AC is on: %b%n", ac.isOn());
            System.out.printf("Temperature: %d%n%n", ac.getTemperature());            
                      
        }      
  

        
        
    }

}