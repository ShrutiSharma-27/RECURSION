import java.util.Scanner;

public class ArrayReverseDisplay_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of elements : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("enter element : ");
            arr[i] = input.nextInt();
        }

        displayArrRev(arr,0); //print all elements in reverse order starting from last index till 0 index
    }

    public static void displayArrRev(int[] arr, int idx){
        if(idx == arr.length) return;

        displayArrRev(arr, idx+1);
        System.out.print(arr[idx]+" ");
    }
}
