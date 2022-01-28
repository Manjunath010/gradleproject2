import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test4 {

    public static void main(String[] arg) {
        m1("My Name is Manjunath");


    }

    public static void  m1(String str){

        char ch[] = str.toCharArray();

        Map<Character,Integer> charCount = new HashMap<Character,Integer>();

        for (char c:ch){

            if (charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }
            else {
                charCount.put(c,1);
            }
        }

        Set<Character> inputChar = charCount.keySet();

        for (Character c:inputChar)

        {
            if(c!=' ') {
                System.out.println(c + " : " + charCount.get(c));
            }
        }

    }
}
