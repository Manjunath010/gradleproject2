public class test {


    public static void main(String[] arg){

      //  rev("text","second");

        m2("112451123451234669");
}

public static void rev( String... s) {

    String str = "My name is Manjunath";
    String reverse="";
    String words[]=str.split(" ");
    for( String word:words){

        StringBuffer sb = new StringBuffer();
        sb.append(word);
        sb.reverse();

        reverse=reverse+sb+" ";
    }

    System.out.println(reverse);
}

    public static void m1(String str){

        String words[]= str.split(" ");
        int length=words.length;

        String rev="";

        for (int i=(length-1);i>=0;i--){

            rev=rev+words[i];
        }

        System.out.println(rev);
    }


    public static void m2(String str){

        char[] ch=str.toCharArray();
        int a=0;
        int n=1;
        int count=0;
        for(char c:ch){
            if(c=='1'){
                count++;
            }

        }
        System.out.println(count);


    }

}
