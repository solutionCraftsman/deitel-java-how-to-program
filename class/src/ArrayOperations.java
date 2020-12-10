public class ArrayOperations {

    private int[] array;

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
        for (int arrayItem = 0; arrayItem < array.length; arrayItem++) {
            /*if(array[arrayItem] > array[arrayItem + 1]) {
                temp = array[arrayItem + 1];
                array[arrayItem + 1] = array[arrayItem];
                array[arrayItem] = temp;
            }*/

            for (int arrayItemInner = 0; arrayItemInner < arrayItem; arrayItemInner++) {
                if(array[arrayItem] < array[arrayItemInner]) {
                    temp = array[arrayItem];
                    array[arrayItem] = array[arrayItemInner];
                    array[arrayItemInner] = temp;
                }
            }
        }
    }

    public void printArray() {
        for (int arrayItem: array) {
            System.out.println(arrayItem);
        }
    }
}
