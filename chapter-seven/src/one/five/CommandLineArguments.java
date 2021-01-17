package one.five;

public class CommandLineArguments {
    public static void main(String... args) {
        // declare variable array and initialize it with an array object
        int length;

        try {
            length = (!args[0].isEmpty()) ? Integer.parseInt(args[0]) : 10;
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            length = 10;
        }

        int[] array = new int[length]; // create the array object

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);

    }
}

// Fig. 7.2: InitArray.java
// Initializing the elements of an array to default values of zero.

class InitArray {
    public static void main(String[] args) {
        // declare variable array and initialize it with an array object
        int[] array = new int[10]; // create the array object

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);

    }
}// end class InitArray
