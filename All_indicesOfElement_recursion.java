import java.util.Scanner;
import java.util.Arrays;

public class All_indicesOfElement_recursion {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of elements : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter element : ");
            arr[i] = input.nextInt();
        }

        System.out.print("which element's indices you want : ");
        int x = input.nextInt();

        System.out.println(Arrays.toString(all_indices(arr,x,0,0)));
    }

    public static int[] all_indices(int[] arr, int x, int idx, int fsf){ //fsf - no of times x is "found so far"
        if (idx == arr.length){
            return new int[fsf];
        }

        int[] i_arr; //extracted common part
        if (arr[idx] == x){
            i_arr = all_indices(arr,x, idx + 1, fsf + 1);
            i_arr[fsf] = idx;
        }
        else{
            i_arr = all_indices(arr,x,idx + 1, fsf);
        }
        return i_arr; //extracted common part
    }
}

// Output :

// enter no of elements : 6
// enter element : 21
// enter element : 22
// enter element : 22
// enter element : 21
// enter element : 22
// enter element : 32
// which element's indices you want : 22
// [1, 2, 4]
