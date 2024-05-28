import java.util.Scanner;

public class ArrayDisplay_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of elements : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("enter element : ");
            arr[i] = input.nextInt();
        }

        displayArr(arr,0); //print all elements starting from index 0
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == arr.length) return;

        System.out.print(arr[idx]+" ");
        displayArr(arr, idx+1);
    }
}
