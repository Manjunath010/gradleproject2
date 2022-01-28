public class ArrayFunctions {

    public static void main(String args[]){
        System.out.println("Main Function");
        ArrayFunctions a = new ArrayFunctions();
       // a.sortArray();
//        test();
        secondHighest();
        m1();
    }

    public void sortArray(){

        int array[]= {10,9,22,8,7};
//        int[] array = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        int temp =0;

        for(int i=0;i<array.length;i++){
            for (int j=i+1;j< array.length;j++){

            if(array[i]>array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
            System.out.println(array[i]);

        }
    }

    public static void  secondHighest(){

        int high = 0;
        int secondHigh = 0;
        int arr[] ={10,7,8,22,3,9};
        for (int i=0;i<arr.length;i++){
            if(arr[i]>high){
                secondHigh = high;
                high = arr[i];

            }
            else if(arr[i]>secondHigh){
                secondHigh=arr[i];

            }

        }
        System.out.println(high);
        System.out.println(secondHigh);

    }

    public static void m1(){
        int a[] = {132,987,86,36};
        int high=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>high){
                high=a[i];
            }
        }
        System.out.println(high);

    }
}

