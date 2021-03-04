package sixteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PentaxCollectionsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void collectionsTest() {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();

//        List<String> list = new ArrayList<>(Arrays.asList(colors));

        for (String color: colors) {
            list.add(color);
        }

        assertEquals(5, list.size());

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>(Arrays.asList(removeColors));

        System.out.println("ArrayList: ");
        for (int count = 0; count < list.size(); count++)
            System.out.printf("%s ", list.get(count));

        /*list.removeIf(removeList::contains);*/

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            if(removeList.contains(iterator.next())) {
                iterator.remove();
            }
        }

        assertEquals(2, list.size());

        List je = new ArrayList();
        je.add(44);
        je.add("fef");
        System.out.println();
        System.out.println(je.get(0));
        System.out.println(je.get(1));
    }

    @Test
    void pentaxTest() {
        SortedSet<String> lasuites = new TreeSet<>();
        lasuites.add("Mr. 10%");
        lasuites.add("Dimeji");
        lasuites.add("Chijioke");
        assertTrue(lasuites.size() == 3);

        lasuites.add("Chijioke");
        assertTrue(lasuites.size() == 3);

        Iterator<String> wimps = lasuites.iterator();

        while (wimps.hasNext())
            System.out.println(wimps.next());

        String name = lasuites.first();
        assertTrue(name.equals("Chijioke"));

        name = lasuites.last();
        assertTrue(name.equals("Mr. 10%"));

        lasuites.remove("Mr. 10%");
        assertTrue(lasuites.size() == 2);
    }

    @Test
    void pentaxMap() {
        Map<String, String> pentaxGees = new HashMap<>();
        pentaxGees.put("SCV5001", "Dami");
        pentaxGees.put("SCV5010", "Kenny");
        pentaxGees.put("SCV5020", "Peter");
        pentaxGees.put("SCV5001", "Badmus");
        pentaxGees.put("SCV5012", "Sunkanmi");
        pentaxGees.put("SK", "Sunkanmi");

        assertTrue(pentaxGees.containsKey("SCV5020"));

        Set<String> pentaxIds = pentaxGees.keySet();

        assertTrue(pentaxGees.size() == 5);
        Iterator<String> keys = pentaxIds.iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = pentaxGees.get(key);
            System.out.println(key + " is mapped to " + value);
        }

        Collection<String> values = pentaxGees.values();
        for(String value: values) {
            System.out.println(value);
        }

        pentaxGees.clear();
        assertTrue(pentaxGees.isEmpty());

        String[] idArray = pentaxGees.values().toArray(new String[0]);
        Set<String> ids = Set.of(idArray);
        List<String> idList = List.of(idArray);
    }
}