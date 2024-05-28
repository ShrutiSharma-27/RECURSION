import java.util.Scanner;

public class MaxArray_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of elements : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("enter element : ");
            arr[i] = input.nextInt();
        }

        System.out.println(maxArr(arr,0));
    }

    public static int maxArr(int[] arr, int idx){
        if (idx==arr.length-1) return arr[idx]; //because we need at least 1 index in array after idx so that a comparison can be made between smaller array (starting from idx+1) and a single element (at idx)

        int misa = maxArr(arr, idx+1); //misa : max in smaller array

        if (misa > arr[idx]) return misa;
        else return arr[idx];
    }
}
