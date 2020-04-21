import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class fase3 {
    public static void main(String[] args) {
        List<Character> myname_list = new ArrayList<>();
        myname_list.add('f');
        myname_list.add('r');
        myname_list.add('a');
        myname_list.add('n');
        myname_list.add('c');
        myname_list.add('i');
        myname_list.add('s');
        myname_list.add('c');
        myname_list.add('o');
        HashMap<Character, Integer> myname_map = new HashMap<Character, Integer>();

        // Loop for assigning letters and occurrences to the map

        for (char letra : myname_list) {
            int occurrences = Collections.frequency(myname_list,letra);
            myname_map.put(letra, occurrences);
        }
        System.out.println(myname_map);

    }
}
