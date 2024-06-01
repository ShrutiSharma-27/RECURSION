import java.util.Scanner;

public class LastOccurence_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of elements : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("enter element : ");
            arr[i] = input.nextInt();
        }

        System.out.print("which element's last index you want : ");
        int x = input.nextInt();

        System.out.println(lastIndex(arr,0, x));
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        //base case :
        if (idx == arr.length) return -1;

        int liisa = lastIndex(arr, idx + 1, x); //liisa - last index in smaller array
        if (liisa == -1) {
            if (arr[idx] == x) return idx;
            else return -1;
        } else return liisa;
    }
}

// Output :

// enter no of elements : 5
// enter element : 6
// enter element : 89
// enter element : 7
// enter element : 6
// enter element : 6
// which element's last index you want : 6
// 4
