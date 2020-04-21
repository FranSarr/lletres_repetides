import java.util.ArrayList;
import java.util.List;

public class fase2 {
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
        // Loop for printing characters
        for (char letra : myname_list) {
           if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'|| letra == 'u') {
            System.out.println(letra + " es una VOCAL");}
           else {
               if (letra == '1' || letra == '2' || letra == '3' || letra == '4'|| letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9'|| letra == '0') {
                   System.out.println(letra + " person names do not include NUMBERS");}
               else { System.out.println(letra + " es una CONSONANT"); }
        }
    }
    }
}
