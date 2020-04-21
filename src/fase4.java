import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class fase4 {
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
        List<Character> mysurname_list = new ArrayList<>();
        mysurname_list.add('s');
        mysurname_list.add('a');
        mysurname_list.add('r');
        mysurname_list.add('r');
        mysurname_list.add('i');
        mysurname_list.add('a');
        mysurname_list.add('s');
        List<Character> space_list = new ArrayList<>();
        space_list.add(' ');
        List<Character> fullname_list = new ArrayList<>();

        myname_list.addAll (space_list);
        fullname_list = myname_list;
        fullname_list.addAll(mysurname_list);

        System.out.println(fullname_list);



    }
}
