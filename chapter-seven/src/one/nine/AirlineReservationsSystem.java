package one.nine;

import javax.swing.*;

public class AirlineReservationsSystem {

    private int userInput;
    private boolean[] seats;
    private int nextEconomySeat;
    private int nextFirstClassSeat;
    private int passengerSeatNumber;

    public AirlineReservationsSystem() {
        this.seats = new boolean[10];
        nextFirstClassSeat = 0;
        nextEconomySeat = 5;
    }

    public String getAlternatives() {
        return "Please type 1 for First Class\n" +
                "Please type 2 for Economy";
    }

    public int getUserInputWithJOptionPane() {
        return Integer.parseInt(JOptionPane.showInputDialog(getAlternatives()));
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int getUserInput() {
        return userInput;
    }

    public boolean assignSeat() {
        if(sectionIsNotFull()) {
            if(firstClassPassenger()) {
                seats[nextFirstClassSeat] = true;
                passengerSeatNumber = nextFirstClassSeat + 1;
                setNextFirstClassSeatIndex();
            }
            else {
                seats[nextEconomySeat] = true;
                passengerSeatNumber = nextEconomySeat + 1;
                setNextEconomySeatIndex();
            }
            return true;
        }
        return false;
    }

    private void setNextFirstClassSeatIndex() {
        if(sectionIsNotFull()) {
            nextFirstClassSeat++;
        }
    }

    private void setNextEconomySeatIndex() {
        if(sectionIsNotFull()) {
            nextEconomySeat++;
        }
    }

    private boolean firstClassPassenger() {
        return (userInput == 1);
    }

    private boolean sectionIsNotFull() {
        if(firstClassPassenger()) {
            for (int seatIndex = 0; seatIndex < seats.length / 2; seatIndex++) {
                if(!seats[seatIndex]) {
                    return true;
                }
            }
        } else {
            for (int seatIndex = 5; seatIndex < seats.length; seatIndex++) {
                if(!seats[seatIndex]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean[] getSeats() {
        return seats;
    }

    public int getPassengerSeatNumber() {
        return passengerSeatNumber;
    }

    public String getSection() {
        return firstClassPassenger() ? "First Class" : "Economy";
    }

    public String getAlternativeSectionOption() {
        String message = "is full, would you like to " +
                "be placed in";
        return getSection() + ' ' + message + ' ' +
                (firstClassPassenger() ? "Economy" : "First Class") + "?";
    }

    public void setAlternativeOption(int alternativeOption) {
        if(alternativeOption == 1) {
            switchUserOption();
        }
    }

    private void switchUserOption() {
        if(firstClassPassenger()) {
            userInput = 2;
        } else {
            userInput = 1;
        }
    }


    public String getNextFlightMessage() {
        return "Next flight leaves in 3 hours.";
    }
}
