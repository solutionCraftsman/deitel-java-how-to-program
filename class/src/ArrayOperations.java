import java.util.Scanner;

public class ArrayOperations {

    private int[] array;

    /*public static void main(String[] args) {
        int[] array = {4,5,6,7};
        ArrayOperations arrayOperations = new ArrayOperations(array);
        System.out.println(arrayOperations);
    }

    @Override
    public String toString() {
        String arrayString = "";
        for (int arrayItem: array) {
            arrayString += arrayItem + " ";
        }
        return arrayString;
    }*/

    public ArrayOperations(int[] array) {
        this.array = array;
    }

    public int getSum() {
        int sum = 0;
        for (int arrayElementCounter = 0; arrayElementCounter < array.length; arrayElementCounter++) {
            sum += array[arrayElementCounter];
        }
        return sum;
    }

    public int computeSum(int[] array) {
        int sum = 0;
        for (int arrayElementCounter = 0; arrayElementCounter < array.length; arrayElementCounter++) {
            sum += array[arrayElementCounter];
        }
        return sum;
    }

    public double getAverage() {
        return (double) getSum() / array.length;
    }

    public int getMinimumElement() {
        int minimum = array[0];
        for (int arrayElementCounter = 1; arrayElementCounter < array.length; arrayElementCounter++) {
            if (array[arrayElementCounter] < minimum) {
                minimum = array[arrayElementCounter];
            }
        }
        return minimum;
    }

    public int getMaximumElement() {
        int maximum = array[0];
        for (int arrayElementCounter = 1; arrayElementCounter < array.length; arrayElementCounter++) {
            if (array[arrayElementCounter] > maximum) {
                maximum = array[arrayElementCounter];
            }
        }
        return maximum;
    }

    public int getMinimumPossibleSum() {
        int minimumSum = Integer.MAX_VALUE;
        int sum;
        int tempElement;

        for (int elementCounter = 0; elementCounter < array.length; elementCounter++) {
            tempElement = array[elementCounter];
            array[elementCounter] = 0;
            sum = computeSum(array);

            if (sum < minimumSum) {
                minimumSum = sum;
            }

            array[elementCounter] = tempElement;
        }

        return minimumSum;
    }

    public int getMaximumPossibleSum() {
        //return getSum() - getMinimumElement();
        int maximumSum = Integer.MIN_VALUE;
        int sum;
        int tempElement;

        for (int elementCounter = 0; elementCounter < array.length; elementCounter++) {
            tempElement = array[elementCounter];
            array[elementCounter] = 0;
            sum = computeSum(array);

            if (sum > maximumSum) {
                maximumSum = sum;
            }

            array[elementCounter] = tempElement;
        }

        return maximumSum;
    }


    public int getItemInArray(int elementPosition) {
        return array[elementPosition];
    }

    public int[] getArray() {
        return array;
    }

    public void sort() {
        int temp;
        for (int index = 0; index < array.length; index++) {

            /*if(array[arrayItem] > array[arrayItem + 1]) {
                temp = array[arrayItem + 1];
                array[arrayItem + 1] = array[arrayItem];
                array[arrayItem] = temp;
            }*/

            for (int secondIndex = 0; secondIndex < index; secondIndex++) {
                if(array[index] < array[secondIndex]) {
                    temp = array[index];
                    array[index] = array[secondIndex];
                    array[secondIndex] = temp;
                }
            }
        }
    }

    public void printArray() {
        System.out.println(printArrayP());
    }

    private String printArrayP() {
        String arrayString = "";
        for (int arrayItem: array) {
            arrayString += arrayItem + " ";
        }
        return arrayString;
    }
}
