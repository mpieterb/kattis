import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QwertyDvorakBjarki {

    public static void translate(Map<Character, Character> map, char[] toTranslate) {
        for (int i = 0; i < toTranslate.length; i++) {
            if (map.containsKey(toTranslate[i])) {
                toTranslate[i] = map.get(toTranslate[i]);
            }
        }
    }
   
    public static Map<Character, Character> createMap(char[] type1, char[] type2) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < type1.length; i++) {
            map.put(type1[i], type2[i]);
        }
        return map;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        sc.next();
        String type2 = sc.next();
        sc.nextLine();
        String str = sc.nextLine();
        sc.close();
        char[] charArray = str.toCharArray();

        char[] qwerty = {
            '~', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=',
            'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', '[', ']',
            'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';', '\'',
            'z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/'
        };

        char[] dvorak = {
            '~', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '[', ']',
            '\'', ',', '.', 'p', 'y', 'f', 'g', 'c', 'r', 'l', '/', '=',
            'a', 'o', 'e', 'u', 'i', 'd', 'h', 't', 'n', 's', '-',
            ';', 'q', 'j', 'k', 'x', 'b', 'm', 'w', 'v', 'z'
        };

        char[] bjarki = {
            '0', '2', '4', '8', '6', '1', '3', '5', '7', '9', '=', '-', '/',
            'b', 'j', 'a', 'r', 'k', 'i', 'g', 'u', 's', 't', '.', ',',
            'l', 'o', 'e', 'm', 'p', 'd', 'c', 'n', 'v', 'q', ';',
            '[', ']', 'y', 'z', 'h', 'w', 'f', 'x', '\'', '~'
        };

        Map<Character, Character> map = null;
        
            if (!type1.equals(type2)) {
                if (type1.equals("qwerty") && type2.equals("dvorak")) {
                    map = createMap(qwerty, dvorak);
                } else if (type1.equals("qwerty") && type2.equals("bjarki")) {
                    map = createMap(qwerty, bjarki);
                } else if (type1.equals("bjarki") && type2.equals("dvorak")) {
                    map = createMap(bjarki, dvorak);
                } else if (type1.equals("bjarki") && type2.equals("qwerty")) {
                    map = createMap(bjarki, qwerty);
                } else if (type1.equals("dvorak") && type2.equals("bjarki")) {
                    map = createMap(dvorak, bjarki);
                } else if (type1.equals("dvorak") && type2.equals("qwerty")) {
                    map = createMap(dvorak, qwerty);
                }
            } if (map != null) {
                translate(map, charArray);
            }
            String translated = new String(charArray);
            System.out.println(translated);
        }
}


