import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class firstClass {

    public static void main(String[] args){
        System.out.println("hello World");
        reverse("Fountain");
        revStringBuffer("Dream");
        duplicate("Java is good but java is mandatory because java is base");
        duplicateChar("Java J2EE Java JSP J2EE");
    }

    public static void reverse(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    public static void revStringBuffer(String string){
        StringBuffer inputStr = new StringBuffer();
        inputStr.append(string);
        inputStr.reverse();
        System.out.println(inputStr);
    }

    public static void duplicate( String input){
        // create a HashMap
        Map<String, Integer> wordsCount = new HashMap<String, Integer>();
        //split
        String words[] =input.split(" ");

        for(String word:words){
            if(wordsCount.containsKey(word)) {
                wordsCount.put(word.toLowerCase(), wordsCount.get(word) + 1);
            }
            else{
                wordsCount.put(word, 1);
            }
        }

        //transverse the string

        Set<String> inputStr = wordsCount.keySet();

        for(String word:inputStr){
            if(wordsCount.get(word)>1)
            System.out.println(word+" - "+wordsCount.get(word));
        }
        System.out.println(words);
        System.out.println(wordsCount);

    }

    public static void duplicateChar( String input) {
        // create a HashMap
        Map<Character, Integer> wordsCount = new HashMap<>();
        //split
        char[] words = input.toCharArray();

        for (char word : words) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }

        //transverse the string

        Set<Character> inputStr = wordsCount.keySet();

        for (Character word : inputStr) {
            if (wordsCount.get(word) > 1)
                System.out.println(word + " - " + wordsCount.get(word));
        }
    }
}
