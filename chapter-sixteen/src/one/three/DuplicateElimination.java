package one.three;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElimination {

    public static String[] readFirstNames_array(String... firstNames) {
        String[] arrayOfFirstNames = {firstNames[0]};
        String[] tempArray;
        for(String firstName_1 : firstNames) {
            for(String firstName_2 : arrayOfFirstNames) {
                if(firstName_1.equals(firstName_2)) {
                    break;
                }
                else {
                    tempArray = arrayOfFirstNames;
                    arrayOfFirstNames = new String[tempArray.length + 1];

                    for (int i = 0; i < tempArray.length; i++) {
                        arrayOfFirstNames[i] = tempArray[i];
                    }

                    /*System.arraycopy(tempArray, 0, arrayOfFirstNames, 0, tempArray.length);*/

                    arrayOfFirstNames[tempArray.length] = firstName_1;
                }
            }
        }

        return arrayOfFirstNames;
    }

    public static String[] readFirstNames_set(String... firstNames) {
        /*Set<String> firstNames_set = new TreeSet<>(Arrays.asList(firstNames));*/

        Set<String> firstNames_set = new TreeSet<>();

        for(String firstName: firstNames) {
            firstNames_set.add(firstName);
        }

        return firstNames_set.toArray(new String[0]);
    }
}
