public class ReverseString {

    public static void main(String args[]) {
        reverse("Subject");
        hillPattern2(5);
        reverseWords("Manju is Great");
    }

    public static void reverse(String str) {

        String b = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            b = b + str.charAt(i);
        }
        System.out.println(b);
    }

    public static void reverseWords(String str){
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

    public static void starPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    public static void starPattern2(int size) {
        for (int i = 1; i < size; i++) {
            /*int star=(n*2)-1;
            int space=0;
            for (int j=0; j<space; j++)
            {
                // printing spaces
                System.out.print("*");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<star; j++ )
            {
                // printing stars
                System.out.print(" ");
            }
            space++;
            star=star-2;

            // ending line after each row
            System.out.println();
        }*/
        }
        int m, n;

        // Outer loop fo Rows
        for (m = 1; m <= size; m++) {

            // Inner loop 1 to print triangle 3
            for (n = 1; n < m; n++) {

                // Printing whitespace
                System.out.print(" ");
            }

            // Inner loop 2 to print triangle 4
            for (n = m; n <= size; n++) {

                // Printing star and whitespace
                System.out.print("*" + " ");
            }

            // By now done with one row so new line
            System.out.println();
        }
    }

    public static void hillPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n-1;j++){
                System.out.print("* ");
            }
            for (int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hillPattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i-1;j++){
                System.out.print("* ");
            }
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
