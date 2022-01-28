public class NoOfDigits {

    public static void main(String[] args){

        String str = "Manju123";
        int digits = 0;
        String digitsValue="";
        int alpha = 0;
        String alphaValue="";

        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9')
            {
                digits++;
                digitsValue+=ch;
            }
            else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                alpha++;
                alphaValue+=ch;
            }
        }
        System.out.println(digits);
        System.out.println(digitsValue);
        System.out.println(alpha);
        System.out.println(alphaValue);
    }
}
