public class test3 {

    public static void main(String[] arg) {
        m1("Manjunath");
        m2();

    }


    public static void m1(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);
        }

        System.out.println(rev);

    }

    public static void m2() {
        String Array1[] = {"One", "two", "three", "four", "five"};
        String Array2[] = {"five", "three", "eight"};
        int n = 0;
        //output [three,five]
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array2.length; j++) {
                if (Array1[i] == Array2[j]) {
                    n++;

                }
            }
        }

        String Dup[] = new String[n];
        int k=0;
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array2.length; j++) {
                if (Array1[i] == Array2[j]) {
                    Dup[k++] = Array1[i];
                }
            }

        }
        for (int i = 0; i < Dup.length; i++){
            System.out.println(Dup[i]);
        }



    }

}





