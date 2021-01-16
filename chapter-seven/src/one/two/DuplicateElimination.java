package one.two;

import javax.swing.JOptionPane;

public class DuplicateElimination {

    private int[] numbers = new int[1];
    private int maxArrayIndex = 0;

    public void readNumbers() {
        for (int inputCount = 1; inputCount <= 5; inputCount++) {
            addNumber(inputNumber());
            System.out.println();
        }
    }

    private void increaseArraySizeAndAdd(int newInput) {
        int[] newArray = new int[maxArrayIndex + 1];

        /*for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }*/

        System.arraycopy(numbers, 0, newArray, 0, numbers.length);

        newArray[maxArrayIndex] = newInput;
        numbers = newArray;
    }

    private void printArray() {
        for (int number: numbers) {
            System.out.println(number);
        }
    }

    public boolean numberAlreadyAdded(int number) {
        for (int numberAlreadyRead : numbers) {
            if(number == numberAlreadyRead) {
                return true;
            }
        }
        return false;
    }

    public int inputNumber() {
        int input;
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        }
        while (inValidInput(input));
        return input;
    }

    public boolean inValidInput(int input) {
        return !(10 <= input && input <= 100);
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void addNumber(int number) {
        if(!numberAlreadyAdded(number)) {
            increaseArraySizeAndAdd(number);
            maxArrayIndex++;
        }
    }
}
