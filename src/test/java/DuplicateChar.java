import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

    public static void main(String args[]){
        duplicateCharacter("7mnbmjkilopjm7");
        duplicateWord("Java is great Java man is java is great");

    }

    public static void duplicateCharacter(String str ){
        int length = str.length();
        char[] ch =str.toCharArray();
        for (int i=0;i<length;i++){
            int count=1;

            for (int j=i+1;j<length;j++){
                if(ch[i]==ch[j] && ch[i]!=' '){
                    count++;
                    ch[j]='0';
                }
            }
            if(count>1 && ch[i]!='0'){
                System.out.println("Duplicate char is : "+ ch[i]+" -"+count);
            }
        }

    }


    public static void duplicateWord(String s){
        // Create a hashmap
        Map<String,Integer> wordCount = new HashMap<String,Integer>();
        // Conver to words array by spilt
        String words[] = s.split(" ");

        for (String word:words ){
            if(wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word)+1);
            }
            else{
                wordCount.put(word,1);
            }
        }
        // print the string
         Set<String> inputStr=wordCount.keySet();

        for (String word:inputStr){
            if(wordCount.get(word)>1){
                System.out.println(word +" - "+wordCount.get(word));
            }
        }
    }
}
