public class PrintingPatterns {

    public static void main(String[] a){
        numberPattern(5);
    }

    public static void numberPattern(int n){
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j);
                a++;
            }
            System.out.println();
        }
    }
}
