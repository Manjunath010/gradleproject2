public class ReverseWords {


    public static void main(String[] args){
        String str ="Manju is Great";
        String words[] =str.split(" ");
        String reverse = "";
        for(String w:words){
            StringBuffer sb = new StringBuffer();
            sb.append(w);
            sb.reverse();
            reverse = reverse+sb.toString()+" ";
        }
        System.out.println(reverse.trim());
    }
}
